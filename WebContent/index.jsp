<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to my site!</title>
</head>
<body>
<h1>Please enter your login information: <br /></h1>
<form action = "ProcessForm" method = "post">
Username: <input type="text" name="username" id="username" /><br />
Password: <input type="password" name="pass" id="pass" /><br />
<input type="reset" value="Reset" />
<input type="submit" value="Submit" />
</form>

</body>
</html>