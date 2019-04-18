<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="role" action="/college-web/addRole">

Role: <form:input path="roleName" type="text"/> <br>
User: <form:select path="user.idUser" items="${users}"
itemValue="idUser" itemLabel="userName"></form:select>
 <br>

<form:button type="submit" value="valider" >Ok</form:button>
</form:form>
</body>
</html>