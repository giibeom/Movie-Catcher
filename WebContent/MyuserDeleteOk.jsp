<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int cnt = (Integer)request.getAttribute("result");
	String u_id = (String)request.getAttribute("u_id");
%>


<% if(cnt == 0) { %>
<script>
	alert("회원 탈퇴 실패");
	history.back();
</script>

<% } else { %>
<script>
	alert("회원 탈퇴 성공");
	location.href = "welcome.mc";
</script>

<% } %>