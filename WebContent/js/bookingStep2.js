var seatRow;
var pNum = 0;
var selectNum = 0;
var totalPeople = "";
var seats = "";
var seatArray = ["", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "U"];
var row = 1;
var selectSeats = [];

function fn(str){
    var res;
    res = str.replace(/[^0-9]/g,"");
    return res;
}

var hallSeat = fn(hallSize);

$(document).ready(function(){
	if(hallSeat <= 80){
		seatRow = hallSeat % 8;
		for(var i = 0; i < hallSeat;){
			seats += "<ul class='seatrow'><li class='rowfirst seatLine'>" + seatArray[row] + "</li>";
			for(var j = 1; j <= 8 ; j ++){
				seats += "<li class='seatLine" + j + "'><div class='everySeat eachSeat" + j + " seat" + seatArray[row] + j +"'>" + j + "</div></li>";
				i++;
				if(i == hallSeat) break;
			}
			seats += "</ul>";
			row ++;
		}
		$('#selectSeat').html(seats);
		doRandom();
	}
	if(80 < hallSeat && hallSeat <= 196){
		seatRow = hallSeat % 12;
		for(var i = 0; i < hallSeat;){
			seats += "<ul class='seatrow'><li class='rowfirst seatLine'>" + seatArray[row] + "</li>";
			for(var j = 1; j <= 12 ; j ++){
				seats += "<li class='seatLine" + j + "'><div class='everySeat eachSeat" + j + " seat" + seatArray[row] + j +"'>" + j + "</div></li>";
				i++;
				if(i == hallSeat) break;
			}
			seats += "</ul>";
			row ++;
		}
		$('#selectSeat').html(seats);
		doRandom();
	}
	if(196 < hallSeat && hallSeat <= 250){
		seatRow = hallSeat % 16;
		for(var i = 0; i < hallSeat;){
			seats += "<ul class='seatrow'><li class='rowfirst seatLine'>" + seatArray[row] + "</li>";
			for(var j = 1; j <= 16 ; j ++){
				seats += "<li class='seatLine" + j + "'><div class='everySeat eachSeat" + j + " seat" + seatArray[row] + j +"'>" + j + "</div></li>";
				i++;
				if(i == hallSeat) break;
			}
			seats += "</ul>";
			row ++;
		}
		$('#selectSeat').html(seats);
		doRandom();
	}
	if(250< hallSeat && hallSeat <= 400){
		seatRow = hallSeat % 24;
		for(var i = 0; i < hallSeat;){
			seats += "<ul class='seatrow'><li class='rowfirst seatLine'>" + seatArray[row] + "</li>";
			for(var j = 1; j <= 24 ; j ++){
				seats += "<li class='seatLine" + j + "'><div class='everySeat eachSeat" + j + " seat" + seatArray[row] + j +"'>" + j + "</div></li>";
				i++;
				if(i == hallSeat) break;
			}
			seats += "</ul>";
			row ++;
		}
		$('#selectSeat').html(seats);
		doRandom();
	}
	if(400 < hallSeat){
		seatRow = hallSeat % 32;
		for(var i = 0; i < hallSeat;){
			seats += "<ul class='seatrow'><li class='rowfirst seatLine'>" + seatArray[row] + "</li>";
			for(var j = 1; j <= 32 ; j ++){
				seats += "<li class='seatLine" + j + "'><div class='everySeat eachSeat" + j + " seat" + seatArray[row] + j +"'>" + j + "</div></li>";
				i++;
				if(i == hallSeat) break;
			}
			seats += "</ul>";
			row ++;
		}
		$('#selectSeat').html(seats);
		doRandom();
	}
	
	$("#pNumChk").click(function(){
		var general = $("#general").val();
		var teenager = $("#teenager").val();
		var special = $("#special").val();
		var totalNumber = "";
		if(general != 0){
			totalNumber += "성인 " + general + "명 ";
			totalPeople += "g"+general;
		}
		if(teenager != 0){
			totalNumber += "청소년 " + teenager + "명 ";
			totalPeople += "t"+ teenager;
		}
		if(special != 0){
			totalNumber += "우대 " + special + "명 "
			totalPeople += "s"+special;
		}
		$("#totalNumber").text(totalNumber);
		pNum = general*1 + teenager*1 + special*1;
		selectingSeat(pNum);
	});
	
	$("#goPayment").click(function(){
		if(pNum != 0 && pNum ==selectNum){
			var selectedSeats = "";
			for(var i = 0; i < selectSeats.length; i++ ){
				selectedSeats += selectSeats[i];
				if(i <selectSeats.length -1){
					selectedSeats += ",";
				}
			}
			location.href="bookingStep3.mc?selectedSeats="+selectedSeats + "&t_uid="+ t_uid+ "&pNum=" + totalPeople;
			
		}else{
			alert("인원과 좌석을 선택해주세요");
		}
	});
	
	$("#reSelectSeat").click(function(){
		$("#nowSelectSeat").text("");
		selectNum = 0;
		selectSeats = [];
		$(".onSelect").removeClass("onSelect");
	});
});

function selectingSeat(pNum){
	var total = pNum*1;
	selectNum = 0;
	$(".everySeat").click(function(){
		if(selectNum < total && $(this).text() != "X" && !($(this).attr('class').includes("onSelect")) ){
			var seatName = $(this).attr("class");
			$(this).addClass("onSelect");
			seatName = seatName.split(" ")[2];
			seatName = seatName.replace("seat", "");	
			var nowSelectSeat = $("#nowSelectSeat").text();
			$("#nowSelectSeat").text(nowSelectSeat + " " + seatName);
			selectSeats[selectNum] = seatName; 
			selectNum ++;		
		}
	});
}



function doRandom(){
	var reservedSeat = hallSeat - restSeat;
	for(var i = 0; i < reservedSeat; i++){
		while(true){
			var doRan = makeX();
			if (doRan == 1){
				break;
			}
		}
	}
}

function makeX(){
	if(hallSeat < 80){
		var rSeat = Math.floor(Math.random() * hallSeat) + 1;
		var rRow = parseInt(rSeat / 8) + 1;
		var rColumn = rSeat % 8 +1 ;
		var seatChk = $(".seat" + seatArray[rRow] + rColumn).text();
		if(seatChk == "X"){
			return 0;
		}else{
			$(".seat" + seatArray[rRow] + rColumn).css("background-color", "#bbb")
			$(".seat" + seatArray[rRow] + rColumn).text("X");
			return 1;
		}
		
	}
	if(80 < hallSeat && hallSeat <= 196){
		var rSeat = Math.floor(Math.random() * hallSeat) + 1;
		var rRow = parseInt(rSeat / 12) + 1;
		var rColumn = rSeat % 12 +1;
		var seatChk = $(".seat" + seatArray[rRow] + rColumn).text();
		if(seatChk == "X"){
			return 0;
		}else{
			$(".seat" + seatArray[rRow] + rColumn).css("background-color", "#bbb")
			$(".seat" + seatArray[rRow] + rColumn).text("X");
			return 1;
		}

	}
	if(196 < hallSeat && hallSeat <= 250){
		var rSeat = Math.floor(Math.random() * hallSeat) + 1;
		var rRow = parseInt(rSeat / 16) + 1;
		var rColumn = rSeat % 16 + 1;
		var seatChk = $(".seat" + seatArray[rRow] + rColumn).text();
		if(seatChk == "X"){
			return 0;
		}else{
			$(".seat" + seatArray[rRow] + rColumn).css("background-color", "#bbb")
			$(".seat" + seatArray[rRow] + rColumn).text("X");
			return 1;
		} 

	}
	if(250 < hallSeat && hallSeat <= 400){
		var rSeat = Math.floor(Math.random() * hallSeat) + 1;
		var rRow = parseInt(rSeat / 24) + 1;
		var rColumn = rSeat % 24 + 1;
		var seatChk = $(".seat" + seatArray[rRow] + rColumn).text();
		if(seatChk == "X"){
			return 0;
		}else{
			$(".seat" + seatArray[rRow] + rColumn).css("background-color", "#bbb")
			$(".seat" + seatArray[rRow] + rColumn).text("X");
			return 1;
		}
	}
	if(400 < hallSeat){
		var rSeat = Math.floor(Math.random() * hallSeat) + 1;
		var rRow = parseInt(rSeat / 32) + 1;
		var rColumn = rSeat % 32 + 1;
		var seatChk = $(".seat" + seatArray[rRow] + rColumn).text();
		if(seatChk == "X"){
			return 0;
		}else{
			$(".seat" + seatArray[rRow] + rColumn).css("background-color", "#bbb")
			$(".seat" + seatArray[rRow] + rColumn).text("X");
			return 1;
		}

	}
}