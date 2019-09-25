<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fr" %>  
<%@page isELIgnored="false" %>
<html>
<body>
	<h3>STUDENT'S RECORD SUCCESSFULLY STORED</h3>
	<h4>Following Details Are Saved : </h4>
	<hr>
	<pre>
		RollNo	${save.rno}
		Name	${save.name}
		Branch	${save.branch}
		Semster	${save.sem}
	</pre>		
	<hr>
	<a href="dataentry">Add-More</a><br>
	<a href="index.jsp">Home</a>
	<br>
</body>
</html>