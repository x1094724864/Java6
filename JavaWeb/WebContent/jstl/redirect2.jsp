<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>redirect标签的使用示例</title>
</head>
<body>
	传递的参数值为：
	<br /> userName:${param.userName}
	<br /> password:${param.password}

	<c:import var="baidu" url="http://www.baidu.com" charEncoding="utf-8"
		scope="session" />
	<p>百度的首页：</p>
	<%-- ${baidu} --%>

	<%-- <c:redirect url="${baidu}" /> --%>
	<!-- 显示效果说明：baidu存储是网页内容不是网页的地址 -->
	
	<c:url var="loginUrl" value="/jsp/login.jsp" scope="session"></c:url>
	<c:redirect url="${loginUrl}" context="/" />

</body>
</html>