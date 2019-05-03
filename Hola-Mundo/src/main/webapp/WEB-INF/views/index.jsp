<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html  xmlns:th="http://www.thymeleaf.org">
<head>

<title>Hola Mundo</title>
</head>
<body>
<h1><c:out value="${titulo}"/></h1>
<h2>${titulo}</h2>
</body>
</html>