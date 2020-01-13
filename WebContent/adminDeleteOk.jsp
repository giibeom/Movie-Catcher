<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<c:choose>
	<c:when test="${result ==0 }">
		<script>
			alert("회원탈퇴 실패");
			history.back();
		</script>
	</c:when>
	<c:otherwise>
		<script>
			alert("회원탈퇴 성공");
			location.href = "admin.mc";
		</script>
	</c:otherwise>
</c:choose>
    