package global.sesoc.seworld.domain.dto;

import lombok.Data;

@Data
public class Liking {
    private String memberId;
    private String exhibitionId;
    private String liked;
    private String createdDate;
    private String updatedDate;
}
