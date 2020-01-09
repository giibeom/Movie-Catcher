<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>MOVIE CATCHER ADMIN</title>
</head>
<script>
function chkSubmit(){
	frm = document.forms["frm"];
	
	var b_title = frm["b_title"].value.trim();
	var b_content = frm["b_content"].value.trim();
	
	if(b_title == ""){
		alert("제목을 입력해주세요.");
		frm["b_title"].focus();
		return false;
	}
	if(b_content == ""){
		alert("내용을 입력해주세요.");
		frm["b_content"].focus();
		return false;
	}
	
	return true;
}

</script>
<body>
<h2>글작성</h2>
<form name="frm" action="b_writeOk.mc" method="post" onsubmit="return chkSubmit()">

제목:
<input type="text" name="b_title"/><br>
내용:<br>
<textarea name="b_content"></textarea>
<br><br>
<input type="submit" value="등록"/>
</form>
<br>
<button type="button" onclick="location.href='board.mc'">목록으로</button>
</body>

</html>