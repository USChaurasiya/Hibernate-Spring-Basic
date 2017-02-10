<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Registration form</title>
<script>
	function validateForm() {
		var x = document.forms["empForm"]["eId"].value;
		var y = document.forms["empForm"]["eName"].value;
		if (x == null || x == "") {
			alert("Employee Id must be filled out");
			return false;
		}
		if (y == null || y == "") {
			alert("Employee Name must be filled out");
			return false;
		}
	}
</script>
</head>
<body >
<fieldset >
	<form name="empForm" action="register" method="post"
		onsubmit="return validateForm()">
		<br>

		
			<legend>Employee Data:</legend>
			<table style="width: 100%" bgcolor="grey">
				<tr >
					<th>Employee Id:</th>
					<td><input type="text" name="eId" placeholder="Emolpyee Id"
						required="required"></td>
				</tr>
				<tr>
					<th>Employee Name:</th>
					<td><input type="text" name="eName"
						placeholder="Emolpyee Name" required="required"></td>
				</tr>
				<tr>
					<th>Employee Dept:</th>
					<td><input type="text" name="eDept"
						placeholder="Emolpyee Dept" required="required"></td>
				</tr>
				<tr>
					<th>Employee Age:</th>
					<td><input type="text" name="eAge" placeholder="Emolpyee Age"
						required="required"></td>
				</tr>
				<tr>
					<th>Employee Address:</th>
					<td><input type="text" name="eAdd"
						placeholder="Emolpyee Address" required="required"></td>
				</tr>
				<tr>
					<th>Employee ContactS:</th>
					<td><input type="text" name="eMobile"
						placeholder="Emolpyee Mobile" required="required"></td>
				</tr>
				<tr>
					<th>Employee Email:</th>
					<td><input type="text" name="eMail"
						placeholder="Emolpyee Email" required="required"></td>
				</tr>
				<tr>
					<th><input type="submit" value="Register"></th>
				
					<td><input type="reset"></td>
				</tr>

			</table>
			</form>
 Already Register? Please Login Here:<a href="login.jsp"><input type="submit" value="Login"></a>
		</fieldset>

	
		

</body>
</html>