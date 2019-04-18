<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>





<div class="container" >
<div class="row">
<div class="col-sm-1">
                <form modelAttribute="personne" action="/admin/gestionCollege"/">
                <button type="submit">Ajouter college</button>
                </form>

  </div>
  <div class="col-sm-1">              

                <form modelAttribute="formation" action="/admin/gestionDepartement">
                <button type="submit">Ajouter departement</button>
                </form>
                </div>
                
         <div class="col-sm-1">              

                <form modelAttribute="formation" action="/admin/gestionPersonne">
                <button type="submit">Ajouter persone</button>
                </form>
                </div>
                
                  <div class="col-sm-1">              

                <form modelAttribute="formation" action="/admin/gestionMatiere">
                <button type="submit">Ajouter matiere</button>
                </form>
                </div>


</div>




           </div>













</body>
</html>