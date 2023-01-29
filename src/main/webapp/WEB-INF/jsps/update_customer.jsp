<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
	<h2>Update Here</h2>

	<form action="edit" method="post">

		<table>
		
			<tr>
				<td> <input type="hidden" name="uidNumber" value="${one.uidNumber}" /></td>
			</tr>
			<tr>
			<tr>
				<td>Name : <input type="text" name="name" value="${one.name}" /></td>
			</tr>
			<tr>
				<td>Gender : <select name="gender">
						<option value="MALE">Male</option>
						<option value="FEMALE">Female</option>
						<option value="OTHERS">Others</option>
				</select>
				</td>
			</tr>
			<tr>
				<td>DOB : <input type="text" name="dob" value="${one.dob}" /></td>
			</tr>
			<tr>
				<td>Address : <input type="text" name="address"
					value="${one.address}" /></td>
			</tr>
			<tr>
				<td>Profession : <input type="text" name="profession"
					value="${one.profession}" /></td>
			</tr>
			<tr>
				<td>Citizenship : <select name="citizenship">
						<option value="INDIAN">Indian</option>
						<option value="NRI">NRI</option>
						<option value="NRO">NRO</option>
				</select>
				</td>
			</tr>
			<tr>
				<td>Opening Balance : <input type="number" step="any"
					name="openingBalance" value="${one.openingBalance}" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="update" /></td>
			</tr>
		</table>
		${Msgs}
	</form>

</body>
</html>