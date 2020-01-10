<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String u_id = (String)session.getAttribute("u_id");
	request.setAttribute("u_id", u_id);
	
%>