<%@page isELIgnored="false"%>
<html>
<body>
	<h3>STUDENT'S RECORD</h3>

	<hr>
	<pre>
		RlNo	   ${students.rno}
		Name	   ${students.name}
		Branch	   ${students.branch}
		Semester   ${students.sem}
	</pre>
	<hr>
	<a href="dataentry">Add-More</a>
	<br>
	<a href="index.jsp">Home</a>
	<br>
</body>
</html>