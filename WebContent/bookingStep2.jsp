<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script>
var hallSize = "${list[0].hallSize}";
var restSeat = "${list[0].restSeat}";
var t_uid = "${list[0].t_uid}"
</script>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">

<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/footer.css">
<link rel="stylesheet" href="css/processe.css">
<link
	href="https://fonts.googleapis.com/css?family=Bad+Script&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto&display=swap"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="js/header.js" type="text/javascript"></script>
<script src="js/bookingStep2.js" type="text/javascript"></script>

<link rel="stylesheet" href="css/booking2.css">

<title>영화 예매하기</title>
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
	<div class="clear"></div>

	<h2>인원/좌석</h2>


	<div class="seatSelect">


		<!--인원 선택-->
		<div class="number">
			<label>일반</label> <select id="general" name="general">
				<option value="0" selected>0</option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
			</select>&nbsp;&nbsp;&nbsp; <label>청소년</label> <select id="teenager"
				name="teenager">
				<option value="0" selected>0</option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
			</select>&nbsp;&nbsp;&nbsp; <label>우대</label> <select id="special"
				name="special">
				<option value="0" selected>0</option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
			</select>
			<div id="seatSelectAbout">
			<div id="personNum">
			<div id="totalNumber"></div>
			<button id="pNumChk" >인원 확정</button>
			</div>
			<div id="seatNum">
			<div id="nowSelectSeat"></div>
			<div id="reSelectSeat">좌석 다시 고르기</div>
			</div>
			</div>
		</div>


		<!--좌석선택-->
		<div class="seat">
			<p>좌석선택</p>
			<div id="selectSeat">
				

			</div>
		</div>
		
		<div id="goPayment">
			결제하기
		</div>
	</div>

	<!--하단 상태바-->
	<div class="step">
		<div class="step-state step2">
			<ul>
				<li><p>영화/날짜선택</p></li>
				<li><p>좌석선택</p></li>
				<li><p>결제</p></li>
			</ul>
		</div>
	</div>
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
				<address>기범특별시 성일구 나영동 수진대로 지현길 혜진몰 3층(기범로동)</address>
				<p class="footCom">
					<span>대표이사:성연철</span> <span>사업자등록번호 : 103-80-12345</span> <span>통신판매업신고번호:
						2019-버미레도-1228</span> <a href="javasript:void(0);" class="btn_goFtc">
						<img src="images/btn_reg.png" alt="사업자정보확인">
					</a>
				</p>
			</div>
		</div>
	</footer>
</body>
</html>