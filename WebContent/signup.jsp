<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>


<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>회원가입</title>
<link rel="stylesheet" href="css/signup.css">
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/footer.css">

<link
	href="https://fonts.googleapis.com/css?family=Bad+Script&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="js/signUp.js" type="text/javascript"></script>
</head>
<body>
	<header>
		<div class="topnav" id="myTopnav">
			<h1 id="title">
				<a href="">MOVIE CATCHER</a>
			</h1>
		</div>
	</header>

	<!-- 회원가입 -->
	<form action="signupOk.mc" method="post">
		<div id="body">

			<div id="info">
				<h5>회원정보 입력</h5>
				<input id="nickname" type="text" placeholder="아이디 입력" name="id" required> 
				<input type="password" placeholder="(필수) 비밀번호 입력"	name="pw" required> 
				<input type="password" placeholder="(필수) 비밀번호 재확인" name="pwchk" required>
				<div id="birthChk">
					<input id="birth" type="text" maxlength="10" placeholder="(필수) 생년월일(yyyy-mm-dd)" name="birth" required>
					<button type="button">확인</button>
				</div>
				<input id="email" type="email" placeholder="(필수) 이메일 입력" name="email" required> 
				<input id="nick" type="text" placeholder="(선택) 닉네임 입력" name="nick">
			</div>
			
			
			<div id="phoneform">
				<h5>휴대폰인증</h5>
				<div id="pNum">
					<input type="text" name="phone" placeholder="(필수) 휴대폰 전화번호 입력(-제외)" required>
					<button type="button">인증</button>
				</div>
				<div id="check">
					<input type="text" name="certificationNum" placeholder="인증번호 입력" required>
					<button type="button">확인</button>
				</div>
				<p>* 인증번호가 도착하지 않았을 경우 '인증'버튼을 다시 눌러주세요.</p>
			</div>
			
			
			<div id="agree">
				<h5>약관동의</h5>
				<div id="allAgree">
					<input type="checkbox">
					<p>전체동의</p>
				</div>
				<div id="selectAgree">
					<div class="s1">
						<input type="checkbox" required>
						<p>이용약관동의(필수)</p>
						<span>내용보기 ></span>
					</div>
					<div class="s1">
						<input type="checkbox" required>
						<p>개인정보 수집 및 이용동의(필수)</p>
						<span>내용보기 ></span>
					</div>
					<div class="s1">
						<input type="checkbox" required>
						<p>만 14세 이상 이용자(필수)</p>
						<span>내용보기 ></span>
					</div>
					<div class="s1">
						<input type="checkbox">
						<p>무비캐처 혜택알림 동의(선택)</p>
					</div>
				</div>
			</div>

			<div id=button>
				<input id="submit" type="submit" value="회원가입완료">
			</div>
		</div>
	</form>
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