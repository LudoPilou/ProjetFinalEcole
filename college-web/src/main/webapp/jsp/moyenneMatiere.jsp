<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"></meta>
<title>Insert title here</title>
</head>
<body>

<fieldset>
<div>Suivi général matiere</div>
<div>

<br>

<form:form modelAttribute="matiere" action="/college-web/calculMoyMat">
<div>Matiere:			
<form:select path="idMat" items="${listeMat}" itemValue="idMat" itemLabel="nom"></form:select><br>
<form:button type="submit">Moyenne par matière</form:button><br>
<output>${moyenne}</output><br>
</div>
</form:form>	
<br>



</div>
</fieldset>
				

</body>
</html>