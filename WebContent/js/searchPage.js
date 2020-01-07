var movieID1 = "";
var title1 = "";
var openYear1 = "";


$(document).ready(function(){
	  var api_key = "55d244c83c49693b6fd6606c768103eb";

	  url = "https://api.themoviedb.org/3/search/movie?api_key=" + api_key + "&language=ko-KR&query=" + mvName +"&page=1";

	  $.ajax({
	    url : url,
	    type : "GET",
	    cache : false,
	    success : function(data, status) {
	      if(status == "success") {
	        // 무비DB 영화정보 접근
	        getMovieInfo(data, api_key, mvName);
	      } else {
	        alert("에러");
	        history.back();
	      }
	    }
	  });
	  
	  
});


function getMovieInfo(jsonObj, api_key, mvName) {
	
	var results = jsonObj.results;
	var imgUrl = "http://image.tmdb.org/t/p/w500";
	
	
	if(jsonObj.total_results > 0) {
		
		for(var i = 1; i <= results.length; i++) {
			$(".mv_poster" + i + " > img").attr("src" , (imgUrl + results[i - 1].poster_path));
			$(".container" + i).css("display", "block");
			$(".subject" + i).html(results[i-1].title);
			$(".release_date" + i).html(results[i-1].release_date);
			
		}

		
	} else {
		alert("해당 영화가 존재하지 않습니다");
		history.back();
	}
	
	
	
	
	
	// 포스터 클릭
	
	$(".container" + 1).click(function(){
		movieID1 = results[0].id;
		title1 = results[0].title;
		openYear1 = results[0].release_date.trim().split("-")[0];
		
		// 위 3개 변수(MovieDB) mv_info에 request.setAttr 작업
		alert(movieID1 + " , " + title1 + " , "  + openYear1);
	});
	$(".container" + 2).click(function(){
		movieID1 = results[1].id;
		title1 = results[1].title;
		openYear1 = results[1].release_date.trim().split("-")[0];
		
		// 위 3개 변수(MovieDB) mv_info에 request.setAttr 작업
		alert(movieID1 + " , " + title1 + " , "  + openYear1);
	});
	$(".container" + 3).click(function(){
		movieID1 = results[2].id;
		title1 = results[2].title;
		openYear1 = results[2].release_date.trim().split("-")[0];
		
		// 위 3개 변수(MovieDB) mv_info에 request.setAttr 작업
		alert(movieID1 + " , " + title1 + " , "  + openYear1);
	});
	$(".container" + 4).click(function(){
		movieID1 = results[3].id;
		title1 = results[3].title;
		openYear1 = results[3].release_date.trim().split("-")[0];
		
		// 위 3개 변수(MovieDB) mv_info에 request.setAttr 작업
		alert(movieID1 + " , " + title1 + " , "  + openYear1);
	});
	$(".container" + 5).click(function(){
		movieID1 = results[4].id;
		title1 = results[4].title;
		openYear1 = results[4].release_date.trim().split("-")[0];
		
		// 위 3개 변수(MovieDB) mv_info에 request.setAttr 작업
		alert(movieID1 + " , " + title1 + " , "  + openYear1);
	});
	$(".container" + 6).click(function(){
		movieID1 = results[5].id;
		title1 = results[5].title;
		openYear1 = results[5].release_date.trim().split("-")[0];
		
		// 위 3개 변수(MovieDB) mv_info에 request.setAttr 작업
		alert(movieID1 + " , " + title1 + " , "  + openYear1);
	});
	$(".container" + 7).click(function(){
		movieID1 = results[6].id;
		title1 = results[6].title;
		openYear1 = results[6].release_date.trim().split("-")[0];
		
		// 위 3개 변수(MovieDB) mv_info에 request.setAttr 작업
		alert(movieID1 + " , " + title1 + " , "  + openYear1);
	});
	$(".container" + 8).click(function(){
		movieID1 = results[7].id;
		title1 = results[7].title;
		openYear1 = results[7].release_date.trim().split("-")[0];
		
		// 위 3개 변수(MovieDB) mv_info에 request.setAttr 작업
		alert(movieID1 + " , " + title1 + " , "  + openYear1);
	});
	
}






