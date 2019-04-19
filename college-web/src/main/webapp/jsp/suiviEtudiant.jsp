<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  
  <style>
.border{
border: 2px grey solid;
display: inline-block;
margin-left:5%;
margin-top:5%;
}


</style>
  
  
</head>
<body>



<form:form modelAttribute="etudiant" action="/college-web/calculMoyenne">

<form:select path="idPersonne" items="${listEtudiant}"
itemValue="idPersonne" itemLabel="nom">
</form:select>

<form:button type="submit">calculer la Moyenne</form:button>
<output>${note}</output>



</form:form>


<!-- <table class="table table-bordered" style="width: 600px"> -->
<!-- <thead> -->
<!-- <tr> -->
<!-- <th>Etudiant</th> -->
<!-- <th>Matieres non notées</th> -->
<!-- </tr> -->
<!-- </thead> -->
<!-- <tbody> -->
<!-- <tr> -->
<%-- <c:forEach items="${listMatSansNote}" var="etudiant"> --%>
<%-- <td width="60" align="center">${etudiant.nom}</td> --%>
<%-- </c:forEach> --%>
<%-- <c:forEach items="${listMatSansNote}" var="matiere"> --%>
<%-- <td width="60" align="center">${matiere.nom}</td> --%>
<%-- </c:forEach> --%>
<!-- </tr> -->
<!-- </tbody> -->
<!-- </table> -->

<table class="table table-bordered" style="width: 600px">
<thead>
<tr>Liste des étudiants admis :
<th>Nom</th>
<th>Prénom</th>
</tr>
</thead>

<tbody>
<tr>
<c:forEach items="${listeAdmis}" var="etudiant">
<tr>
<td width="60" align="center">${etudiant.nom}</td>
<td width="60" align="center">${etudiant.prenom}</td>
</tr>
</c:forEach>
</tbody>

</table>

</body>
</html>