<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  



  
</head>
<body>



<table >

<tr>

<td>
<a href="<c:url value="/admin/gestionCollege"/>"><button>Gestion College</button> </a>
</td>
<td>
<a href="<c:url value="/admin/gestionDepartement"/>"><button>Gestion Departement</button> </a>
</td>

<td>
<a href="<c:url value="/admin/gestionPersonne"/>"><button>Gestion Personne</button> </a>
</td>
<td>
<a href="<c:url value="/admin/gestionMatiere"/>"><button>Gestion Matiere</button> </a>
</td>
<td>
<a href="<c:url value="/admin/gestionSalle"/>"><button>Gestion Salle</button> </a>
</td>

</tr>


</table>



</body>
</html>