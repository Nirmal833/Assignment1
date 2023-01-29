<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer input</title>
</head>
<body>
	<h2>Enter customer Details Here...</h2>
	<form action="create" method ="post">
		<table>
		<!-- <tr>
			<td>UID Number : <input type ="number" name="uidNumber"/></td>
		</tr> --> 
		<tr>
			<td>Customer Name : <input type ="text" name ="name"/></td>
		</tr>
		<tr>
			<td>Address : <input type="text" name="address"/></td>
		</tr>
		<tr>
			<td>Gender : <select name ="gender">
			 	<option value="MALE">Male</option>
				<option value="FEMALE">Female</option>
				<option value="FEMALE">Others</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>Date Of Birth : <input type="date" name="dob"/></td>
		</tr>
		
		<tr>	
			<td>Profession : <input type="text" name="profession"/></td>
		</tr>
		<tr>
			<td>Citizenship : <select name="citizenship">
				<option value="INDIAN">Indian</option>
				<option value="NRI">NRI</option>
				<option value="NRO">NRO</option>
			</select></td>
		</tr>
		<tr>
			<td>Opening Balance : <span></span> &#8377;<input type="number" name="openingBalance"/></span></td>
		</tr>
		<tr>
			<td><input type="submit" value="save"/></td>
		</tr>
		</table>
		${msg}
	</form>
	
</body>
</html>