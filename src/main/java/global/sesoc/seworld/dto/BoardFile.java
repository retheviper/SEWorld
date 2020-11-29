package global.sesoc.seworld.dto;


import lombok.Data;

@Data
public class BoardFile {
	private String boardFileId;
	private String boardId;
	private String ogFilename;
	private String svFilename;
	private long fileSize;
	private String createdDate;
	private String updatedDate;
}
