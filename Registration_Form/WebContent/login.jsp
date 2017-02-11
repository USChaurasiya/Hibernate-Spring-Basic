<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	function validateForm() {
		var x = document.forms["loginForm"]["eId"].value;
		var y = document.forms["loginForm"]["eName"].value;
		if (x == null || x == "") {
			alert("Please Enter Employee Id");
			return false;
		}
		if (y == null || y == "") {
			alert("Employee Name must be filled out");
			return false;
		}
	}
</script>
</head>
<body>
	<form name="loginForm" action="Login" method="get"onsubmit="return validateForm()">
		<br>

		<fieldset>
			<legend>Login Form:</legend>
			<table style="width: 100%" bgcolor="grey">
				<tr>
					<th>Employee Id:</th>
					<td><input type="text" name="eId" placeholder="Emolpyee Id"></td>
				</tr>
				<tr>
					<th>Employee Name:</th>
					<td><input type="text" name="eName"placeholder="Emolpyee Name" ></td>
				</tr>
				
				</tr>
				<tr>
					<th><input type="submit" value="Login"></th>
					<td><input type="reset"></input> <a href="forget.jsp">Forget Id?</a></td>
				</tr>
			</table>
		</fieldset>
	</form>


</body>
</html>