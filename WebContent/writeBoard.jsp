<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>writeBoard</title>
    <link href="https://fonts.googleapis.com/css?family=Bad+Script&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="js/header.js" type="text/javascript"></script>
    <script src="js/writeBoard.js" type="text/javascript"></script>


    <link rel="stylesheet" href="css/header.css">
    <link href="css/writeBoard.css" rel="stylesheet" type="text/css">
    <link href="css/footer.css" rel="stylesheet" type="text/css">
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

    <!-- 게시판 작성 시작 -->

    <div id = "window">
        <div id = "review_title"> 
            <h2>리뷰작성</h2>
        </div>

        <div id = "Write">
            <form action = "#" method="GET" id = "write">
                <div class = "box">
                    <label for = "movieName"><b>제목</b></label>
                    <input type ="text" id = "review_info" name = "movieName" required>
                </div>

                <div class = "box">
                    <label for = "date"><b>별점</b></label>
                    <!-- <input type = "text"  id = "review_info1" name = "date"> -->
                    <div class="starRev">
                        <span class="starR on">별1</span>
                        <span class="starR">별2</span>
                        <span class="starR">별3</span>
                        <span class="starR">별4</span>
                        <span class="starR">별5</span>
                        <span class="starR">별6</span>
                        <span class="starR">별7</span>
                        <span class="starR">별8</span>
                        <span class="starR">별9</span>
                        <span class="starR">별10</span>
                      </div>
                </div>

                <!-- <div class= "box">
                    <label for = "place"><b>장소</b></label>
                    <input type = "text" id = "review_info1" name = "place">
                </div> -->

                <div class = "box">
                    <textarea id = "review_content" name = "content"></textarea>
                    <!-- <input type = "text" id = "review_content" name = "content" required>  -->
                </div>

                <div class ="button">
                <button type = "submit" id = "review_btn">완료</button>
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