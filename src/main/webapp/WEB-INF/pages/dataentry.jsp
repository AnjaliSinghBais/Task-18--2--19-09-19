<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr"%>
<html>
<body>
	<h3>Student-Entry-Form</h3>
	<fr:form action="savestudent" modelAttribute="save">
			RollNo	<fr:input path="rno" /><fr:errors  path="rno">Only numbers allowed</fr:errors><br>
			SName	<fr:input path="name" /><fr:errors  path="name">Only characterss allowed</fr:errors><br>
			Branch	<fr:input path="branch" /><br>
			Semester	<fr:input path="sem" /><br>
		   <input type="submit" value="SaveRecord" />
		
	</fr:form>
</body>
</html>