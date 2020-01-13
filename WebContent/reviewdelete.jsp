<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <link rel="stylesheet" href="css/header.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 <script src="js/header.js" type="text/javascript"></script>
 <link href="https://fonts.googleapis.com/css?family=Bad+Script&display=swap" rel="stylesheet">
 <link href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto&display=swap" rel="stylesheet">
<title>Review Delete</title>
<link href="css/reviewdelete.css" rel="stylesheet" type="text/css">
<link href="css/footer.css" rel="stylesheet" type="text/css">

</head>
<body>
 <!-- header -->

 <header>
    <div class="topnav" id="myTopnav">
        <h1 id="title"><a href="welcome.html">MOVIE CATCHER</a></h1>
            
        <div id="nav_ul">
        <ul>
            <li  class="icon clear" ><a href="javascript:void(0);"onclick="myFunction()">
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

    <!-- 게시판 작성 시작 -->

    <div id = "window">
        <div id = "review_title"> 
            <h2>리뷰삭제</h2>
        </div>

        <div id = "Write">
            <form action = "#" method="GET" id = "write">
                <div class = "box">
                    <label for = "movieName"><b>영 화 명 :</b></label>
                    <div id="reviewsend" ><b>백두산</b></div> </div>
                
                <div class = "box">
                    <label for = "date"><b>날 짜 :</b></label>
                    <div id="reviewsend" ><b>2019-12-30</b></div> </div>
             

                <div class= "box">
                    <label for = "place"><b>장 소 :</b></label>
                    <div id="reviewsend" ><b>CGV 강남점</b></div> </div>
                    
                <div class= "box">
                    <label for = "place"><b>평 점 :</b></label>
                    <div id="reviewsend" ><b>5.4</b></div> </div>
               

                <div class = "box">
                    <label for = "place"><b>리뷰 글 :</b></label>
                    <div id="reviewsend" ><b>아하하하하 영화보고싶네요 하하하하하</b></div> </div>
              

                <div class ="button">
                <button type = "submit" id = "review_btn">삭제</button>
                </div> 
            </form>
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