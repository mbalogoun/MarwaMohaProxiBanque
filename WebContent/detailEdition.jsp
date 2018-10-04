<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html" charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Editer Client</title>
</head>
<body>
<h1>Editer Mr/Mme: ${client.id}</h1>
<form action="#" method="post">
<label>Nom : </label><input type="text" value="${client.nom}"><br/>
<label>Prenom : </label><input type="text" value="${client.prenom}"><br/>
<label>Email : </label><input type="text" value="${client.email}"><br/>
<label>Adresse : </label><input type="text" value="${client.adresse}"><br/>
<label>Code Postale : </label><input type="text" value="${client.codepostale}"><br/>
<label>Ville : </label><input type="text" value="${client.ville}"><br/>
<button type="submit">Submit</button>
<button type="reset">Cancel</button>
</form>
</body>
</html>