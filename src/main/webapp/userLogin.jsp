<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>UserLogin</title>
<style type="text/css">
	.container
	{
		text-align: center;
		position: relative;
		top: 100px;
	}
</style>
</head>
<body>
	<div class="container">
		<!--servlet对应的url-->
		<form action="servlet/login" method="post">
			<center>
				<input type="text" name="username" id="username"
					placeholder="username" /><br> <input type="text"
					name="password" id="password" placeholder="password" /><br> <input
					type="checkbox" name="again">下次是否自动登录&nbsp; <input
					type="submit" value="登录" />
					<a href="regist.jsp">注册</a>
			</center>
		</form>
	</div>
</body>
</html>