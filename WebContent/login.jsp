<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/login.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Bad+Script&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto&display=swap" rel="stylesheet">
<script src="http://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="js/login.js" type="text/javascript"></script>
</head>
<script>
function chkSubmit(){
	frm = document.forms["loginform"];
	var id = frm["uname"].value.trim();
	var pw = frm["psw"].value.trim();
	if(id == ""){
		alert("아이디를 입력하셔야 합니다.");
		frm["ㅕname"].focus();
		return false;
	}
	if(pw == ""){
		alert("비밀번호를 입력하셔야 합니다.");
		frm["psw"].focus();
		return false;
	}
	return true;
}
</script>
<body>

  <form class="modal-content animate" name="loginform" method="post" onsubmit="return chkSubmit()" action="loginOk.mc">
    <div class="imgcontainer">
      <span onclick="history.back()" class="close" title="Close Modal" >&times;</span>
      </div>

    <div class="container">
      <label for="uname"><b>아이디</b></label>
      <input type="text" placeholder="Enter Username" name="uname" required>

      <label for="psw"><b>비밀번호</b></label>
      <input type="password" placeholder="Enter Password" name="psw" required>
        
      <input type="submit" value="login">

	</div>
  </form>
</body>
</html>