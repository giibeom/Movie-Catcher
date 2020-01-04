

$(document).ready(function(){
    $('.menuBtn').click(function wrapWindowByMask(){
        var maskHeight = $(document).height();
        var maskWidth = $(window).width();
    
        $('#mask').css({'width':maskWidth, 'height':maskHeight});
    
        $('#mask').fadeIn(1000);
        $('#mask').fadeTo("slow",0.8);
    });
});


 