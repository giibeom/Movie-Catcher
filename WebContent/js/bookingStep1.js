var data = [];
var today = new Date();
var dd = today.getDate();
var mm = today.getMonth() + 1;
var yyyy = today.getFullYear();
dd = dd - 1;
if (dd < 10) {
	dd = '0' + dd;
}
if (mm < 10) {
	mm = '0' + mm;
}
today = yyyy + '' + mm + dd;
var nowchk = 0;

$(document)
		.ready(
				function() {
					var url = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=430156241533f1d058c603178cc3ca0e&targetDt="
							+ today;
					$.ajax({
						url : url,
						type : "GET",
						cache : false,
						success : function(data, status) {
							if (status == "success")
								getBoxOffice(data);
						}
					});
				});

function getBoxOffice(jsonObj) {
	var arr = jsonObj.boxOfficeResult.dailyBoxOfficeList;
	for (var i = 0; i < 10; i++) {
		getRankPoster(arr[i].movieNm, i);
	}
}

function getRankPoster(movieName, rank) {
	checkMovieName = movieName.split(" ")[0];
	var url = "https://api.themoviedb.org/3/search/movie?api_key=55d244c83c49693b6fd6606c768103eb&language=ko-KR&query="
			+ checkMovieName + "&include_adult=false";
	$.ajax({
		url : url,
		type : "GET",
		cache : false,
		success : function(data, status) {
			if (status == "success")
				getPoster(data, movieName, rank);
		}
	});

};

function getPoster(jsonObj, movieName, rank) {
	var arr = jsonObj.results;
	var poster;
	var vote;
	for (var i = 0; i < arr.length; i++) {
		if (((arr[i].title) == (movieName))
				|| (((arr[i].title).toLowerCase().split(" ").join(""))
						.match(movieName.toLowerCase().split(" ").join("")))) {
			poster = arr[i].poster_path;

			break;
		}
	}
	if (poster == null) {
		poster = arr[0].poster_path;

	}

	data[rank] = "<img src='http://image.tmdb.org/t/p/w500" + poster
			+ "' width='200px' height='280px'>";
	nowchk++;
	if (nowchk == 10) {
		bookingStep();
	}

};

function bookingStep() {

	jQuery("#scrolling").srolling({
		data : data,
		auto : true,
		item_count : 1,
		cache_count : 5,
		width : 200,
		height : 280,
		delay_frame : 500,
		move : 'left',
		prev : '#leftBtn',
		next : '#rightBtn',
	});
};

$(function() {
	$("#datepicker").datepicker({
		dateFormat : 'yy/mm/dd',
		showMonthAfterYear : false,
		changeMonth : true,
		changeYear : true,
		minDate : -0,
		maxDate : +5,

	});
});

$(document).ready(function(){
	$(".areaClick").click(function(){
		var areaName = $(this).attr("class");
		var areaCode = areaName.split(" ")[1];
		$(".areaZone").hide();
		$(".t"+ areaCode).show();
	});
	
	$(".theaterSelect").click(function(){
		var theaterName = $(this).attr("class");
		var theaterCode = theaterName.split(" ")[2];
		var url = url = "http://localhost:8081/Movie Catcher/ticket.ajax?reqType=json&theaterCode=" + theaterCode;
		$.ajax({
			url : url,
			type : "GET",
			cache : false,
			success : function(data, status){
				if(status == "success") parseJSON(data);
			}
		})
	});
});
