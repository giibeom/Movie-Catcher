<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
 
<c:choose>
	<c:when test="${result == 0 }">
	<script>
		alert("로그인 실패!");
		history.back();
	</script>
	</c:when>
	<c:when test="${result == 2 }">
	<script>
	<%
		String a_id = (String)request.getAttribute("u_id");
		session.setAttribute("a_id", a_id);
	%>
		location.href="admin.mc"
	</script>
	</c:when>
	<c:otherwise>
	<script>
		<%
			String u_id = (String)request.getAttribute("u_id");
			session.setAttribute("u_id", u_id);
		%>
		location.href = "main.mc";
	</script>
	</c:otherwise>
</c:choose>