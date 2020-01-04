<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MOVIE CATCHER</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/board.css" rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Bad+Script&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto&display=swap"
	rel="stylesheet">
<script src="http://code.jquery.com/jquery-1.12.4.min.js"></script>
<link href="css/footer.css" rel="stylesheet" type="text/css">
<link href="css/header.css" rel="stylesheet" type="text/css">
<link href="css/public.css" rel="stylesheet" type="text/css">
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
	<div class="board_background"></div>

	<div class="contentWrap">
		<h3>이용안내</h3>

		<div class="faqBox">
			<ul class="faq active">
				<li class="q"><b><span>Q </span>01.</b> '무비캐쳐'는 어떤 서비스인가요?</li>
				<li class="a"><p>
						'무비캐쳐'는 '국내 최대 영화 예매 서비스를 제공'하는 플랫폼입니다.<br> 너무나 많은 분들이 영화를
						좋아하고 예매하는 과정에서 좀 더 편리하고 효율적인 예매를 하도록 도와드립니다.<br>
					</p></li>

				<li class="q"><b><span>Q </span>02.</b> 무비캐쳐 회원권은 어떻게 구매하나요?</li>
				<li class="a"><p>
						- 영화 관람권 : 전국 일반 영화관에서 상영하는 영화 중 1편을 선택하여 관람가능<br> - 세트구성 :
						영화관람권10매 + 보너스 1매 = 70,000원 (기본세트구성/관람기한 1년)<br> - 구매방법 : 월
						단위로 구매 가능합니다. 단, 최소 1개월 이상 구매 가능<br> - 구매장소 : 무비캐쳐 사이트 혹은
						고객센터로 전화 구매가 가능합니다.
					</p></li>

				<li class="q"><b><span>Q </span>03.</b> 관람권 사용해서 예매했는데 현금영수증
					발행을 못했어요!</li>
				<li class="a"><p>
						관람권 권종에 따라 현금영수증 발급 가능 여부가 상이하기 때문에<br> 현금영수증 발급 가능 여부 확인 후,
						발급 가능한 사항 관람권일 경우에 자진발급 번호 안내해 드리고 있습니다.<br> 이후 국세청 홈페이지
						접속하시어, 해당 자진발급 번호 입력하여 발급 받으실 수 있습니다.<br> 자세한 사항은 전화로 문의주시면
						안내 드리겠습니다.
					</p></li>

				<li class="q"><b><span>Q </span>04.</b> 비회원 예매가 가능한가요?</li>
				<li class="a"><p>
						무비캐쳐는 회원 일 경우에만 이용 가능하시며, 간단한 회원가입으로 저희 회원이 되실 수 있습니다 <br>
					</p></li>

				<li class="q"><b><span>Q </span>05.</b> 아이디를 변경하고 싶습니다.</li>
				<li class="a"><p>
						아이디 변경은 탈퇴 후 재가입(신규가입)을 통해 새로운 아이디로 변경하실 수 있습니다.<br> (단, 회원정보
						수정 메뉴에서 회원 탈퇴 후 30일 이후부터 재가입이 가능합니다.)<br> 탈퇴 후 30일 이후 재가입 시에는
						예전 ID로는 재가입이 되지 않는 점 양해 부탁드립니다.
					</p></li>

				<li class="q"><b><span>Q </span>06.</b> 특별관 관람권은 따로 있나요?</li>
				<li class="a"><p>
						무비캐쳐에서는 다양한 특별관 관람권을 판매하고 있습니다.<br>
						<br> ■ 특별관 관람권 구성 및 가격■<br> 3D 영화 관람권 (1Set) : 3D 영화관람권
						2매 = 24,000원<br> IMAX 영화 관람권 (1Set) : IMAX 영화관람권 2매 = 30,000원<br>
						4DX 영화 관람권 (1Set) : 4DX 영화관람권 2매 = 36,000원<br>
						<br> ※관람권 유효기한은 구매월로부터 1년입니다.
					</p></li>

				<li class="q"><b><span>Q </span>07.</b> 등급에 대해 알고 싶습니다.</li>
				<li class="a"><p>
						무비캐쳐는 영화진흥법에 의한 영화별 관람등급을 철저히 준수하고 있습니다.<br>
						<br> ■ 등급 기준<br> - 전체 관람가 : 모든 연령의 관람객이 관람 할 수 있는 영화<br>
						- 12세 관람가 : 만 12세 미만의 관람객은 관람 할 수 없는 영화 (보호자 동반 시 12세 미만 관람 가능)<br>
						- 15세 관람가 : 만 15세 미만의 관람객은 관람 할 수 없는 영화 (보호자 동반 시 15세 미만 관람 가능)<br>
						- 청소년 관람불가 : 만 18세 미만의 관람객은 관람 할 수 없는 영화<br>
						<br> ※ 만 18세 이상이라도 고등학생 신분은 청소년 관람불가 상영관에 입장 불가 (초, 중등교육법 제2조
						규정)<br> ※ 관람 시 보호자는 만 20세 이상의 성인만 가능<br> ※ 온라인 예매 시 로그인한
						예매자의 나이가 영화 등급에 해당 되지 않을 시 예매/결제 진행 불가<br> ※ 12세/15세 관람가 및
						청소년 관람불가 영화의 경우 입장시 본인 확인이 필요한 관계로 신분증 지참 必<br> (실물 신분증만 확인
						유효함)
					</p></li>

				<li class="q"><b><span>Q </span>08.</b> 영화 시간보다 늦었어요. 입장 가능한가요?</li>
				<li class="a"><p>
						웹으로 예매하신 경우에는 티켓 출력 후 영화 시간 내 언제든 입장이 가능합니다.<br> 다만, 지연 입장으로
						인해 관람하지 못하신 영화의 앞 부분은 별도로 관람이 어렵습니다.<br>
					</p></li>

				<li class="q"><b><span>Q </span>09.</b> 예매를 제가 했는데 부모님을 보여 드리고
					싶어요. 타인이 발권을 할 수 있나요?</li>
				<li class="a"><p>
						본인이 예매한 후 타인이 관람하는 경우,<br> 사전에 예매하신 영화의 예매번호 혹은 예매자의 생년월일/휴대폰
						번호를 소지하시고 해당 극장에 방문해 주시면<br> 매표소 혹은 무인발권기에서 티켓으로 교환 후 영화 관람이
						가능합니다.<br>
					</p></li>

				<li class="q"><b><span>Q </span>10.</b> 예매 취소 및 환불 규정은 어떻게 되나요?</li>
				<li class="a"><p>
						영화 시간 20분전까지 수수료 없이 예매 취소가 가능하시며, 영화 시작후 취소 및 환불은 불가합니다.<br>
					</p></li>
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
<script>
    $(document).ready(function(){
        $("body").find(".q").click(function(){
            var childern = $(this).next(".a");

            if(childern.is(":visible")) {
                childern.slideUp();
            } else {
                childern.slideDown();
            }

        });
    });
</script>
</html>