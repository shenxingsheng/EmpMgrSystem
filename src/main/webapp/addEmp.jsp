<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="servlet/addEmp" method="get">
		<center>
			empno<input type="text" name="empno" id="empno" placeholder="empno" ><br>
			ename<input type="text" name="ename" id="ename" placeholder="ename"><br>
			job<input type="text" name="job" id="job" placeholder="job"><br>
			sal<input type="text" name="sal" id="sal" placeholder="sal"><br>
			<input type="submit" value="submit">
		</center>
	</form>
</body>
</html>