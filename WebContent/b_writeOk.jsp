<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ page import = "java.sql.*" %>

<c:choose>
	<c:when test="${result==0 }">
			<script>
		alert("공지사항 등록이 실패되었습니다.");
		history.back();
	</script>
	</c:when>
	<c:otherwise>
			<script>
			alert("공지사항이 등록되었습니다.");
			location.href = "board.mc";
			</script>
	</c:otherwise>
</c:choose>



	
	












