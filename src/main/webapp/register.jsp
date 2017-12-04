<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<script language="javascript">
	function isValid(form)
	{
		if(form.username.value == "")
		{
			alert("用户名能为空");
			return false;
		}
		else if(form.password.value != from.repassword.value)
		{
			alert("俩次输入密码不同");
			return false;
		}
		else if(form.password.value == "")
		{
			alert("用户密码不能为空");
			return false;
		}
		else 
		{
			return true;
		}
	}
</script>
</head>
<body>
	<center>
		<form action="check.jsp" method ="post" onSubmit="return isValid(this);">
		<table>
			<tr><td>用户名</td><td><input type="text" name ="username" placeholder="请输入用户名" /></td></tr>
			<tr><td>密     码</td><td><input type ="password" name ="password" placeholder="请输入密码" /></td></tr>
			<tr><td>确认密码</td><td><input type ="password" name ="repassword" placeholder="请再次输入密码" /></td></tr>
			<tr><td align="center"><input type="submit" value="注册"/></td><td align="center"><input type="reset"/></td></tr>
		
		</table>
		</form>
	</center>
</body>
</html>