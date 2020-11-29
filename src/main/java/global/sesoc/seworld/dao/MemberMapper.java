package global.sesoc.seworld.dao;

import global.sesoc.seworld.dto.Member;

public interface MemberMapper {
	public abstract Member selectOneMember(String memberId);

	public abstract int insertOneMember(Member member);

	public abstract int verifyMember(String memberId);

	public abstract int registerGoogleMember(Member member);

	public abstract int registerFacebookMember(Member member);
}
