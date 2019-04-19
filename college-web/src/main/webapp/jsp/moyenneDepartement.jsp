<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"/>
<title>Insert title here</title>
</head>
<body>

<fieldset>
<div>Suivi général département</div>
<div>

<br>

<form:form modelAttribute="departement" action="/college-web/calculMoyDep">
<div>Département:
<form:select path="idDepartement" items="${listeDep}" itemValue="idDepartement" itemLabel="nomDepartement"></form:select><br>
<form:button type="submit">Moyenne par département</form:button> <br>
<output>${moyenne}</output><br>
</div>
</form:form>






</div>
</fieldset>

				

</body>
</html>