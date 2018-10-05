<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html" charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Listes Comptes</title>
</head>
<body>
<h1>Liste des comptes du Mr/Mme : ${client.id}</h1>
<c:forEach var="client" items="${maliste}">
		Compte Courant : <a href="detailVirement.jsp">${client.COURANT}</a><br/>
		Compte Epargne : <a href="detailVirement.jsp">${client.EPARGNE}</a><br/>
	    </c:forEach>
</body>
</html>