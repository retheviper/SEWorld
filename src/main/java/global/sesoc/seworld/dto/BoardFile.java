package global.sesoc.seworld.dto;

public class BoardFile {
	private String boardFileId;
	private String boardId;
	private String ogFilename;
	private String svFilename;
	private long fileSize;
	private String createdDate;
	private String updatedDate;
	public BoardFile() {
		super();
	}
	public BoardFile(String boardFileId, String boardId, String ogFilename, String svFilename, long fileSize,
			String createdDate, String updatedDate) {
		super();
		this.boardFileId = boardFileId;
		this.boardId = boardId;
		this.ogFilename = ogFilename;
		this.svFilename = svFilename;
		this.fileSize = fileSize;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	public String getBoardFileId() {
		return boardFileId;
	}
	public void setBoardFileId(String boardFileId) {
		this.boardFileId = boardFileId;
	}
	public String getBoardId() {
		return boardId;
	}
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	public String getOgFilename() {
		return ogFilename;
	}
	public void setOgFilename(String ogFilename) {
		this.ogFilename = ogFilename;
	}
	public String getSvFilename() {
		return svFilename;
	}
	public void setSvFilename(String svFilename) {
		this.svFilename = svFilename;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "BoardFile [boardFileId=" + boardFileId + ", boardId=" + boardId + ", ogFilename=" + ogFilename
				+ ", svFilename=" + svFilename + ", fileSize=" + fileSize + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}
}
