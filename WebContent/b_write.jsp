<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>


<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Movie CATCHER ADMIN</title>
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/footer.css">
<link rel="stylesheet" href="css/b_write.css">

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
</head>

<script>
    function chkSubmit(){
        frm = document.forms["frm"];
        
        var b_title = frm["b_title"].value.trim();
        var b_content = frm["b_content"].value.trim();
        
        if(b_title == ""){
            alert("제목을 입력해주세요.");
            frm["b_title"].focus();
            return false;
        }
        if(b_content == ""){
            alert("내용을 입력해주세요.");
            frm["b_content"].focus();
            return false;
        }
        
        return true;
    }
    </script>

<body>
	<header>
		<div class="topnav" id="myTopnav">
			<h1 id="title">
				<a href="welcome.html">MOVIE CATCHER</a>
			</h1>
		</div>
	</header>

    <div id="window">
	    <div id="b_board_title">
		<h2>Board Write</h2>
		</div>
		
		<div id="write"> 
			<form name="frm" action="b_writeOk.mc" method="post" onsubmit="return chkSubmit()">
			
			
				<div class="box">
                    <label><b>제목</b></label>
                    <input type = "text" id="b_write1" name = "b_title">
                </div>
                
                <div class="box">
                    <textarea id="b_write2" name="b_content"></textarea>
                </div>
			
					<div id="button">
					<input id="submit" type="submit" value="등록"/>
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