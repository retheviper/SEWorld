package global.sesoc.seworld.domain.dto;

import lombok.Data;

@Data
public class BoardReply {
    private String boardReplyId;
    private String boardId;
    private String memberId;
    private String content;
    private String createdDate;
    private String updatedDate;
}
