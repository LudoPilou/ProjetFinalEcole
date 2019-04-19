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

<fieldset>
<div><center>Suivi général</center></div>
<div>
<center>


<form:form modelAttribute="departement" action="/college-web/suiviGeneral">
<div>Département:
<form:select path="idDepartement" items="${listeDep}" itemValue="idDepartement" itemLabel="nomDepartement"></form:select><br>
</div>
</form:form>

<form:form modelAttribute="noter" action="/college-web/suiviGeneral">

</form:form>

<form:form modelAttribute="matiere" action="/college-web/suiviGeneral">
<div>Matiere:			
<form:select path="idMatiere" items="${listeMat}" itemValue="idMatiere" itemLabel="nom"></form:select><br>
</div>	
			
</center>
</div>
</fieldset>
</form:form>
				

</body>
</html>