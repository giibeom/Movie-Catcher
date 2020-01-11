  
  $(document).ready(function(){
	  totalSeats = totalSeats.split(",").join(" ");
	  $("#totalSeats").text(totalSeats);
	  $("#hiddenSeats").val(totalSeats);
	  var pl = totalPeople.length;
	  var totalMone = 0;
	  if(pl == 2){
		  var ptype1 = totalPeople.substring(0, 1);
		  var ptype1Size = totalPeople.substring(1,2);
		  if(ptype1 == "g"){
			  $(".generalCal").text("₩9,000 X (성인)" + ptype1Size + "명");
			  $(".generalMoney").text("₩"+ 9*ptype1Size + ",000");
			  totalMone += 9*ptype1Size;
			  $("#totalPeople").text("성인 " + ptype1Size +"명");
			  	
		  }
		  if(ptype1 == "t"){
			  $(".teenagerCal").text("₩7,000 X (청소년)" + ptype1Size + "명");
			  $(".teenagerMoney").text("₩"+ 7*ptype1Size + ",000");
			  totalMone += 7*ptype1Size;
			  $("#totalPeople").text("청소년 " + ptype1Size +"명");
		  }
		  if(ptype1 == "s"){
			  $(".specialCal").text("₩5,000 X (우대)" + ptype1Size + "명");
			  $(".specialMoney").text("₩"+ 5*ptype1Size + ",000");
			  totalMone += 5*ptype1Size;
			  $("#totalPeople").text("우대 " + ptype1Size +"명");
		  }
	  }
	  if(pl == 4){
		  var ptype1 = totalPeople.substring(0, 1);
		  var ptype1Size = totalPeople.substring(1,2);
		  var ptype2 = totalPeople.substring(2, 3);
		  var ptype2Size = totalPeople.substring(3,4);
		  if(ptype1 == "g"){
			  $(".generalCal").text("₩9,000 X (성인)" + ptype1Size + "명");
			  $(".generalMoney").text("₩"+ 9*ptype1Size + ",000");
			  totalMone += 9*ptype1Size;
			  $("#totalPeople").text("성인 " + ptype1Size +"명");
		  }
		  if(ptype1 == "t"){
			  $(".teenagerCal").text("₩7,000 X (청소년)" + ptype1Size + "명");
			  $(".teenagerMoney").text("₩"+ 7*ptype1Size + ",000");
			  totalMone += 7*ptype1Size;
			  $("#totalPeople").text("청소년 " + ptype1Size +"명");
		  }
		  if(ptype1 == "s"){
			  $(".specialCal").text("₩5,000 X (우대)" + ptype1Size + "명");
			  $(".specialMoney").text("₩"+ 5*ptype1Size + ",000");
			  totalMone += 5*ptype1Size;
			  $("#totalPeople").text("우대 " + ptype1Size +"명");
		  }
		  if(ptype2 == "g"){
			  $(".generalCal").text("₩9,000 X (성인)" + ptype2Size + "명");
			  $(".generalMoney").text("₩"+ 9*ptype2Size + ",000");
			  totalMone += 9*ptype2Size;
			  var makeRe =  $("#totalPeople").text();
			  $("#totalPeople").text(makeRe + " 성인 " + ptype2Size +"명");
		  }
		  if(ptype2 == "t"){
			  $(".teenagerCal").text("₩7,000 X (청소년)" + ptype2Size + "명");
			  $(".teenagerMoney").text("₩"+ 7*ptype2Size + ",000");
			  totalMone += 7*ptype2Size;
			  var makeRe =  $("#totalPeople").text();
			  $("#totalPeople").text(makeRe + " 청소년 " + ptype2Size +"명");
		  }
		  if(ptype2 == "s"){
			  $(".specialCal").text("₩5,000 X (우대)" + ptype2Size + "명");
			  $(".specialMoney").text("₩"+ 5*ptype2Size + ",000");
			  totalMone += 5*ptype2Size;
			  var makeRe =  $("#totalPeople").text();
			  $("#totalPeople").text(makeRe + " 우대 " + ptype2Size +"명");
		  }
	  }
	  if(pl == 6){
		  var ptype1 = totalPeople.substring(0, 1);
		  var ptype1Size = totalPeople.substring(1,2);
		  var ptype2 = totalPeople.substring(2, 3);
		  var ptype2Size = totalPeople.substring(3,4);
		  var ptype3 = totalPeople.substring(4, 5);
		  var ptype3Size = totalPeople.substring(5,6);
		  if(ptype1 == "g"){
			  $(".generalCal").text("₩9,000 X (성인)" + ptype1Size + "명");
			  $(".generalMoney").text("₩"+ 9*ptype1Size + ",000");
			  totalMone += 9*ptype1Size;
			  $("#totalPeople").text("성인 " + ptype1Size +"명");
		  }
		  if(ptype1 == "t"){
			  $(".teenagerCal").text("₩7,000 X (청소년)" + ptype1Size + "명");
			  $(".teenagerMoney").text("₩"+ 7*ptype1Size + ",000");
			  totalMone += 7*ptype1Size;
			  $("#totalPeople").text("청소년 " + ptype1Size +"명");
		  }
		  if(ptype1 == "s"){
			  $(".specialCal").text("₩5,000 X (우대)" + ptype1Size + "명");
			  $(".specialMoney").text("₩"+ 5*ptype1Size + ",000");
			  totalMone += 5*ptype1Size;
			  $("#totalPeople").text("우대 " + ptype1Size +"명");
		  }
		  if(ptype2 == "g"){
			  $(".generalCal").text("₩9,000 X (성인)" + ptype2Size + "명");
			  $(".generalMoney").text("₩"+ 9*ptype2Size + ",000");
			  totalMone += 9*ptype2Size;
			  var makeRe =  $("#totalPeople").text();
			  $("#totalPeople").text(makeRe + " 성인 " + ptype2Size +"명");
		  }
		  if(ptype2 == "t"){
			  $(".teenagerCal").text("₩7,000 X (청소년)" + ptype2Size + "명");
			  $(".teenagerMoney").text("₩"+ 7*ptype2Size + ",000");
			  totalMone += 7*ptype2Size;
			  var makeRe =  $("#totalPeople").text();
			  $("#totalPeople").text(makeRe + " 청소년 " + ptype2Size +"명");
		  }
		  if(ptype2 == "s"){
			  $(".specialCal").text("₩5,000 X (우대)" + ptype2Size + "명");
			  $(".specialMoney").text("₩"+ 5*ptype2Size + ",000");
			  totalMone += 5*ptype2Size;
			  var makeRe =  $("#totalPeople").text();
			  $("#totalPeople").text(makeRe + " 우대 " + ptype2Size +"명");
		  }
		  if(ptype3 == "g"){
			  $(".generalCal").text("₩9,000 X (성인)" + ptype3Size + "명");
			  $(".generalMoney").text("₩"+ 9*ptype3Size + ",000");
			  totalMone += 9*ptype3Size;
			  var makeRe =  $("#totalPeople").text();
			  $("#totalPeople").text(makeRe + " 성인 " + ptype3Size +"명");
		  }
		  if(ptype3 == "t"){
			  $(".teenagerCal").text("₩7,000 X (청소년)" + ptype3Size + "명");
			  $(".teenagerMoney").text("₩"+ 7*ptype3Size + ",000");
			  totalMone += 7*ptype3Size;
			  var makeRe =  $("#totalPeople").text();
			  $("#totalPeople").text(makeRe + " 청소년 " + ptype3Size +"명");
		  }
		  if(ptype3 == "s"){
			  $(".specialCal").text("₩5,000 X (우대)" + ptype3Size + "명");
			  $(".specialMoney").text("₩"+ 5*ptype3Size + ",000");
			  totalMone += 5*ptype3Size;
			  var makeRe =  $("#totalPeople").text();
			  $("#totalPeople").text(makeRe + " 우대 " + ptype3Size +"명");
		  }
	  }
	  $(".totalMoney").text("₩" + totalMone + ",000");
	  $("#hiddenPrice").val("₩" + totalMone + ",000");
	  
	  
	  
	  
	  
	  
	  
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