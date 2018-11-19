<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Say Hello</title>
<link rel="stylesheet"href="/style.css" />
</head>
<body>

<a href="/userregistration"></a>
<p>Hello ${ first } ${ last }.</p>
<p>Phone Number is ${ phonenumber  } </p>
<p> Email address is ${ email }.</p>
<p> Your favorite beverage is ${ favorite }</p>

</body>
</html>