var data = [];
var today = new Date();
var theaterNameInfo = "CGV강변";
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

$(document).ready(function() {

							$(".areaClick").click(function() {
								$(".onClick").removeClass("onClick");
								$(this).addClass("onClick");
								var areaName = $(this).attr("class");
								var areaCode = areaName.split(" ")[1];
								$(".areaZone").hide();
								$(".t" + areaCode).show();
							});

					$(".theaterSelect").click(function() {
										$("#demoJSON").html("");
										var theaterName = $(this).attr("class");
										theaterNameInfo = theaterName.split(" ")[1];
										var theaterCode = theaterNames.split(" ")[2];
										var jsonurl = "http://localhost:8082/Movie_Catcher/ticket.ajax?reqType=json&theaterCode="
												+ theaterCode;
										$.ajax({
											url : jsonurl,
											type : "GET",
											cache : false,
											success : function(data, status) {
												if (status == "success")
													parseJSON(data);
											}
										})
									
					
					
					
					});
					
					
					
					
					
				});



window.onload = function() {
	getTheater1();
	
}

function getTheater1() {
	var jsonurl = "http://localhost:8082/Movie_Catcher/ticket.ajax?reqType=json&theaterCode=0001";
	$.ajax({
		url : jsonurl,
		type : "GET",
		cache : false,
		success : function(data, status) {
			if (status == "success")
				parseJSON(data);
		}
	});
}

function parseJSON(jsonObj) {
	var arr = jsonObj.DataList;
	var timeTable = "<div class='theaterNameInfo'>" + theaterNameInfo
			+ "점의 상영 시간표입니다.</div><div>";
	for (var i = 0; i < arr.length; i++) {
		var movieName = arr[i].h_movie;
		var movieGrade = arr[i].h_grade;
		if (i > 0) {
			if (arr[i - 1].h_movie != arr[i].h_movie) {
				timeTable += "<div class='movietitle'><div class='movieName'>"
						+ movieName + "</div><div class='movieGrade'>관람등급" + movieGrade + "</div>";

			}

		} else if (i == 0) {
			timeTable += "<div class='movietitle'><div class='movieName'>"
					+ movieName + "</div><div class='movieGrade'>관람등급" + movieGrade + "</div>";
		}

		var hallLocation = arr[i].hallLocation;
		var hallType = arr[i].hallType;
		var hallSize = arr[i].hallSize;
		if (i > 0) {
			if (arr[i - 1].hallLocation != arr[i].hallLocation
					|| arr[i - 1].hallType != arr[i].hallType
					|| arr[i - 1].hallSize != arr[i].hallSize) {
				timeTable += "<div class='hall'><div class='hallinfo'>"
						+ hallLocation + "\t" + hallType + "\t" + hallSize
						+ "</div>";
			} else if (arr[i - 1].h_movie != arr[i].h_movie) {
						+ hallLocation + "\t" + hallType + "\t" + hallSize
						+ "</div>";
			}
		} else if (i == 0) {
			timeTable += "<div class='hall'><div class='hallinfo'>"
					+ hallLocation + "\t" + hallType + "\t" + hallSize
					+ "</div>";
		}

		var movietime = arr[i].movietime;
		movietime = movietime.substring(0, 2) + ":" + movietime.substring(2);
		var restSeat = arr[i].restSeat;
		restSeat = restSeat + "석"
		timeTable += "<div class='ticket " + arr[i].t_uid + "'>" + movietime
				+ "<br>" + restSeat + "</div>";

		if (i < arr.length - 1) {
			if (arr[i].hallLocation != arr[i + 1].hallLocation
					|| arr[i].hallType != arr[i + 1].hallType
					|| arr[i].hallSize != arr[i + 1].hallSize) {
				timeTable += "</div>";
			}
			if (arr[i].h_movie != arr[i + 1].h_movie) {
				timeTable += "</div>";
			}
			if (arr[i].h_movie != arr[i + 1].h_movie
					&& arr[i].hallLocation == arr[i + 1].hallLocation
					&& arr[i].hallType == arr[i + 1].hallType) {
				timeTable += "</div>";
			}
		}
		if (i == arr.length - 1) {
			timeTable += "</div></div>";
		}

	}
	timeTable += "</div>";
	$("#demoJSON").html(timeTable);
	$(".ticket").click(function(e) {
		e.preventDefault();
		var t_uid = $(this).attr("class");
		t_uid = t_uid.split(" ")[1];
		location.href = "bookingStep2.mc?t_uid=" + t_uid;
	});
}
