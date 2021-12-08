<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SHOW BOOK</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<h1><c:out value="title"></c:out></h1>
	<p> Description: <c:out value="description"></c:out></p>
	<p> Language: <c:out value="Language"></c:out></p>
	<p> Number of Pages: <c:out value="pages"></c:out></p>
	
</body>
</html>