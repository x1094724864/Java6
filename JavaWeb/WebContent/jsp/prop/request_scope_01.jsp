<%@ page contentType="text/html" pageEncoding="GBK"%>
<%@ page import="java.util.*"%>
<html>
<head><title>01</title></head>
<body>
<%	// ��������
	request.setAttribute("name","���˻�") ;
	request.setAttribute("birthday",new Date()) ;
%>
<jsp:forward page="request_scope_02.jsp"/>
</body>
</html>