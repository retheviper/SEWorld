package global.sesoc.seworld.domain.dto;

import lombok.Data;

@Data
public class Followship {
    private String follower;
    private String following;
    private String createdDate;
}
