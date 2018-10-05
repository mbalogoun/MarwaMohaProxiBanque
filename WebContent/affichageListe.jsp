<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html" charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Listes Clients</title>
</head>
<body>
<h3>Listes des Clients </h3>
	<table>
	<tr>
		<td>Nom</td>
		<td>Prenom</td>
		<td>Editer</td>
		<td>Listes Comptes</td>
		<td>Virement</td>
	</tr>
	<tr>
	<c:forEach var="client" items="${maliste}">
		<td>"${client.nom}"</td>
		<td>"${client.prenom}"</td>
		<td><a href="MaServletEditer">Editer</a></td>
		<td><a href="MaServletComptes">Listes Comptes</a></td>
		<td><a href="MaServletVirement">Virement</a>"</td>
	    </c:forEach>
	</tr>
	</table>
</body>
</html>