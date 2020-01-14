function fnMove(){
	var offset = $(".admin_board").offset();
	
	$('html, body').animate({scrollTop : offset.top-500}, 500);
}

function fnMove2(){
	var offset = $(".admin_user").offset();
	
	$('html, body').animate({scrollTop : offset.top}, 500);
}