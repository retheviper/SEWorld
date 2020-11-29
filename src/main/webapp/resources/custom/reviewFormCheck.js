/**
 * Performs form check when write review
 */
function formCheck() {
	var title = document.getElementById("title");
	var content = document.getElementById("content");
	
	if (title.value == '' || content.value == '') {
		alert('제목과 내용을 입력하세요.');
		return false;
	}

	var file = document.getElementById('uploadFile');
	var maxSize = 10 * 1024 * 1024
	var fileSize = 0;
	var browser = navigator.appName;

	if (file != null) {
		if (browser == "Microsoft Internet Explorer") {
			var oas = new ActiveXObject("Scripting.FileSystemObject");
			fileSize = oas.getFile(file.value).size;
		} else {
			fileSize = file.files[0].size;
		}
		if (fileSize > maxSize) {
			alert("첨부 파일의 크기는 10MB 이하만 등록 가능합니다.");
			return false;
		}
	}
	return true;
}