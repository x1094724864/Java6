<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>redirect标签的使用示例</title>
</head>
<body>
	<c:redirect url="redirect2.jsp">
		<c:param name="userName" value="wangwu" />
		<c:param name="password" value="123456" />
	</c:redirect>
</body>
</html>