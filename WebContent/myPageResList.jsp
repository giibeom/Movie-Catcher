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
<title>my Page</title>
<link href="css/myPageResList.css" rel="stylesheet" type="text/css">
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
<body>


<div id="main">
    <div class="container">
        <div class="container_box">
   
        <h2>예매 내역</h2>
        <div class="content_box">
            <table>
                <tr>
                    <th>No.</th>
                    <th>영화명</th>
                    <th>날짜</th>
                    <th>장소</th>
                    <th>인원</th>
                    <th>결제금액</th>
                    <th>리뷰 작성하러 가기</th>
                </tr>
                <tr>
                    <td>1</td>
                    <td>백두산</td>
                    <td>2019-12-29</td>
                    <td>메가박스 강남점</td>
                    <td>2</td>
                    <td>18,000</td>
                    <td><a href="writeBoard.html">리뷰 작성</a></td>
                </tr>
                <tr>
                    <td>2</th>
                    <td>겨울왕국</td>
                    <td>2019-12-27</td>
                    <td>CGV 목동점</td>
                    <td>1</td>
                    <td>8,000</td>
                    <td><a href="writeBoard.html">리뷰 작성</a></td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>영화제목</td>
                    <td>관람 날짜</td>
                    <td>관람 장소</td>
                    <td>몇명</td>
                    <td>결제 금액</td>
                    <td><a href="writeBoard.html">리뷰 작성</a></td>
                </tr>
            </table>


        </div>
        </div>
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
    