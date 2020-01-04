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
<body>

  <form class="modal-content animate" name="loginform" method="post">
    <div class="imgcontainer">
      <span onclick="history.back()" class="close" title="Close Modal" >&times;</span>
      </div>

    <div class="container">
      <label for="uname"><b>아이디</b></label>
      <input type="text" placeholder="Enter Username" name="uname" required>

      <label for="psw"><b>비밀번호</b></label>
      <input type="password" placeholder="Enter Password" name="psw" required>
        
      <button type="submit" onclick="sendit()">Login</button>

	</div>
    </div>
  </form>
</div>



</body>
</html>