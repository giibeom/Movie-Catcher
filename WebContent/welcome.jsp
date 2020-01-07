<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MOVIE CATCHER</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/welcome.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Bad+Script&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto&display=swap" rel="stylesheet">
<script src="http://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="js/mouseWheel.js" type="text/javascript"></script>
<script src="js/welcome.js" type="text/javascript"></script>
<link href="css/footer.css" rel="stylesheet" type="text/css">
<link href = "css/public.css" rel="stylesheet" type="text/css">
</head>
<script>
function fnMove(seq){
    var offset = $("#div" + seq).offset();
    $('html, body').animate({scrollTop : offset.top}, 800);
}
</script>
<body>
    
    <!--첫번째-->
    <div class="header-content box">
        <div class="header">
            <div id="main_header">
            <span class="menuBtn"><img src="images/nav.jpg"></span>
      
                <div id="title"><a href="welcome.html">MOVIE CATCHER</a></div>
            </div>
        </div>
        <div class="main_img1"></div>    
        <div id="arrow_bottom">
        <button onclick="fnMove('1')">
        <img class="arrow" src="images/arrow_bottom.png"></button></div>
    </div>
  

    <!--두번째-->
    
    <div class="main_wrap2 box">
        <div id="div1">  <!--아래 화살표 버튼 때문에 만듬-->
        <div class="main2_content">
            <div class="description">
                <div class="des_title">
                예매정보와 실시간 상영시간을 한눈에 확인 해보세요!<br>
                다양한 영화들이 당신을 기다리고 있습니다
                </div>
                <div class="des_con">
                국내 모든 영화관 & 영화를 담았습니다.<br>
                무비캐쳐만의 티켓 판매 노하우를 바탕으로 <br>
                온라인 예매에서 최종 발권까지 이용해보세요<br>
                </div>
             </div>
        </div>   
        </div>
        <div id="arrow_bottom">
        <button onclick="fnMove('2')">
        <img class="arrow" src="images/arrow_bottom.png"></button></div>
    </div>
</div>

    <!--세번째-->
    <div class="main_wrap3 box">   
        <div id="div2">  <!--아래 화살표 버튼 때문에 만듬-->
        <div class="main3_content">
            <div class="description">
                <div class="des_title">
                관객들의 생생한 리뷰 평점에 의한 영화 랭킹을 확인 해 보세요!<br>
                실제 관람한 사람들의 솔직한 리뷰를 제공하고 있습니다
                </div>
                <div class="des_con">
                인위적인 리뷰가 아닌 무비캐쳐를 이용해주시는 분들의<br>
                정성스러운 리뷰를 통해 진정한 영화를 즐기실 수 있습니다.
                </div>
            </div>
        </div>
        </div>
        <div id="arrow_bottom">
        <button onclick="fnMove('3')">
        <img class="arrow" src="images/arrow_bottom.png"></button></div>
    </div>
</div>


    <!--네번째-->
    <div class="main_wrap4 box"> 
        <div id="div3">  <!--아래 화살표 버튼 때문에 만듬-->  
        <div class="main4_content">
            <div class="description">
                <div class="des_title">
                취소 수수료가 발생되지 않는 부담없는 서비스를 이용해보세요!<br>
                상영 당일 20분전까지 예매 및 취소할 수 있는 극장을 가장 많이 보유하고 있습니다.
                </div>
                <div class="des_con">
                월간, 주간 회원권 결제로 오프라인 보다 저렴하고 간편하게 이용해보세요<br>
                무비캐쳐의 회원이 되시면 다양한 쿠폰과 포인트로 특별한 혜택을 즐기실 수 있습니다
                </div>
            </div>
        </div>
        <div id="arrow_bottom">
            <button onclick="fnMove('4')">
            <img class="arrow" src="images/arrow_bottom.png"></button></div>
        </div>
    </div>

<!--footer 붙여넣기-->  
<div id="div4">
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
</div>


    <div id="mask">
        
       <img id="close" src="images/x.jpg" onclick="moveback()">
        <div class="navigation">
            <nav class="navigation-list">
              <ul>
                    <li><a href="welcome.mc">HOME</a></li>
                    <li><a href="login.mc">LOGIN</a></li>
                    <li id="id01" class="modal"><a href="signup.mc">JOIN US</a></li>
          
                </ul>
            </nav>
        </div>

    </div>
<script>
function moveback() {
    location.href = "welcome.mc";
}
</script>
</body>
</html>
