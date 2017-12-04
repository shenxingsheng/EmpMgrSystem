<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录页面</title>
<style type="text/css">
	.container
	{
		text-align:center;
		position:relative;
		top:100px;
	}

</style>
</head>
<body>
		<div class="container">
		<!-- servlet对应的url -->
		<form action="check.jsp" method ="post">
			<input type="text" name ="username" placeholder="请输入用户名" ><br/>
			<input type ="password" name="password" placeholder="请输入密码" ><br>
			<input type="checkbox" name = "autoLogin"/>下次自动登录<br/>
			<input type="submit" value="登录" /><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
			<input type="reset" value="重置">
		</form>
		如果你还没有注册，请点击<a href="register.jsp">这里</a>注册
	</div>
</body>
</html>