<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h3>List-of-Students-Using-JSTL</h3>
	<hr>
	<table border="2">

		<tr>
			<th>RollNo</th>
			<th>Name</th>
			<th>Branch</th>
			<th>Sem</th>
		<tr>
			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.rno}</td>
					<td>${student.name}</td>
					<td>${student.branch}</td>
					<td>${student.sem}</td>
					<td><a href="remove?rno=${student.rno}">delete</a></td>

				</tr>
			</c:forEach>
	</table>

	<a href="index.jsp">Home</a>
	<br>
	<hr>
</body>
</html>