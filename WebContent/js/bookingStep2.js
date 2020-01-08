var seatRow;
var seats = "";
var seatArray = ["", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q"];
var row = 1;

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
			seats += "<ul class='seatrow'><li class='seatLine'>" + seatArray[row] + "</li>";
			for(var j = 1; j <= 8 ; j ++){
				seats += "<li class='seatLine" + j + "'><div class='eachSeat" + j + " seat" + seatArray[row] + j +"'>" + j + "</div></li>";
				i++;
				if(i == hallSeat) break;
			}
			seats += "</ul>";
			seats += "<div class='clear'>";
			row ++;
		}
		$('#selectSeat').html(seats);
	}
	if(80 < hallSeat && hallSeat <= 196){
		seatRow = hallSeat % 12;
		for(var i = 0; i < hallSeat;){
			seats += "<ul class='seatrow'><li class='seatLine'>" + seatArray[row] + "</li>";
			for(var j = 1; j <= 12 ; j ++){
				seats += "<li class='seatLine" + j + "'><div class='eachSeat" + j + " seat" + seatArray[row] + j +"'>" + j + "</div></li>";
				i++;
				if(i == hallSeat) break;
			}
			seats += "</ul>";
			seats += "<div class='clear'>";
			row ++;
		}
		$('#selectSeat').html(seats);
	}
	if(196 < hallSeat && hallSeat <= 250){
		seatRow = hallSeat % 16;
		for(var i = 0; i < hallSeat;){
			seats += "<ul class='seatrow'><li class='seatLine'>" + seatArray[row] + "</li>";
			for(var j = 1; j <= 16 ; j ++){
				seats += "<li class='seatLine" + j + "'><div class='eachSeat" + j + " seat" + seatArray[row] + j +"'>" + j + "</div></li>";
				i++;
				if(i == hallSeat) break;
			}
			seats += "</ul>";
			seats += "<div class='clear'>";
			row ++;
		}
		$('#selectSeat').html(seats);
	}
	if(250< hallSeat && hallSeat <= 400){
		seatRow = hallSeat % 24;
		for(var i = 0; i < hallSeat;){
			seats += "<ul class='seatrow'><li class='seatLine'>" + seatArray[row] + "</li>";
			for(var j = 1; j <= 24 ; j ++){
				seats += "<li class='seatLine" + j + "'><div class='eachSeat" + j + " seat" + seatArray[row] + j +"'>" + j + "</div></li>";
				i++;
				if(i == hallSeat) break;
			}
			seats += "</ul>";
			seats += "<div class='clear'>";
			row ++;
		}
		$('#selectSeat').html(seats);
		doRandom();
	}
	if(400 < hallSeat){
		seatRow = hallSeat % 40;
		for(var i = 0; i < hallSeat;){
			seats += "<ul class='seatrow'><li class='seatLine'>" + seatArray[row] + "</li>";
			for(var j = 1; j <= 20 ; j ++){
				seats += "<li class='seatLine" + j + "'><div class='eachSeat" + j + " seat" + seatArray[row] + j +"'>" + j + "</div></li>";
				i++;
				if(i == hallSeat) break;
			}
			seats += "</ul>";
			seats += "<div class='clear'>";
			row ++;
		}
		$('#selectSeat').html(seats);
		doRandom();
	}
});

function doRandom(){
	for(var i = 0; i < restSeat; i++){
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
		var rRow = (rSeat / 8) + 1;
		var rColumn = rSeat % 8;
		var seatChk = $(".seat" + seatArray[rRow] + rColumn).text();
		if(seatChk == "X"){
			return 0;
		}else{
			$(".seat" + seatArray[rRow] + rColumn).text("X");
			return 1;
		}
		
	}
	if(80 < hallSeat && hallSeat <= 196){
		var rSeat = Math.floor(Math.random() * hallSeat) + 1;
		var rRow = parseInt(rSeat / 12) + 1;
		var rColumn = rSeat % 12;
		var seatChk = $(".seat" + seatArray[rRow] + rColumn).text();
		if(seatChk == "X"){
			return 0;
		}else{
			$(".seat" + seatArray[rRow] + rColumn).css("background-color", "black")
			$(".seat" + seatArray[rRow] + rColumn).text("X");
			return 1;
		}

	}
	if(196 < hallSeat && hallSeat <= 250){
		var rSeat = Math.floor(Math.random() * hallSeat) + 1;
		var rRow = parseInt(rSeat / 16) + 1;
		var rColumn = rSeat % 16;
		var seatChk = $(".seat" + seatArray[rRow] + rColumn).text();
		if(seatChk == "X"){
			return 0;
		}else{
			$(".seat" + seatArray[rRow] + rColumn).css("background-color", "black")
			$(".seat" + seatArray[rRow] + rColumn).text("X");
			return 1;
		}

	}
	if(250 < hallSeat && hallSeat <= 400){
		var rSeat = Math.floor(Math.random() * hallSeat) + 1;
		var rRow = parseInt(rSeat / 24) + 1;
		var rColumn = rSeat % 24;
		var seatChk = $(".seat" + seatArray[rRow] + rColumn).text();
		if(seatChk == "X"){
			return 0;
		}else{
			$(".seat" + seatArray[rRow] + rColumn).css("background-color", "black")
			$(".seat" + seatArray[rRow] + rColumn).text("X");
			return 1;
		}
	}
	if(400 < hallSeat){
		var rSeat = Math.floor(Math.random() * hallSeat) + 1;
		var rRow = parseInt(rSeat / 40) + 1;
		var rColumn = rSeat % 40;
		var seatChk = $(".seat" + seatArray[rRow] + rColumn).text();
		if(seatChk == "X"){
			return 0;
		}else{
			$(".seat" + seatArray[rRow] + rColumn).css("background-color", "black")
			$(".seat" + seatArray[rRow] + rColumn).text("X");
			return 1;
		}

	}
}