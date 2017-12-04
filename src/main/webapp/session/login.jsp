<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Session会话小练习</title>
</head>
<body>
	<center>
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
			Date date = new Date(oldTime);
			Date date2 = new Date(newTime);
			
			int spaceTime = session.getMaxInactiveInterval();
		%>
		
		会话的状态：&nbsp;&nbsp;<%= a %><br>
		会话ID：&nbsp;&nbsp;<%=id %><br>
		创建的时间:&nbsp;&nbsp;<%=date %><br>
		上次访问的时间:&nbsp;&nbsp;<%=date2 %><br>
		最大不活动时间:&nbsp;&nbsp;<%=spaceTime %><br>
		<form action="hello.jsp" method="post">
			<table>
			<tr><th>请输入用户名</th><td><input type="text" name="username"></td></tr>
			<tr><th>请输入密码</th><td><input type="password" name="password"></td></tr>
			<tr><td><input type="reset" value="重填"></td><td><input type="submit" value="登录"></td></tr>
			</table>	
		</form>
	</center>
</body>
</html>