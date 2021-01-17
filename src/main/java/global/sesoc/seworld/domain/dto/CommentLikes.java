package global.sesoc.seworld.domain.dto;

import lombok.Data;

@Data
public class CommentLikes {
    private String memberId;
    private String exhibitionId;
    private String createdDate;
}