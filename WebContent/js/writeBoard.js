$(document).ready(function(){
    $('.starRev span').click(function(){    	
    	var rs_star = $(this).text();
        $(this).parent().children('span').removeClass('on');
        $(this).addClass('on').prevAll('span').addClass('on');
        $("#rs_star").val(rs_star);
        return false;
      });
});