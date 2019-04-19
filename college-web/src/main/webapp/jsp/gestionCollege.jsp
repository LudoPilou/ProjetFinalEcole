<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' crossorigin='anonymous'>
</head>
<body>

<form:form modelAttribute="college" action="/college-web/admin/addCollege">

<form:input path="idCollege" type="hidden"/><br>
Site internet:<form:input path="siteInternet" type="text"/><br>
<form:button type="submit">Valider</form:button>
</form:form>

<table>
<thead>
<tr>
<th>Id</th>
<th>Site internet</th>
<th>Modifier <i class='fas fa-edit' style='font-size:18px;color:fuchsia'></i></th>
<th>Supprimer <i class='fas fa-eraser' style='font-size:24px;color:fuchsia'></i></th>
</tr>
</thead>



<c:forEach items="${listColleges}" var="col">
<tr>
<td>${col.idCollege}</td>
<td>${col.siteInternet}</td>
<td><a href="edit?id=${col.idCollege}">modifier</a></td>
<td><a href="delete?id=${col.idCollege}">supprimer</a></td>
</tr>
</c:forEach>


</table>

</body>
</html>