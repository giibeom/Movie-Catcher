<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<script>
	var totalSeats = "${param.selectedSeats}";
	var totalPeople = "${param.pNum}";
</script>


<link
	href="https://fonts.googleapis.com/css?family=Noto+Sans+KR&display=swap"
	rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<link
	href="https://fonts.googleapis.com/css?family=Bad+Script&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/footer.css">
<script src="js/header.js" type="text/javascript"></script>
<script src="js/bookingStep3.js" type="text/javascript"></script>

<link rel="stylesheet" href="css/booking1.css">
<link rel="stylesheet" href="css/booking3.css">
<link rel="stylesheet" href="css/processe.css">

<title>영화 예매하기</title>
</head>
<body>
	<!-- header -->
	<div class="topnav" id="myTopnav">
		<h1 id="title">
			<a href="welcome.html">MOVIE CATCHER</a>
		</h1>

		<div id="nav_ul">
			<ul>
				<li class="icon clear"><a href="javascript:void(0);"
					onclick="myFunction()"> <i class="fa fa-bars"
						style="color: black;"></i></a></li>
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


	<div id="container">
		<div id="rule-box">
			<div id="title">
				<h2>확인 및 결제</h2>
			</div>
			<br>
			<div id="pay">
				<form id="payFrm" method="POST" action="reserveOk.mc">
					결제 수단<br>
					<div id="cardRadio">
						<input type="radio" name="card" required />신용카드 &nbsp;&nbsp;&nbsp;<input
							type="radio" name="card" />체크카드
					</div>


					<br>이름<br>
					<input type="text" name="first_name" placeholder="이름" required>
					<br>성<br>
					<input type="text" name="last_name" placeholder="성" required>

					<br>카드 정보<br>
					<input type="text" id="card_info" name="card_info"
						placeholder="카드번호" required> <br>
					<input type="text" id="card_info1" name="card_info1"
						placeholder="만료일" required> <input type="text"
						id="card_info2" name="card_info2" placeholder="CVV" required>

					<br>청구지 정보<br>
					<input type="text" id="post" name="post" placeholder="우편번호"
						required> <br>국가/지역<br>
					<input type="text" id="country" name="country" placeholder="한국"
						required>
					<input type="hidden" name="price" id="hiddenPrice">
					<input type="hidden" name="seats" id="hiddenSeats">

					<div id="button">
						<input type="submit" value="결제하기" onsubmit="return sandit()">
					</div>
			</form>
			</div>
		</div>


		<div id="margin-box"></div>
		<div id="pay-box">
			<div id="popup">
				<form method="post">
					<div id="popuptitle">
						<h3 id="movieName">${list[0].h_movie }<br>${list[0].hallType }</h3>
						<h5 id="movieGrade">${list[0].h_grade }</h5>
						<p>
							<img src="images/booking1.png" id="popup_img">극장 <strong id="theaterName">${theater[0].theaterName } ${list[0].hallLocation }</strong>
						</p>
						<p>
							<img src="images/booking2.png" id="popup_img">일시 <strong id="date">${list[0].movietime }</strong>
						</p>
						<p>
							<img src="images/booking3.png" id="popup_img">좌석 <strong id="totalSeats"></strong>
						</p>
						<p>
							<img src="images/booking4.png" id="popup_img">인원 <strong id="totalPeople"></strong>
						</p>
					</div>
					<div class="content3">
						<div class="content3_1 content3_2 content3_3">
							<span class="generalCal"></span> <span class="money generalMoney"></span><br> 
							<span class="teenagerCal"></span> <span class="money teenagerMoney"></span><br> 
							<span class="specialCal"></span> <span class="money specialMoney"></span><br> 
							<strong>총 합계(KRW)<span class="money totalMoney"></span></strong>
						</div>
					</div>
					<div class="content3">
						<div class="content3_1 content3_4">
							결제 후 해당 영화 시간 20분 전까지<br> 취소 할 경우 취소 수수료가 부가되지 않습니다.<br>
							(단, 영화 시작 후 취소가 불가능합니다.)
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>




	<!--하단 상태바 -->
	<div class="step">
		<div class="step-state step3">
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