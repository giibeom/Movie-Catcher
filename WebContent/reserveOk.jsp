<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ page import = "java.sql.*" %>
<c:choose>
	<c:when test="${result==0 }">
			<script>
		alert("영화 예매가 실패했습니다.");
		history.back();
	</script>
	</c:when>
	<c:otherwise>
			<script>
			alert("영화를 예매했습니다.");
			location.href = "myPageResList.mc?u_id=${u_id }";
			</script>
	</c:otherwise>
</c:choose>
    