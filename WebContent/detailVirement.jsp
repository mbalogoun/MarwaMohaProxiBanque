<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html" charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Ecran de Virement</title>
</head>
<body>
	<h1>Virement de la part de Mr/Mme :</h1>
	${client.nom} ${client.prenom} <input type="text" value="${client.idCompte}"><br/>
	<label>Montant</label> <input type="number" name="montant" placeholder="100" required> <input type="text" value="€">
	<h1>Vers le compte du Mr/Mme :</h1>
	<table>
	<tr>
	<td>Nom</td>
	<td>Prenom</td>
	<td>Ville</td>
	<td>Numero du compte</td>
	</tr>
	<c:forEach var="client" items="${maliste}">
	<tr>
	<td>${client.nom}</td>
	<td>${client.prenom}</td>
	<td>${client.ville}</td>
	<td>${client.idcompte}</td>
	</tr>		
	</c:forEach>
	</table>
	<button type="submit">Submit</button>
	<button type="reset">Cancel</button>
</body>
</html>