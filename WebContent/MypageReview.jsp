<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Bad+Script&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto&display=swap" rel="stylesheet">
<script src="http://code.jquery.com/jquery-1.12.4.min.js"></script>
<link href="css/footer.css" rel="stylesheet" type="text/css">
<link href="css/header.css" rel="stylesheet" type="text/css">
<link href="css/public.css" rel="stylesheet" type="text/css">
<script src="js/header.js" type="text/javascript"></script>
<link href="css/review.css" rel="stylesheet" type="text/css">
</head>
<body>
	  <header>
        <div class="topnav" id="myTopnav">
            <h1 id="title"><a href="main.mc">MOVIE CATCHER</a></h1>
            <div id="logout">로그아웃</div>
            <div id="nav_ul">
                <ul>
                    <li class="icon clear"><a href="javascript:void(0);" onclick="myFunction()">
                            <i class="fa fa-bars" style="color:black;"></i></a>
                    </li>
                    <li id="navMovie">영화</li>
                    <li id="navReserve">예매하기</li>
                    <li id="navTheater">극장</li>
                    <li id="navReview">리뷰</li>
                    <li id="navNotice">공지사항</li>
                    <li id="navMypage">마이페이지</li>
                </ul>
            </div>
        </div>
    </header>
    
     <div class="reviewBox">
	        <ul class="reviewWrap">
	        
		        <c:forEach var="dto" items="${list }" varStatus="status">
		       		    <li>
		                <div class="reviewer">
		                <div class="deleteButton"><a href="reviewdelete.mc?rv_id=${dto.rv_id }">리뷰 삭제하기</a></div>
		                    <div class="review_des_title">
		                    <div class="script">
		                        <div class="rName">"${dto.rv_id }"</div>
		                        <div class="rStar">평점 : ${dto.rv_star }</div>
		                    </div>
		                    <div class="rMovieTitle">${dto.rv_title }</div>
		                    <div class="rDesc"><p>${dto.rv_content }</p></div>
		                        <div class="rDate">${dto.rv_date }</div>
		                   </div>
		                </div>
		            </li>
			 	</c:forEach>
	        </ul>
  </div>
</body>
</html>