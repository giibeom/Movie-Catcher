<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link href="https://fonts.googleapis.com/css?family=Bad+Script&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto&display=swap" rel="stylesheet">


    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/header.css">
    <link rel="stylesheet" href="css/footer.css">
    <link href="css/main.css" rel="stylesheet" type="text/css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="js/header.js" type="text/javascript"></script>

    <script src="https://code.jquery.com/jquery-2.2.3.min.js"></script>
    <script src="js/main.js" type="text/javascript"></script>
    <script type="text/javascript" language="javascript" src="js/rollingSlider.js"></script>
    <title>Movie catcher</title>

</head>
<body>
    <header>
        <div class="topnav" id="myTopnav">
            <h1 id="title"><a href="welcome.html">MOVIE CATCHER</a></h1>
            <div id="nav_ul">
                <ul>
                    <li class="icon clear"><a href="javascript:void(0);" onclick="myFunction()">
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

    <article>
        <!-- 검색창-->
        <!-- <div class="col-8" id="search"> -->
        <div class="col-12 d1">
            <form>
                <input type="text" placeholder="검색어 입력">
                <button type="submit"><img id="m_icon" src="images/m_icon_3.png"></button>
            </form>
        </div>
        <div class="clear"></div>



        <!-- Slideshow container-->
        <div class="col-9">
            <div id = "Teasers">

            </div>
        </div>


        <!-- box office-->
        <div class="col-3" id="box">
            <h2>Box Office</h2>
            <div>
                <!-- 일간 박스오피스 랭크-->
                <ul id="boxrank">
                </ul>
            </div>
            <div>
                <button type="button" id="resv">Reserve</button>
            </div>
        </div>

        <div class="clear"></div>
        <!-- 그냥 버튼클릭용 -->
        <div class="col-12" id="tabs">
            <div id="tabM">
                <div id="movieSelectButton">
                    <div id="showNowIn">최신 상영작</div>
                    <div id="showUpComing">상영 예정작</div>
                </div>

                <div id=""></div>
            </div>
        </div>

        <div class="clear"></div>

        <!-- 최신 상영작 포스터들-->
        <div class="col-12" id="posterLines">
            <!-- 최신 상영작-->
            <div id="nowIn"></div>
            <!-- 상영 예정작-->
            <div id="upComing"></div>
        </div>

        <div class="clear"></div>

        <!-- 누적관객수 랭킹  -->
        <div class="col-6 rankAudience">
            <div class="">
                누적 관객수 랭킹
            </div>
            <div>
                <ul id = "rankAudience">                
                </ul>
            </div>

        </div>
        
        <!-- 주말 박스오피스 랭킹 -->
        <div class="col-6 rankweek">
            <div>
                주말 박스오피스 랭킹
            </div>
            <div>
                <ul id="weekRanking">
                </ul>
            </div>
        </div>
        
    <div class="clear"></div>

    </article>

    <div class="clear"></div>

    <!-- 푸터 -->
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
