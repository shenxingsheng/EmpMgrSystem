<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录成功</title>
</head>
<body>
	<%
		String 	username = request.getParameter("username");
	%>
	<%
			String a;
			if(session.isNew())
			{
				a = "新的会话";
			}
			else
			{
				a = "旧的会话";
			}
			
			String id = session.getId();
			Long oldTime = session.getLastAccessedTime();
			Long newTime = session.getCreationTime();
			int spaceTime = session.getMaxInactiveInterval();
	%>
		
		会话的状态：&nbsp;&nbsp;<%= a %><br>
		会话ID：&nbsp;&nbsp;<%=id %><br>
		创建的时间:&nbsp;&nbsp;<%=oldTime %><br>
		上次访问的时间:&nbsp;&nbsp;<%=newTime %><br>
		最大不活动时间:&nbsp;&nbsp;<%=spaceTime %><br>
		<p>欢迎你：<%= username %></p>
		<a href="login.jsp">重新登录</a>
		<a href="leave.jsp">注销</a>
</body>
</html>