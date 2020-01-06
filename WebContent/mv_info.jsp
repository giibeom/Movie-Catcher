<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String movieName = request.getParameter("movieName");
	String movieId = request.getParameter("movieId");
%>
<script>
	var mvName = "<%= movieName %>";
	var mvId = "<%= movieId %>";
</script>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/header.css">
    <link href="css/footer.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="css/my_info.css">
    <link href="https://fonts.googleapis.com/css?family=Bad+Script&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto&display=swap" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="js/header.js" type="text/javascript"></script>
    <script type="text/javascript" language="javascript" src="js/rollingSlider.js"></script>
    <script type="text/javascript" src="js/mv_info.js"></script>
    
    <!-- <link href = "css/public.css" rel="stylesheet" type="text/css"> -->

    <title>영화상세정보</title>
    
</head>
<body>
        <!-- header -->
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

    <div class="body">
    
        <div class="col-6 container" style="height: 600px;">
            <img id="mainPoster" src="" style="width: 80%; height: 550px;">
        </div>

        <div class="col-6">
        <div class="container">
            
            <div id = "mv">
            <div id="mv_title"></div><!-- list -->
            <div id="mv_avg"></div><!-- movie db -->
            <!-- <button type = "button" id = "mv_resv">예매하기</button> -->
            <hr>

            <span><h4>감독 : </h4></span>
            <!-- 반복문으로 span생성(배열) list -->
            <span id="directors"></span>
            <br>

            <span><h4>배우(배역) : </h4></span>
            <!-- 반복문으로 span생성(배열) info -->
            <span id="actors"></span>
            <br>

            <span><h4>장르: </h4></span>
             <!-- 반복문으로 span생성(배열) list-->
            <span id="genre"></span>
            <br>

            <span><h4>러닝타임 : </h4></span>
            <!-- 분은 뒤에 따로 문자열 추가 list-->
            <span id="showTm"></span>
            <br>

            <span><h4>관람등급 : </h4></span>
            <!-- list -->
            <span id="watchGrade"></span>
            <br>

            <span><h4>개봉일 : </h4></span>
            <!-- .붙여주는 작업 필요 list -->
            <span id="date"></span>

            </div>
        </div>

        <div class="container" id="overview">

        </div>
    </div>


    <div style="height: 0px;" class="clear"></div> <!-- height 20px - > 0 px-->
    
    <div id="steelCut" class="container" style="height: 400px;">
            <h3>스틸컷</h3>
            <div id="scrolling" class="container" style="position:relative;overflow:hidden;width:100%;height:300px;"></div> <!-- height 400px - >300px width 100 -> 95 -->
            
            <!-- 버튼이미지 필요 -->
            <div id="leftBtn">
                <img src ="images/left_2.png" style = "width: 30px; height: 40px;">
            </div>
            <div id="rightBtn">
                <img src ="images/right_2.png" style="width: 30px; height: 40px;">
            </div>
    </div>
        
    
    <div style="height: 0px;" class="clear"></div>

    <div class="container col-6">
        <img id="teaserNull" src="https://previews.123rf.com/images/tawatchaimaneewan/tawatchaimaneewan1504/tawatchaimaneewan150400311/38941943-%EB%8F%99%EC%98%81%EC%83%81-%EC%97%86%EC%9D%8C.jpg" style="display: none; width: 100%; height: 300px;">
        <iframe id="mv_teaser" src="" frameborder="0" width="100%" height="100%" allowfullscreen></iframe> 
    </div>




    <div class="container col-6"><h3>Review</h3>
        <div id ="review">
            <div id = "review_title">영화제목</div>

            <div id = "review-a">
                <span>사용자 아이디</span>
                <div>내용</div>
            </div>
            <div id = "review-b">
                <span>사용자 아이디</span>
                <div>내용</div>
            </div>
        </div>

    </div>

    </div>
    <div style ="height: 80px;"class="clear"></div>




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