package global.sesoc.seworld.application.controller;

import global.sesoc.seworld.domain.dao.CalendarRepository;
import global.sesoc.seworld.domain.dao.MemberRepository;
import global.sesoc.seworld.domain.dao.WishingRepository;
import global.sesoc.seworld.domain.dto.Calendar;
import global.sesoc.seworld.domain.dto.Exhibition;
import global.sesoc.seworld.domain.dto.Member;
import global.sesoc.seworld.domain.dto.Wishing;
import global.sesoc.seworld.util.MailHandler;
import global.sesoc.seworld.util.RedirectUtil;
import global.sesoc.seworld.util.SessionAttributeSupplier;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Slf4j
@Controller
@Transactional
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
    public String login(final Member searchMember, final boolean saveid, final HttpServletResponse response, final HttpSession session,
                        final Model model) {
        log.info("[/login]");
        final Member loginMember = memberRepository.selectOneMember(searchMember.getMemberId());
        if (loginMember != null) {
            session.setAttribute("loginId", loginMember.getMemberId());
            session.setAttribute("loginName", loginMember.getMemberName());
            // 쿠키 처리
            final Cookie idCookie;
            final Cookie pwCookie;
            if (saveid) {
                idCookie = new Cookie("saveid", searchMember.getMemberId());
                pwCookie = new Cookie("savepw", searchMember.getMemberPwd());
                idCookie.setMaxAge(60 * 60 * 24);
                pwCookie.setMaxAge(60 * 60 * 24);
            } else {
                idCookie = new Cookie("saveid", null);
                pwCookie = new Cookie("savepw", null);
                idCookie.setMaxAge(0);
                pwCookie.setMaxAge(0);
            }
            response.addCookie(idCookie);
            response.addCookie(pwCookie);
            return RedirectUtil.redirectToHome();
        } else {
            model.addAttribute("message", "*ID/PW 오류");
            return "member/login";
        }
    }

    @GetMapping(value = "/logout")
    public String logout(final HttpSession session) {
        log.info("[/logout]");
        session.invalidate();
        return RedirectUtil.redirectToHome();
    }

    @GetMapping(value = "/signup")
    public String signup() {
        return "member/signup";
    }

    @PostMapping(value = "/signup")
    public @ResponseBody
    Integer signup(@RequestBody final Member signupMember) {
        log.info("[/signup]");
        log.info(signupMember.toString());
        int result = memberRepository.insertOneMember(signupMember);
        if (result == 1) {
            final MailHandler sendMail;
            try {
                sendMail = new MailHandler(mailSender);
                sendMail.setSubject("[SE World] 이메일을 인증해주세요.");
                sendMail.setText(new StringBuilder().append("<h1>SE World</h1>")
                        .append(signupMember.getMemberName() + "님의 이메일 주소를 인증해 주세요.").append("<hr/>")
                        .append("SE World의 모든 기능을 사용하시기 위해 이메일 인증이 필요합니다.<br/>")
                        .append("아래 링크를 눌러 이메일 인증을 완료해주세요.<br/><br/>")
                        .append("<a href='http://localhost:8888/seworld/verify.do?email=" + signupMember.getMemberId())
                        .append("' target='_blenk'>이메일 인증 확인</a><br/>")
                        .append("Copyright © 2018 SE World, Inc. All rights reserved.<br/>").toString());
                sendMail.setFrom("do-not-reply@seworld.com", "SE WORLD");
                sendMail.setTo(signupMember.getMemberId());
                sendMail.send();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    @GetMapping(value = "/verifyBefore")
    public String verifyBefore() {
        return "member/verifyBefore";
    }

    @PostMapping(value = "/verify.do")
    public String verify(@RequestParam final String email) {
        log.info("[/verify]");
        if (memberRepository.verifyMember(email) == 0) {
            return "member/verifyError";
        }
        return "member/verifyAfter";
    }

    @PostMapping(value = "/googleSignin")
    public @ResponseBody
    Integer googleSignin(@RequestBody final Member signinMember, final HttpSession session) {
        log.info("[/googleSignin]");
        if (isMemberExists(signinMember)) {
            return 0; // 이미 회원가입 됨
        }
        session.setAttribute("loginId", signinMember.getMemberId());
        session.setAttribute("loginName", signinMember.getMemberName());
        return 1; // 로그인 성공
    }

    @PostMapping(value = "/facebookSignin")
    public @ResponseBody
    Integer facebookSignin(@RequestBody final Member signinMember, final HttpSession session) {
        log.info("[/facebookSignin]");
        if (isMemberExists(signinMember)) {
            return 0; // 이미 회원가입 됨
        }
        session.setAttribute("loginId", signinMember.getMemberId());
        session.setAttribute("loginName", signinMember.getMemberName());
        return 1; // 로그인 성공
    }

    @PostMapping(value = "/googleSignup")
    public @ResponseBody
    Integer googleSignup(@RequestBody final Member signupMember) {
        log.info("[/googleSignup]");
        if (isMemberExists(signupMember)) {
            return 0; // 이미 회원가입 됨
        }
        return memberRepository.registerGoogleMember(signupMember); // 회원 등록
    }

    @PostMapping(value = "/facebookSignup")
    public @ResponseBody
    Integer facebookSignup(@RequestBody final Member signupMember) {
        log.info("[/facebookSignup]");
        if (isMemberExists(signupMember)) {
            return 0; // 이미 회원가입 됨
        }
        return memberRepository.registerFacebookMember(signupMember); // 회원 등록
    }

    @GetMapping(value = "/calendar")
    public String gocalendar() {
        log.info("[/calendar]");
        return "member/calendar";
    }

    //캘린더 리슷 띄우기
    @PostMapping(value = "/gocalendar")
    public @ResponseBody
    List<Exhibition> calendar(final HttpSession session) {
        log.info("[/gocalendar]");
        final Wishing wishing = new Wishing();
        final String userId = SessionAttributeSupplier.getLoginId(session);
        wishing.setMemberId(userId);
        return wishingRepository.selectAllWishing(wishing);
    }

    @GetMapping(value = "/calendarTest")
    public String calendarTest() {
        return "member/calendarTest";
    }

    @PostMapping(value = "/calendarTest")
    public @ResponseBody
    Integer insertcalendarTest(final Wishing wishing) {
        log.info("[/calendarTest]");
        int result = wishingRepository.insertOneWishing(wishing);
        return result;
    }

    @PostMapping(value = "/insertcalendar")
    public @ResponseBody
    Integer insertcalendar(@RequestBody final Calendar calendar) {
        return calendarRepository.insertCalendar(calendar);
    }

    @PostMapping(value = "/selectallcalendar")
    public @ResponseBody
    List<Calendar> selectallcanlendar(@RequestBody final Calendar calendar) {
        return calendarRepository.selectAllCalendars(calendar);
    }

    private boolean isMemberExists(final Member signupMember) {
        return memberRepository.selectOneMember(signupMember.getMemberId()) != null;
    }
}
