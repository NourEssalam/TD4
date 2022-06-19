<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Controller</title>
</head>
<body>
<jsp:useBean id="contBean" class="beans.ControlerBean" scope="session"></jsp:useBean>

<b>le nom est : <%= contBean.getLastName() %> </b> <br>
<b>le prenom est : <%= contBean.getFirstName() %> </b><br>
<b>le adresse est : <%= contBean.getAdresse() %> </b><br>
<b>le telephone est : <%= contBean.getPhone() %> </b><br>
<b>le E-mail est : <%= contBean.getEmail() %> </b><br>

</body>
</html>