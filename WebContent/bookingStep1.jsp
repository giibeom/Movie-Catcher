<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">

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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="js/header.js" type="text/javascript"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<link rel="stylesheet" href="css/booking.css">
<link rel="stylesheet" href="css/processe.css">
<script type="text/javascript" language="javascript"
	src="js/rollingSlider.js"></script>
<script type="text/javascript" language="javascript"
	src="js/bookingStep1.js"></script>

<title>영화 예매하기</title>
</head>
<body>
	<header>
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
	</header>

	<div class="body">

		<!--영화 선택 div-->
		<div class="mv_wrap" id="mv_wrap">
			<div id="scrolling"
				style="position: relative; overflow: hidden; width: 100%; height: 280px;"></div>
			<div id="leftBtn"></div>
			<div id="rightBtn"></div>
		</div>


		<div class="selectStep1">


			<!--극장 선택 div-->
			<div class="theater">
				<h2>극장선택</h2>
				<div class="area1">
					<details>
						<summary>서울</summary>
						<ul id="area1">
							
						</ul>
					</details>
				</div>
				<div class="area1">
					<details>
						<summary>경기</summary>
						<ul id="area2">
						
						</ul>
					</details>
				</div>
				<div class="area1">
					<details>
						<summary>인천</summary>
						<ul id="area3">
						
						</ul>
					</details>
				</div>
				<div class="area1">
					<details>
						<summary>강원</summary>
						<ul id="area4">
							
						</ul>
					</details>
				</div>
				<div class="area1">
					<details>
						<summary>대전/충청</summary>
						<ul id="area5">
							
						</ul>
					</details>
				</div>
				<div class="area1">
					<details>
						<summary>대구</summary>
						<ul id="area6">
						
						</ul>
					</details>
				</div>
				<div class="area1">
					<details>
						<summary>부산/울산</summary>
						<ul id="area7">
							
						</ul>
					</details>
				</div>
				<div class="area1">
					<details>
						<summary>경상</summary>
						<ul id="area8">
							
						</ul>
					</details>
				</div>
				<div class="area1">
					<details>
						<summary>광주/전라/제주</summary>
						<ul id="area9">
							
						</ul>
					</details>
				</div>
			</div>


			<!--날짜/ 스케줄 선택 div-->
			<div class="schedule">

				<div class="wrapper">
					<h2>
						날짜선택<input type="text" placeholder="날짜를 선택하세요." id="datepicker"
							readonly="true" />
					</h2>
					<i class="ion-calendar"></i>
				</div>
				<div id="selectScd">
					<div class="mv_time">
						<div class="time">
							<table>
								<tr>
									<td>2관</td>
								</tr>
								<tr>
									<td>09:00</td>
								</tr>
								<tr>
									<td>214석 / 218석</td>
								</tr>
							</table>
						</div>
						<div class="time">
							<table>
								<tr>
									<td>2관</td>
								</tr>
								<tr>
									<td>09:00</td>
								</tr>
								<tr>
									<td>214석 / 218석</td>
								</tr>
							</table>
						</div>
						<div class="time">
							<table>
								<tr>
									<td>2관</td>
								</tr>
								<tr>
									<td>09:00</td>
								</tr>
								<tr>
									<td>214석 / 218석</td>
								</tr>
							</table>
						</div>
						<div class="time">
							<table>
								<tr>
									<td>2관</td>
								</tr>
								<tr>
									<td>09:00</td>
								</tr>
								<tr>
									<td>214석 / 218석</td>
								</tr>
							</table>
						</div>
						<div class="time">
							<table>
								<tr>
									<td>2관</td>
								</tr>
								<tr>
									<td>09:00</td>
								</tr>
								<tr>
									<td>214석 / 218석</td>
								</tr>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--하단 상태바-->
	<div class="step">
		<div class="step-state step1">
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