<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String movieName = (String)request.getAttribute("movieName");
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>서치페이지</title>
<link href="https://fonts.googleapis.com/css?family=Bad+Script&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto&display=swap" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/header.css">
<link href="css/footer.css" rel="stylesheet" type="text/css">
<link href = "css/searchPage.css" rel="stylesheet" type="text/css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="js/header.js" type="text/javascript"></script>
<script>
	var mvName = "<%= movieName %>";
</script>
<script src="js/searchPage.js" type="text/javascript"></script>
</head>
<body>

<div class="topnav" id="myTopnav">
	<h1 id="title"><a href="welcome.html">MOVIE CATCHER</a></h1>
	
	<div id="nav_ul">
	<ul>
		<li  class="icon clear" ><a href="javascript:void(0);"onclick="myFunction()">
				<i class="fa fa-bars" style="color:black;"></i></a>
		</li>
		<li>영화</li>
		<li>예매하기</li>
		<li>극장</li>
		<li>리뷰</li>
		<li>공지사항</li>
		<li>마이페이지</li>
	</ul>
	</div>
</div>
<div class="clear"></div>


<%-- start api --%>
<div id="bodyContainer">

<div class="col-3 col-m-4 container1">
	
	<div class="mv_poster1">
		<img src="" width="100%" height="320px">
	</div>
	
	<div class="mv_info">
		<div class="subject1"></div>
		<div class="info">
			<span>개봉일 : </span>
			<span class="release_date1"></span>
		</div>
	</div>
	
</div>

<%-- 위 div 7개 복붙 --%>

<div class="col-3 col-m-4 container2">
	
	<div class="mv_poster2">
		<img src="" width="100%" height="320px">
	</div>
	
	<div class="mv_info">
		<div class="subject2"></div>
		<div class="info">
			<span>개봉일 : </span>
			<span class="release_date2"></span>
		</div>
	</div>
	
</div>

<div class="col-3 col-m-4 container3">
	
	<div class="mv_poster3">
		<img src="" width="100%" height="320px">
	</div>
	
	<div class="mv_info">
		<div class="subject3"></div>
		<div class="info">
			<span>개봉일 : </span>
			<span class="release_date3"></span>
		</div>
	</div>
	
</div>

<div class="col-3 col-m-4 container4">
	
	<div class="mv_poster4">
		<img src="" width="100%" height="320px">
	</div>
	
	<div class="mv_info">
		<div class="subject4"></div>
		<div class="info">
			<span>개봉일 : </span>
			<span class="release_date4"></span>
		</div>
	</div>
	
</div>

<div class="col-3 col-m-4 container5">
	
	<div class="mv_poster5">
		<img src="" width="100%" height="320px">
	</div>
	
	<div class="mv_info">
		<div class="subject5"></div>
		<div class="info">
			<span>개봉일 : </span>
			<span class="release_date5"></span>
		</div>
	</div>
	
</div>

<div class="col-3 col-m-4 container6">
	
	<div class="mv_poster6">
		<img src="" width="100%" height="320px">
	</div>
	
	<div class="mv_info">
		<div class="subject6"></div>
		<div class="info">
			<span>개봉일 : </span>
			<span class="release_date6"></span>
		</div>
	</div>
	
</div>

<div class="col-3 col-m-4 container7">
	
	<div class="mv_poster7">
		<img src="" width="100%" height="320px">
	</div>
	
	<div class="mv_info">
		<div class="subject7"></div>
		<div class="info">
			<span>개봉일 : </span>
			<span class="release_date7"></span>
		</div>
	</div>
	
</div>

<div class="col-3 col-m-4 container8">
	
	<div class="mv_poster8">
		<img src="" width="100%" height="320px">
	</div>
	
	<div class="mv_info">
		<div class="subject8"></div>
		<div class="info">
			<span>개봉일 : </span>
			<span class="release_date8"></span>
		</div>
	</div>
	
</div>


</div>


<div class="clear"></div>
<%-- end api --%>

<footer>
    <div class="policy">
        <ul>
            <li>회사소개</li>
            <li>채용정보</li>
            <li>광고/프로모션문의</li>
            <li>제휴문의</li>
            <li>이용약관</li>
            <li>편성기준</li>
            <li>개인정보처리방침</li>
            <li>법적고지</li>
            <li>상생경영</li>
            <li>사이트맵</li>
        </ul>
    </div>
    <div class="clear"></div>
    <div class="comInfo">
        <div class="comlogo"></div>
        <div class="sns_link">
            <div class="facebook"></div>
            <div class="twitter"></div>
            <div class="instagram"></div>
        </div>
        <div class="comAddress">
            <address>
                기범특별시 성일구 나영동 수진대로 지현길 혜진몰 3층(기범로동)
            </address>
            <p class="footCom">
                <span>대표이사:성연철</span>
                <span>사업자등록번호 : 103-80-12345</span>
                <span>통신판매업신고번호: 2019-버미레도-1228</span>
                <a href="javasript:void(0);" class="btn_goFtc">
                    <img src="images/btn_reg.png" alt="사업자정보확인">
                </a>            
            </p>
        </div>
    </div>
</footer>




</body>
</html>