<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<c:choose>
	<c:when test="${result==0 }">
	<script>
		alert("회원 가입에 실패했습니다.");
		history.back();
	</script>
	</c:when>
	<c:otherwise>
	<script>
		alert("회원 가입을 환영합니다.");
		<%
			String id = (String)request.getAttribute("id");
			session.setAttribute("id", id);
		%>
		location.href="main.mc";
	</script>
</c:otherwise>
</c:choose>