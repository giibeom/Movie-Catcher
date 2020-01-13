<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html lang="ko">
<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>admin</title>
    <link href="https://fonts.googleapis.com/css?family=Bad+Script&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <link href="css/admin.css" rel="stylesheet" type="text/css">
   
   <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="js/admin.js" type="text/javascript"></script>
    
</head>

<body>
    <header>
        <div class="topnav">
            <h1 id="title"><a href="welcome.mc" style="color: white;">MOVIE CATCHER</a></h1>
        </div>
        <div class="clear"></div>
        <div class="admin_logout">
        <a href="welcom.mc" class="logout">Logout</a>
        </div>

    </header>
<div class="clear"></div>

<nav class="sidebar-nav">
     <ul>
        <li>
          <button onclick = "fnMove()" id = "move"><i class="ion-bag"><img src="images/admin1.jpg"></i> <span class="nav_sub1">Board</span></button>
        </li>
        <li>
          <button onclick = "fnMove2()" id = "move"><i class="ion-bag"><img src="images/admin2.jpg"></i> <span class="nav_sub2">&nbsp;User</span></button>
        </li>
    </ul>
    </nav>

<div class="clear"></div>


<!--관리자 공지사항-->
<div class="admin_board">    
<div id="main">
    <div class="container">
        <div class="container_box">
   
        <h2>공지사항</h2>
        <div class="content_box">
            <table>
                <tr>
                    <th>No.</th>
                    <th>제목</th>
                    <th>내용</th>
                    <th>기타</th>
                </tr>
                
                <c:forEach var="listb" items="${listb }">
	                <tr>
	                    <td id="table_num">${listb.b_num }</td>
	                    <td id="table_title">${listb.b_title }</td>
	                    <td id="table_content">${listb.b_content }</td>
	                    <td id="table_delete"><a href="b_deleteOk.mc?b_num=${listb.b_num }">내용 삭제</a></td>
	                </tr>
				</c:forEach>
   


            </table>
            <div class="content_box">
            <div id="button">
              <div id = "write"><a href = "b_write.mc">글 작성하기</a> </div>
            </div> <!-- end button -->
        </div> <!-- end content_box -->
        </div> <!--  end container_box -->
    </div> <!--  container -->
</div> <!--  main -->
</div> <!-- admin board -->



<!--유저 관리-->
<div class="admin_user">    
    <div id="main">
        <div class="container">
            <div class="container_box">
       
            <h2>유저관리</h2>
            <div class="content_box">
                <table>
                    <tr>
                        <th>No.</th>
                        <th>아이디</th>
                        <th>이름</th>
                        <th>이메일</th>
                        <th>가입날짜</th>
                        <th>회원탈퇴</th>
                    </tr>
                    
                    <c:forEach var="listm" items="${listm }" varStatus="status">
                    <tr>
                        <td id="user_num">${listm.u_idnum}</td>
                        <td id="user_id">${listm.u_id }</td>
                        <td id="user_name">${listm.u_name }</td>
                        <td id="user_email">${listm.u_email }</td>
                        <td id="user_date">${listm.u_date }</td>
                        <td id="out"><a href = "adminDeleteOk.mc?u_id=${listm.u_id }">회원탈퇴</a></td>
                    </tr>
                    </c:forEach>

 
                </table>

            </div>
        </div>
    </div>
    </div>
</div>

</div>
</body>
</html>