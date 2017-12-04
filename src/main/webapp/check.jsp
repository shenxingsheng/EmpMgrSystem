<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
		<%
			if(request.getParameter("username").equals("shen")&&request.getParameter("password").equals("123"))
			{
		%>
		<jsp:forward page="this.jsp">
			<jsp:param value="bb" name="aa"/>
			<jsp:param value="bb11" name="aa11"/>
		</jsp:forward>
		<%
			}
			else
		%>
		<script>alert("用户名或密码错误")</script>
</body>
</html>