package global.sesoc.seworld.domain.dto;

import lombok.Data;

@Data
public class ExhibitionDetail {
    private String exhibitionId;
    private String memberId;
    private String wishing;
    private String liking;
    private String rating;
    private String content;
}
