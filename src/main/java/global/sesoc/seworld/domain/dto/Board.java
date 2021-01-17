package global.sesoc.seworld.domain.dto;

import lombok.Data;

@Data
public class Board {
    private String boardId;
    private String memberId;
    private String category;
    private String title;
    private String content;
    private String createdDate;
    private String updatedDate;
    private String exhibitionId;
}