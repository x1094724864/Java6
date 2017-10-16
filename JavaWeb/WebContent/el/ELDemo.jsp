<%@page import="com.ddbin.javaweb.BookBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<% pageContext.setAttribute("color", "green"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL 表达式</title>
</head>
<body bgcolor="${pageScope.color}">
	<p><b>EL 表达式</b><br></p>

	<table border="1px">
		<tr>
			<td>逻辑运算</td>
			<td>EL表达式</td>
			<td>结果</td>
		</tr>
		<tr>
			<td>与</td>
			<td>${'${'} true and true}</td>
			<td>${true and true}</td>
		</tr>
		<tr>
			<td>与</td>
			<td>${'${'} true && false}</td>
			<td>${true && false}</td>
		</tr>
		<tr>
			<td>或</td>
			<td>${'${'} true or true}</td>
			<td>${true or true}</td>
		</tr>
		<tr>
			<td>或</td>
			<td>${'${'} true || false}</td>
			<td>${true || false}</td>
		</tr>
		<tr>
			<td>非</td>
			<td>${'${'} not true}</td>
			<td>${not true}</td>
		</tr>
		<tr>
			<td>非</td>
			<td>${'${'} !false}</td>
			<td>${ !false}</td>
		</tr>
	</table>

	<p>浏览器的类型是：</p>
	${header['User-Agent']}
	
	<% 
		BookBean bb = new BookBean("JavaWeb",25);
		pageContext.setAttribute("book", bb);		//放到页面的范围内
	%>
	<p>书名字的长度：</p>
	<%-- ${book.name} --%>
	${book.getBookName().length()}
	
	
</body>
</html>