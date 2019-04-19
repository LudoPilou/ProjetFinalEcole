<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  
  <style>
.border{
border: 2px grey solid;
display: inline-block;


}


</style>
  
  
</head>
<body>

<form:form modelAttribute="noter" action="/college-web/ajoutNote">

  <div class="border">
  
  <div class="form-group">
      <label>Sélectionner l'étudiant :</label>
		   		
    			
<form:select path="etudiant.idPersonne" items="${listeEtud}" itemValue="idPersonne" itemLabel="nom" class="form-control"></form:select>
  				
		
		</div>
		
		 <div class="form-group">
      <label >Sélectionner la matière :</label>
		
<form:select path="matiere.idMat" items="${listeMat}" itemValue="idMat" itemLabel="nom" class="form-control"></form:select> 
 
		
		</div><br>	
	
			
		<div class="form-group">
		<label for="nom">Note :</label>
		<form:input path="note" type="text" id="note" class="form-control"/>
		</div><br>
		
	</div>	
<form:button type="submit" value="validerNote" class="btn btn-primary btn-block">Ajouter Note</form:button><br>
		
</form:form>

	


<h3>Liste des notes</h3>	 
 <table class="table table-striped">
<thead>
<tr>
<th>Id_Matiere</th>
<th>Id_Etudiant</th>
<th>Note</th>
<th>Modifier</th>
<th>Supprimer</th>
</tr>
</thead>

<tbody>

<c:forEach items="${listeNote}" var="note">
<tr>
<td>${note.matiere.idMat}</td>
<td>${note.etudiant.idPersonne}</td>
<td>${note.note}</td>
<td><a href="editNote?id=${note.matiere.idMat}&idp=${note.etudiant.idPersonne}">modifier</a></td>
<td><a href="deleteNote?id=${note.etudiant.idPersonne}&id=${note.matiere.idMat}">supprimer</a></td>
</tr>
</c:forEach>

</tbody>

</table>




</body>
</html>