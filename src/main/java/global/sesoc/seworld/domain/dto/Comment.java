package global.sesoc.seworld.domain.dto;


import lombok.Data;

@Data
public class Comment {
    private String memberId;
    private String exhibitionId;
    private int rating;
    private String content;
    private String createdDate;
    private String updatedDate;
    private int likes;
}
