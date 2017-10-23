<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="newbook1.html" />
	<jsp:include page="newbook2.html"></jsp:include>
	<jsp:include page="newbook3.jsp">
		<jsp:param value="张三" name="name" />
		<jsp:param value="25" name="age" />
	</jsp:include>
</body>
</html>