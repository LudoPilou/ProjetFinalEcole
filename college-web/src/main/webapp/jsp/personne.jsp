<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
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

.col-sm-5{
margin-left:2%;
}
.col-sm-6{
margin-left:2%;
}
</style>


</head>
<body>



   <div class="row">
  <div class="col-sm-6">
  <div class="border">
  <h2>Formulaire pour Enseignants</h2>	    
      <form:form modelAttribute="enseignant" action="/college-web/admin/ajoutEnseignant">
		
	
		<form:input path="idPersonne" type="hidden"/>
		
		<div class="form-group">
		<label for="nom">Nom :</label>
		<form:input path="nom" type="text" id="nom" class="form-control"/>
		</div>
		<div class="form-group">
		<label for="nom">Prénom :</label>
		<form:input path="prenom" type="text" id="prenom" class="form-control"/>
		</div>
		<div class="form-group">
		<label for="nom">Mail :</label>
		<form:input path="mail" type="text" id="mail" class="form-control"/>
		</div>
		<div class="form-group">
		<label for="nom">Téléphone :</label>
		<form:input path="tel" type="text" id="tel" class="form-control"/>
		</div>
		<div class="form-group">
		<label for="nom">Date de prise en fonction :</label>
		<form:input path="datePriseFonction" type="text" value="yyyy/mm/dd" id="datePriseFonction" class="form-control"/>
		</div>
		<div class="form-group">
		<label for="nom">Indice :</label>
		<form:input path="indice" type="text" id="indice" class="form-control"/>
		</div>
		
		
	<div class="form-group">
      <label for="dropdownDep">Sélectionner le département :</label>
		   		
    			
<form:select path="departement.idDepartement" items="${listeDep}" itemValue="idDepartement" itemLabel="nomDepartement" class="form-control"></form:select> 
  				
		
		</div>
		
		 <div class="form-group">
      <label for="dropdownMat">Sélectionner la matière enseignée :</label>
		
<form:select path="matiere.idMat" items="${listeMat}" itemValue="idMat" itemLabel="nom" class="form-control"></form:select> 
 
		
		</div><br>
		

	
   <form:button type="submit" value="validerEnseignant" class="btn btn-primary btn-block">Ajouter Enseignant</form:button><br>
      
    </form:form>


<h3>Liste des enseignants</h3>	 
 <table class="table table-striped">
<thead>
<tr>
<th>Id</th>
<th>Nom</th>
<th>Prenom</th>
<th>Mail</th>
<th>Téléphone</th>
<th>Date Prise Fonction</th>
<th>Indice</th>
<th>Modifier</th>
<th>Supprimer</th>
</tr>
</thead>

<tbody>

<c:forEach items="${listeEns}" var="ens">
<tr>
<td>${ens.idPersonne}</td>
<td>${ens.nom}</td>
<td>${ens.prenom}</td>
<td>${ens.mail}</td>
<td>${ens.tel}</td>
<td>${ens.datePriseFonction}</td>
<td>${ens.indice}</td>
<td><a href="editEns?id=${ens.idPersonne}">modifier</a></td>
<td><a href="deleteEns?id=${ens.idPersonne}">supprimer</a></td>
</tr>
</c:forEach>

</tbody>

</table>  
    
    
    
 </div>
 </div>
     
    
    <div class="col-sm-5" >
    <div class="border">
    <h2>Formulaire pour Etudiants</h2>	
     
 	<form:form modelAttribute="etudiant" action="/college-web/admin/ajoutEtudiant" >

		<form:input path="idPersonne" type="hidden"/>
		
		<div class="form-group">
		<label for="nomE">Nom :</label>
		<form:input path="nom" type="text" id="nomE" class="form-control"/>
		</div>
		<div class="form-group">
		<label for="prenomE">Prénom :</label>
		<form:input path="prenom" type="text" id="prenomE" class="form-control"/>
		</div>
		<div class="form-group">
		<label for="mailE">Mail :</label>
		<form:input path="mail" type="text" id="mailE" class="form-control"/>
		</div>
		<div class="form-group">
		<label for="telE">Téléphone :</label>
		<form:input path="tel" type="text" id="telE" class="form-control"/>
		</div>
		<div class="form-group">
		<label for="anneEntree">Année Entrée :</label>
		<form:input path="anneEntree" type="text" id="anneEntree" class="form-control"/><br>
		</div>

	<form:button type="submit" value="validerEtudiant" class="btn btn-primary btn-block">Ajouter Etudiant</form:button><br>


	</form:form>

  






<h3>Liste des étudiants</h3>	

<table class="table table-striped">
<thead>
<tr>
<th>Id</th>
<th>Nom</th>
<th>Prenom</th>
<th>Mail</th>
<th>Téléphone</th>
<th>Année Entrée</th>
<th>Modifier</th>
<th>Supprimer</th>
</tr>
</thead>

<tbody>

<c:forEach items="${listeEtudiant}" var="etud">
<tr>
<td>${etud.idPersonne}</td>
<td>${etud.nom}</td>
<td>${etud.prenom}</td>
<td>${etud.mail}</td>
<td>${etud.tel}</td>
<td>${etud.anneEntree}</td>

<td><a href="editEtud?id=${etud.idPersonne}">modifier</a></td>
<td><a href="deleteEtud?id=${etud.idPersonne}">supprimer</a></td>
</tr>
</c:forEach>

</tbody>

</table>


  </div>

</div>

</div>






</body>
</html>