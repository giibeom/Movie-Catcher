<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<c:choose>
	<c:when test="${result ==0 }">
		<script>
			alert("예매 취소를 실패했습니다.");
			history.back();
		</script>
	</c:when>
	<c:otherwise>
		<script>
			alert("예매가 취소되었습니다.");
			location.href = "myPage.mc";
		</script>
	</c:otherwise>
</c:choose>
    