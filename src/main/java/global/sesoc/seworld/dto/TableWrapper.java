package global.sesoc.seworld.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class TableWrapper {
	private List<?> aaData;
	private int iTotalRecords;
	private int iTotalDisplayRecords;
}
