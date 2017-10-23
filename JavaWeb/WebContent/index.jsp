<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	<!-- 这是一个Html注释，它会被发送到浏览器客户端，用户通过查看网页源代码，可见！ -->
	<%
		/*
			这是java中的块注释，也称多行注释！
		*/
		//out对象是JSP内置对象之一，通常用来打印输出！
		out.println("Hello World!");
	%>
	<%-- 这是JSP的注释，浏览器不可见，仅在JSP源码中可见! --%>

	<%-- 声明JSP变量 --%>
	<%!int i = 6;%>
	<%!Date today = new Date();%>
	
	<%-- JSP的表达式 --%>
	i = <%= i %>
	<br/>
	today is <%= today %>
	<%= "Hello World!" %>
	<%--  --%>
</body>
</html>