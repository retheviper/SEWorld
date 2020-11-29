package global.sesoc.seworld;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import global.sesoc.seworld.dao.FollowshipRepository;
import global.sesoc.seworld.dao.MemberDetailRepository;
import global.sesoc.seworld.dao.MemberRepository;
import global.sesoc.seworld.dao.TimelineRepository;
import global.sesoc.seworld.dto.Followship;
import global.sesoc.seworld.dto.Member;
import global.sesoc.seworld.dto.MemberDetail;
import global.sesoc.seworld.dto.Timeline;

@Controller
public class MemberDetailController {
	private static final Logger logger = LoggerFactory.getLogger(MemberDetailController.class);

	@Autowired
	FollowshipRepository followshipRepository;

	@Autowired
	MemberRepository memberRepository;

	@Autowired
	MemberDetailRepository memberDetailRepository;

	@Autowired
	TimelineRepository timelineRepository;

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String userprofile(HttpSession session, Model model) {
		logger.info("[/profile]");
		String memberId = (String) session.getAttribute("loginId");
		Member member = memberRepository.selectOneMember(memberId);
		MemberDetail memberDetail = memberDetailRepository.viewMemberDetail(memberId);
		List<Timeline> timelineList = timelineRepository.myTimeline(memberId);
		model.addAttribute("member", member);
		model.addAttribute("memberDetail", memberDetail);
		model.addAttribute("timelineList", timelineList);
		return "member/profile";
	}

	@RequestMapping(value = "/p", method = RequestMethod.GET)
	public String userprofile(String mid, String ptype, HttpSession session, Model model) {
		// mid : memberId
		// ptype : profile type
		logger.info("[/p?mid=" + mid + "&ptype=" + ptype + "]");
		String loginId = (String) session.getAttribute("loginId");
		Member member = memberRepository.selectOneMember(mid);
		MemberDetail memberDetail = memberDetailRepository.viewMemberDetail(mid);
		Followship followship = new Followship();
		followship.setFollower(loginId);
		followship.setFollowing(mid);
		followship = followshipRepository.selectFollowship(followship);
		List<Timeline> timelineList = null;
		if (ptype.equals("a")) { // "a" : all
			timelineList = timelineRepository.myTimeline(mid);
		} else if (ptype.equals("w")) { // "w" : wishing
			timelineList = timelineRepository.myWishing(mid);
		} else if (ptype.equals("c")) { // "c" : comment
			timelineList = timelineRepository.myComment(mid);
		} else if (ptype.equals("r")) { // "r" : review
			timelineList = timelineRepository.myReview(mid);
		}
		model.addAttribute("member", member);
		model.addAttribute("memberDetail", memberDetail);
		model.addAttribute("followship", followship);
		model.addAttribute("timelineList", timelineList);
		return "member/profile";
	}

	@RequestMapping(value = "/getFollowshipCount", method = RequestMethod.POST)
	public @ResponseBody MemberDetail getFollowshipCount(String mid) {
		logger.info("[/getFollowshipCount]");
		return memberDetailRepository.viewMemberDetail(mid);
	}

	@RequestMapping(value = "/getFollowshipButton", method = RequestMethod.POST)
	public @ResponseBody Followship getFollowshipButton(String mid, HttpSession session) {
		logger.info("[/getFollowshipButton]");
		String loginId = (String) session.getAttribute("loginId");
		Followship followship = new Followship();
		followship.setFollower(loginId);
		followship.setFollowing(mid);
		return followshipRepository.selectFollowship(followship);
	}

	@RequestMapping(value = "/follow", method = RequestMethod.POST)
	public @ResponseBody Integer follow(String mid, HttpSession session) {
		logger.info("[/follow]");
		String loginId = (String) session.getAttribute("loginId");
		Followship followship = new Followship();
		followship.setFollower(loginId);
		followship.setFollowing(mid);
		return followshipRepository.insertFollowship(followship);
	}

	@RequestMapping(value = "/unfollow", method = RequestMethod.POST)
	public @ResponseBody Integer unfollow(String mid, HttpSession session) {
		logger.info("[/unfollow]");
		String loginId = (String) session.getAttribute("loginId");
		Followship followship = new Followship();
		followship.setFollower(loginId);
		followship.setFollowing(mid);
		return followshipRepository.deleteFollowship(followship);
	}
}
