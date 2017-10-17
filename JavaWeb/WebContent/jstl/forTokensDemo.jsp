<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>forTokens使用示例</title>
</head>
<body>
	<%
		String address = "Beijing,Shanghai;Nanjin!Xian,Jinan";
		request.setAttribute("address", address);
	%>
	<c:forTokens var="addr" items="${address}" delims=",;!"
		varStatus="status">
<%-- ${status.count}、${addr}<br /> --%>
${status.index}、${addr}<br />
	</c:forTokens>
</body>
</html>
