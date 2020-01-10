$(document).ready(function(){
	
	$("#submit").click(function(e){
		 e.preventDefault();
		var search = $("#searchMovieReview").val().trim();
		
		if(search.length > 0) {
			location.href = "http://localhost:8082/Movie_Catcher/review.mc?movieName=" + search;
		} else {
			location.href = "http://localhost:8082/Movie_Catcher/review.mc";
		}
		
	});
	
	
});