<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>forEach使用示例</title>
</head>
<body>
	<%
		String[] books = { "Java Web程序设计", "操作系统", "Java语言程序设计", "C语言程序设计" };
		request.setAttribute("book", books);
	%>
	全部书目：
	<br />
	<c:forEach var="bookName" items="${book}">
  ${bookName}<br />
	</c:forEach>
	显示从10到15的整数值：
	<br />
	<c:forEach var="i" begin="1" end="15" step="3">
  ${i}&nbsp;
</c:forEach>
</body>
</html>
