<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insérer votre Département</title>

</head>
<body>

 
<form:form modelAttribute="depart" action="/college-web/admin/addDepartement">
<form:input path="idDepartement"  type="hidden"/>
<form:input path="nomDepartement" type="text"/>

<form:select path="Responsable.idPersonne" items="${listEnseignant}" itemValue="idPersonne" itemLabel="nom"></form:select>




<form:select path="college.idCollege" items="${listCollege}" itemValue="idCollege" itemLabel="idCollege"></form:select> 



<form:button type="submit">Valider</form:button>

</form:form>
<table class="table table-bordered" style="width: 600px">

<thead>

<tr>

<th>Id</th>
<th>Departement</th>
<th>Modifier</th>
<th>Supprimer</th>
</tr>

</thead>
<tbody>

<c:forEach items="${listeDepart}" var="depart">

<tr>
<td width="60" align="center"> ${depart.idDepartement}</td>
<td width="60" align="center"> ${depart.nomDepartement}</td>
<td width="60" align="center"><a href="modifierDepartement?id=${depart.idDepartement}">Modifier</a></td>
<td width="60" align="center"><a href="supprimerDepartement?id=${depart.idDepartement}">Supprimer</a></td>
</tr>

</c:forEach>

</tbody>
</table>

</body>

</html>