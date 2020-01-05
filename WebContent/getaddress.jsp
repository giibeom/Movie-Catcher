<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<style>
	input{
		width:300px;
	}
</style>
</head>
<body>
	<p><input type="text" id="address"></p>
	<p><input type="text" id="search"></p>
	<p><input type="text" id="adr"></p>
</body>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=1745d308df291261c0f18ff1268d942e&libraries=services,clusterer"></script>
<script>
var geocoder = new kakao.maps.services.Geocoder();
$("#address").keypress(function(key){
	if (key.keyCode == 13){
		$("#search").val($("#address").val());
		geocoder.addressSearch($("#address").val(), function(result, status) {
   	     if (status === kakao.maps.services.Status.OK) {
   	        $("#adr").val("x : " + result[0].x + " y : " + result[0].y);
   	    	} 
   		});
	}
});

</script>
</html>