$(document).ready(function(){
	
    $('.starRev span').click(function(){    	
    	var rv_star = $(this).text();
    	$("#rv_star").val(rv_star);
        $(this).parent().children('span').removeClass('on');
        $(this).addClass('on').prevAll('span').addClass('on');
        return false;
      });
});