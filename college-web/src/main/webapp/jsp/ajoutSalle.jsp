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

<form:form modelAttribute="salle" action="/college-web/admin/ajouterSalle">
<form:input path="idSalle" type="hidden"/><br>
<form:input path="nbrPlace" type="text"/>
<form:button type="submit">valider</form:button>
</form:form>

<table>
<thead>
<tr>
<th>Id Salle</th>
<th>Nombre de places</th>
</tr>
</thead>

<tbody>
<tr>
<c:forEach items="${listeSalle}" var="salle">
<tr>
<td>${salle.idSalle}</td>
<td>${salle.nbrPlace}</td>
<td><a href="modifSalle?id=${salle.idSalle}">modifier</a></td>
<td><a href="supprSalle?id=${salle.idSalle}">supprimer</a></td>
</tr>
</c:forEach>
</tbody>

</table>

</body>
</html>