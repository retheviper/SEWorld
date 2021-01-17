package global.sesoc.seworld.domain.dao;

import global.sesoc.seworld.domain.dto.Member;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final SqlSession sqlSession;

    public Member selectOneMember(final String memberId) {
        return sqlSession.getMapper(MemberMapper.class).selectOneMember(memberId);
    }

    public int insertOneMember(final Member member) {
        return sqlSession.getMapper(MemberMapper.class).insertOneMember(member);
    }

    public int verifyMember(final String memberId) {
        return sqlSession.getMapper(MemberMapper.class).verifyMember(memberId);
    }

    public int registerGoogleMember(final Member member) {
        return sqlSession.getMapper(MemberMapper.class).registerGoogleMember(member);
    }

    public int registerFacebookMember(final Member member) {
        return sqlSession.getMapper(MemberMapper.class).registerFacebookMember(member);
    }
}
