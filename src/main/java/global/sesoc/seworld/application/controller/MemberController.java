package global.sesoc.seworld.application.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import global.sesoc.seworld.dao.CalendarRepository;
import global.sesoc.seworld.dao.MemberRepository;
import global.sesoc.seworld.dao.WishingRepository;
import global.sesoc.seworld.dto.Calendar;
import global.sesoc.seworld.dto.Exhibition;
import global.sesoc.seworld.dto.Member;
import global.sesoc.seworld.dto.Wishing;
import global.sesoc.seworld.util.MailHandler;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MemberController {

	private final JavaMailSender mailSender;

	private final MemberRepository memberRepository;

	private final WishingRepository wishingRepository;

	private final CalendarRepository calendarRepository;
	
	@GetMapping(value = "/login")
	public String login() {
		return "member/login";
	}

	@PostMapping(value = "/login")
	public String login(Member searchMember, boolean saveid, HttpServletResponse response, HttpSession session,
			Model model) {
		log.info("[/login]");
		final Member loginMember = memberRepository.selectOneMember(searchMember.getMemberId());
		if (loginMember != null) {
			session.setAttribute("loginId", loginMember.getMemberId());
			session.setAttribute("loginName", loginMember.getMemberName());
			// 쿠키 처리
			if (saveid) {
				Cookie idCookie = new Cookie("saveid", searchMember.getMemberId());
				Cookie pwCookie = new Cookie("savepw", searchMember.getMemberPwd());
				idCookie.setMaxAge(60 * 60 * 24);
				pwCookie.setMaxAge(60 * 60 * 24);
				response.addCookie(idCookie);
				response.addCookie(pwCookie);
			} else {
				Cookie idCookie = new Cookie("saveid", null);
				Cookie pwCookie = new Cookie("savepw", null);
				idCookie.setMaxAge(0);
				pwCookie.setMaxAge(0);
				response.addCookie(idCookie);
				response.addCookie(pwCookie);
			}
			return "redirect:/";
		} else {
			model.addAttribute("message", "*ID/PW 오류");
			return "member/login";
		}
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		log.info("[/logout]");
		session.invalidate();
		return "redirect:/";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup() {
		return "member/signup";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public @ResponseBody Integer signup(@RequestBody Member signupMember)
			throws MessagingException, UnsupportedEncodingException {
		log.info("[/signup]");
		log.info(signupMember.toString());
		int result = memberRepository.insertOneMember(signupMember);
		if (result == 1) {
			MailHandler sendMail = new MailHandler(mailSender);
			sendMail.setSubject("[SE World] 이메일을 인증해주세요.");
			sendMail.setText(new StringBuffer().append("<h1>SE World</h1>")
					.append(signupMember.getMemberName() + "님의 이메일 주소를 인증해 주세요.").append("<hr/>")
					.append("SE World의 모든 기능을 사용하시기 위해 이메일 인증이 필요합니다.<br/>")
					.append("아래 링크를 눌러 이메일 인증을 완료해주세요.<br/><br/>")
					.append("<a href='http://localhost:8888/seworld/verify.do?email=" + signupMember.getMemberId())
					.append("' target='_blenk'>이메일 인증 확인</a><br/>")
					.append("Copyright © 2018 SE World, Inc. All rights reserved.<br/>").toString());
			sendMail.setFrom("do-not-reply@seworld.com", "SE WORLD");
			sendMail.setTo(signupMember.getMemberId());
			sendMail.send();
		}
		return result;
	}

	@RequestMapping(value = "/verifyBefore", method = RequestMethod.GET)
	public String verifyBefore() {
		return "member/verifyBefore";
	}

	@RequestMapping(value = "/verify.do", method = RequestMethod.GET)
	public String verify(@RequestParam String email) {
		log.info("[/verify]");
		int result = memberRepository.verifyMember(email);
		if (result == 0) {
			return "member/verifyError";
		}
		return "member/verifyAfter";
	}

	@RequestMapping(value = "/googleSignin", method = RequestMethod.POST)
	public @ResponseBody Integer googleSignin(@RequestBody Member signinMember, HttpSession session) {
		log.info("[/googleSignin]");
		Member m = memberRepository.selectOneMember(signinMember.getMemberId());
		if (m == null) {
			return 0; // 회원정보 없음
		}
		session.setAttribute("loginId", signinMember.getMemberId());
		session.setAttribute("loginName", signinMember.getMemberName());
		return 1; // 로그인 성공
	}

	@RequestMapping(value = "/facebookSignin", method = RequestMethod.POST)
	public @ResponseBody Integer facebookSignin(@RequestBody Member signinMember, HttpSession session) {
		log.info("[/facebookSignin]");
		Member m = memberRepository.selectOneMember(signinMember.getMemberId());
		if (m == null) {
			return 0; // 회원정보 없음
		}
		session.setAttribute("loginId", signinMember.getMemberId());
		session.setAttribute("loginName", signinMember.getMemberName());
		return 1; // 로그인 성공
	}

	@RequestMapping(value = "/googleSignup", method = RequestMethod.POST)
	public @ResponseBody Integer googleSignup(@RequestBody Member signupMember) {
		log.info("[/googleSignup]");
		Member m = memberRepository.selectOneMember(signupMember.getMemberId());
		if (m != null) {
			return 0; // 이미 회원가입 됨
		}
		return memberRepository.registerGoogleMember(signupMember); // 회원 등록
	}

	@RequestMapping(value = "/facebookSignup", method = RequestMethod.POST)
	public @ResponseBody Integer facebookSignup(@RequestBody Member signupMember) {
		log.info("[/facebookSignup]");
		Member m = memberRepository.selectOneMember(signupMember.getMemberId());
		if (m != null) {
			return 0; // 이미 회원가입 됨
		}
		return memberRepository.registerFacebookMember(signupMember); // 회원 등록
	}

	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
	public String gocalendar() {
		log.info("[/calendar]");
		return "member/calendar";
	}
	//캘린더 리슷 띄우기
	@RequestMapping(value = "/gocalendar", method = RequestMethod.POST)
	public @ResponseBody List<Exhibition> calendar(HttpSession session) {
		log.info("[/gocalendar]");
		List<Exhibition> list;
		Wishing wishing = new Wishing();
		String loginId = (String) session.getAttribute("loginId");
		wishing.setMemberId(loginId);
		System.out.println("wishing:" + wishing);
		list = wishingRepository.selectAllWishing(wishing);
		System.out.println(list + "리슷");
		return list;
	}

	@RequestMapping(value = "/calendarTest", method = RequestMethod.GET)
	public String calendarTest() {
		return "member/calendarTest";
	}

	@RequestMapping(value = "/calendarTest", method = RequestMethod.POST)
	public @ResponseBody Integer insertcalendarTest(Wishing wishing) {
		log.info("[/calendarTest]");
		int result = wishingRepository.insertOneWishing(wishing);
		return result;
	}
	
	@RequestMapping(value = "/insertcalendar", method = RequestMethod.POST)
	public @ResponseBody Integer insertcalendar(@RequestBody Calendar calendar) {
		System.out.println(calendar);
		int result = calendarRepository.insertCalendar(calendar);
		System.out.println("등록되나? "+result);
		return result;
	}
	
	@RequestMapping(value = "/selectallcalendar", method = RequestMethod.POST)
	public @ResponseBody List<Calendar> selectallcanlendar(@RequestBody Calendar calendar) {
		List<Calendar> listCalendar;
		System.out.println("멤버 보깅보깅"+calendar);
		listCalendar = calendarRepository.selectAllCalendars(calendar);
		System.out.println("사용자가 등록한 캘린더 보깅보깅"+listCalendar);
		//System.out.println("등록되나? "+result);
		return listCalendar;
	}
}
