package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.Member;

public interface MemberMapper {

	 Member selectOneMember(String memberId);

	 int insertOneMember(Member member);

	 int verifyMember(String memberId);

	 int registerGoogleMember(Member member);

	 int registerFacebookMember(Member member);
}
