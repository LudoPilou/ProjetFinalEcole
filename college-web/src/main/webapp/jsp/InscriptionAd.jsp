<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form modelAttribute="admin" action="/college-web/addAdmin">
<fieldset>
<div><center>Inscription</center></div>
<div>
<center>
<form:input path="idUser" type="hidden"/><br>
Login:<form:input path="UserName" type="text"/><br><br>
Password:<form:input path="password" type="text"/><br><br>
Activer:<form:checkbox value="1" path="activated"/><br><br>

<form:button type="submit" value="valider">Ok</form:button>
</form:form>
</center>
</div>
</fieldset>

</body>
</html>
