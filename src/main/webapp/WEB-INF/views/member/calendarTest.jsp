<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/jquery-3.3.1.min.js"></script>
<script>
$(function(){
	
	$("#insertBtn").on('click', Insert);
});

function insert (){
	var memberId = $("#memberId").val();
	
};


</script>

</head>
<body>
<!-- 
		this.memberId = memberId;
		this.exhibitionId = exhibitionId;
		this.createdDate = createdDate;
 -->
	<form action="addpic" method="post" enctype="multipart/form-data" >
		<input type="text" id="memberId" name="memberId" />아디
		<input type="text" id="exhibitionId" name="exhibitionId" />전시아디
		
		<input type="button" value="submit" id="insertBtn"/>
		</form>
</body>
</html>