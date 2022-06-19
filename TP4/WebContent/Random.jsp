<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="rb" class="beans.RandomBean" scope="session"></jsp:useBean>

<b>nbr° : <%= rb.getR() %> </b>

</body>
</html>