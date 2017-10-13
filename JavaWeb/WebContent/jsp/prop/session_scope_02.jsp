<%@ page contentType="text/html" pageEncoding="GBK"%>
<%@ page import="java.util.*"%>
<html>
<head><title>02</title></head>
<body>
<%
	String username = (String) session.getAttribute("name") ;
	Date userbirthday = (Date)session.getAttribute("birthday") ;
%>
<h2>аеУћЃК<%=username%></h2>
<h2>ЩњШеЃК<%=userbirthday%></h2>
</body>
</html>