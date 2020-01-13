<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<% String movieName = request.getParameter("movieName");
if(movieName == null){
   movieName = "";
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MOVIE CATCHER</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/review.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Bad+Script&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto&display=swap" rel="stylesheet">
<script src="http://code.jquery.com/jquery-1.12.4.min.js"></script>
<link href="css/footer.css" rel="stylesheet" type="text/css">
<link href="css/header.css" rel="stylesheet" type="text/css">
<link href = "css/public.css" rel="stylesheet" type="text/css">
<script src="js/header.js" type="text/javascript"></script>
<script src="js/review.js" type="text/javascript"></script>

</head>

<link rel="stylesheet" type="text/css" href="css/common.css"/>
<script src="https://kit.fontawesome.com/bb29575d31.js"></script>


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
    
    

    

   <section class="review">
       <div class="review_background"></div>
       <div class="contentWrap">
       <h3>영화 리뷰</h3>
       <div class="d1">
          <form>
              <input id="searchMovieReview" type="text" placeholder="영화 제목">
              <button id="submit"><img id="m_icon" src="images/m_icon_3.png"></button>
           </form>
         </div>
         
         
         
         
       <div class="reviewBox">
           <ul class="reviewWrap">
           
              <c:forEach var="dto" items="${list }" varStatus="status">
                       <li>
                      <div class="reviewer">
                          <div class="review_des_title">
                          <div class="script">
                              <div class="rName">"${dto.rv_id }"</div>
                              <div class="rStar">평점 : ${dto.rv_star }</div>
                          </div>
                          <div class="rMovieTitle">${dto.rv_title }</div>
                          <div class="rDesc"><p>${dto.rv_content }</p></div>
                              <div class="rDate">${dto.rv_date }</div></div>
                      </div>
                  </li>
             </c:forEach>
           </ul>
=======
	<section class="review">
	    <div class="review_background"></div>
	    <div class="contentWrap">
	    
	    <% if(movieName.length() == 0) { %>
	    	<h3>영화 리뷰</h3>
	    <%} else { %>
	    	<h3>검색하신 "<%=movieName %>" 의 연관된 영화 리뷰</h3>
	    <%} %>
	    
	    
	    <div class="d1">
	    	<form>
		        <input id="searchMovieReview" type="text" placeholder="영화 제목">
		        <button id="submit"><img id="m_icon" src="images/m_icon_3.png"></button>
	        </form>
	      </div>
	      
	      
	      
	      
	    <div class="reviewBox">
	        <ul class="reviewWrap">
	        
		        <c:forEach var="dto" items="${list }" varStatus="status">
		       		    <li>
		                <div class="reviewer">
		                    <div class="review_des_title">
		                    <div class="script">
		                        <div class="rName">"${dto.rv_id }"</div>
		                        <div class="rStar">평점 : ${dto.rv_star }</div>
		                    </div>
		                    <div class="rMovieTitle">${dto.rv_title }</div>
		                    <div class="rDesc"><p>${dto.rv_content }</p></div>
		                        <div class="rDate">${dto.rv_date }</div></div>
		                </div>
		            </li>
			 	</c:forEach>
	        </ul>
>>>>>>> branch 'master' of https://github.com/ksi0678/Movie-Catcher.git
  

         
   <jsp:include page="pagination.jsp">
      <jsp:param value="${writePages }" name="writePages"/>
      <jsp:param value="${totalPage }" name="totalPage"/>
      <jsp:param value="${page }" name="page"/>
      <jsp:param value="${param.movieName }" name="movieName"/>
   </jsp:include>
   
   </div>  

</div>


</section>
<<<<<<< HEAD
   
   




=======
	
>>>>>>> branch 'master' of https://github.com/ksi0678/Movie-Catcher.git


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