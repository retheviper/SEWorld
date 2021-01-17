package global.sesoc.seworld.domain.dto;

import lombok.Data;

@Data
public class MemberDetail {
    private String followerCount;
    private String followingCount;
    private String wishingCount;
    private String commentCount;
    private String reviewCount;
}
