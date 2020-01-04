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
    <script src="js/findcinema.js" type="text/javascript"></script>


    <link rel="stylesheet" href="css/header.css">
    <link href="css/findcinema.css" rel="stylesheet" type="text/css">
    <link href="css/footer.css" rel="stylesheet" type="text/css">
</head>
<body>
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

    <!-- 게시판 작성 시작 -->

    <div id = "window">
        <div id = "find_title">
            <h2>극장찾기</h2>
        </div>
        
        <script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

        <div class = "col-6" id = "cinema"> 
            <!-- 다음 주소 검색 이용하기 -->
            <form id = "find">
                <!-- <div id = "find-a">
                <label for = "addr">주소검색</label>
                </div>
                <input type = "text" id = "addr" name ="address" placeholder="주소검색">
           
                <label for = "addr-d"> 도 </label>
                <input type = "text" id = "addr-d" name = "address-d" placeholder="서울">

                <label for = "addr-s">시 / 군 / 구</label>
                <input type = "text" id = "addr-s" name = "address-s" placeholder="강남구">

                <label for = "addr-r">도로명 주소</label>
                <input type = "text" id = "addr-r" name = "address-r" placeholder="...">


                <input type ="submit" value = "검색하기">
            </form> -->

            <input type="text" id="sample6_postcode" value = "" placeholder="우편번호">
            <input type="text" id="sample6_address" value = "" placeholder="주소"><br>
            <input type="text" id="sample6_detailAddress"  value = "" placeholder="상세주소">
            <input type="text" id="sample6_extraAddress" value = "" placeholder="참고항목">
            <input type="submit" onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br>

            
            
        </div>


        <div class = "col-62" id = "map">
            <!-- 지도 넣을 곳(일단 사진)-->
            <div>
                <img src = "images/main3.jpg" style="width: 100%; height: 350px;">
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
<!--     
    <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=8d892eed4bc5524e1f6fc7e3e00e7ab4"></script>
    <script>
		var container = document.getElementById('map');
		var options = {
			center: new kakao.maps.LatLng(33.450701, 126.570667),
			level: 3
		};

		var map = new kakao.maps.Map(container, options);
	</script> -->
</body>
</html>