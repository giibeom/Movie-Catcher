  
  $(document).ready(function(){
    $("#button").click(function(){
      var card = $("#card").val();
      var first_name = $("#first_name").val();
      var last_name = $("#last_name").val();
      var card_info = $("#card_info").val();
      var card_info1 = $("#card_info1").val();
      var card_info2 = $("#card_info2").val();
      var post = $("#post").val();
      var country = $("#country").val();

      $("#payFrm").onsubmit(function(){
        alert("결제되었습니다.");
      });
      
  
    }); 
  });