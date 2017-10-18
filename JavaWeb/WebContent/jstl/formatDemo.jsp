
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>formatDate的使用示例</title>
</head>
<body>
	<jsp:useBean id="date" class="java.util.Date" />
	<!-- 实例化一个date对象 -->
	<fmt:formatDate value="${date}" />
	<br />
	<fmt:formatDate value="${date}" pattern="yyyy.MM.dd HH:mm:ss:sss" />
	<!-- 按照指定的风格显示日期 -->
</body>
</html>
