<%@ page contentType="text/html" pageEncoding="GBK"%>
<%@ page import="java.util.*"%>
<html>
<head><title>02</title></head>
<body>
<%	// ��������
	pageContext.setAttribute("name","���˻�") ;
	pageContext.setAttribute("birthday",new Date()) ;
%>
<jsp:forward page="page_scope_03.jsp"/>
</body>
</html>