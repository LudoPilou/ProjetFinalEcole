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

<form:form modelAttribute="matiere" action="/college-web/admin/ajouterMatiere">
<form:input path="idMat" type="hidden"/><br>
<form:input path="nom" type="text"/>
<form:button type="submit">valider</form:button>


<form:select path="salle.idSalle" items="${listSalle}"
itemValue="idSalle" itemLabel="nbrPlace"></form:select>
 <br>
</form:form>


<table class="table table-bordered" style="width: 600px">
<thead>
<tr>
<th>Id Matiere</th>
<th>Nom Matiere</th>
</tr>
</thead>

<tbody>
<tr>
<c:forEach items="${listMatiere}" var="matiere">
<tr>
<td width="60" align="center">${matiere.idMat}</td>
<td width="60" align="center">${matiere.nom}</td>
<td width="60" align="center"><a href="modifMat?id=${matiere.idMat}">modifier</a></td>
<td width="60" align="center"><a href="supprMat?id=${matiere.idMat}">supprimer</a></td>
</tr>
</c:forEach>
</tbody>

</table>

</body>
</html>