<%@page isELIgnored="false"%>
<html>
<body>
	<h3>STUDENT'S RECORD UPDATED SUCCESSFULLY</h3>
	<h4>Following Details Are Updated :</h4>
	<hr>
	<pre>
		RlNo	${student.rno}
		Name	${student.name}
		Branch	${student.branch}
		Semester${student.sem}
	</pre>
	<hr>

	<a href="index.jsp">Home</a>
	<br>
</body>
</html>