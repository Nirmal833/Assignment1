<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Customers</title>
</head>

<body>
	<table border=1>
		<tr>
			<th colspan="11" bgcolor="lightgrey"><font size="6">LIST OF
					CUSTOMER</font></th>
		</tr>
		<tr bgcolor="lightgrey">
			<!-- <th>Customer Id</th> -->
			<th>Unique Id Number</th>
			<th>Name</th>
			<th>DOB</th>
			<th>Address</th>
			<th>Profession</th>
			<th>Opening Balance</th>
			<th>Gender</th>
			<th>Citizenship</th>
			<th colspan="2">Action</th>
		</tr>
		<c:forEach var="list" items="${list}">
			<tr>
				<td style="text-allign: center">${list.uidNumber}</td>
				<td>${list.name}</td>
				<td>${list.dob}</td>
				<td>${list.address}</td>
				<td>${list.profession}</td>
				<td>${list.openingBalance}</td>
				<td>${list.gender}</td>
				<td>${list.citizenship}</td>
				<td><a href="delete?id=${list.uidNumber}"> <input
						style="backgrounf-color: mistyrose; color: darkred" type="submit"
						value="Delete">
				</a></td>
				<td><a href="update?id=${list.uidNumber}"> <input
						style="backgrounf-color: mistyrose; color: darkred" type="submit"
						value="Edit">
				</a></td>
		</c:forEach>
	</table>
	
	<p>Total Customer : ${totalCustomer}</p>
	<nav aria-label="...">
		<ul class="pagination">
			<li class="page-item">
			<c:if test="${currentPage !=0}">
			<a class="page-link" href="page?page=${currentPage-1}">Previous</a>
			</c:if>
			</li>
			<li class="page-item">
			<c:forEach var="i" begin="1" end="${totalpage}" >
			<a class="page-link" href="page?page=${i-1}">${i}</a>
			</c:forEach>
			</li>
			 <li class="page-item">
			<c:if test="${currentPage != totalpage-1}">
			<a class="page-link" href="page?page=${currentPage+1}">Next</a>
			</c:if>
			</li> 
		</ul>
	</nav>
	
</body>
</html>

