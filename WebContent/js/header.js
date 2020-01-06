function myFunction() {
	
	var x = document.getElementById("myTopnav");
	
	
	if(x.className=="topnav"){
		x.className += " responsive";
	}else{
		x.className = "topnav";
	}
}
$(document).ready(function(){
	$('#navMovie').click(function(){
		location.href = "main.mc";
	});
	$('#navReserve').click(function(){
		location.href = "bookingStep1.mc";
	});
	$('#navTheater').click(function(){
		location.href = "finecinema.mc";
	});
	$('#navReview').click(function(){
		location.href = "review.mc";
	});
	$('#navNotice').click(function(){
		location.href = "board.mc";
	});
	$('#navMypage').click(function(){
		location.href = "myPage.mc";
	});
	$('#logout').click(function(){
		location.href="welcome.mc";
		session.invalidate();
	});
	
});