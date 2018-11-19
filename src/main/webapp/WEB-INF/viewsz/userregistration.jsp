<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Invite</title>
<link rel="stylesheet"href="/style.css" />
</head>
<body>
<h1>Thank you for navigating to our registration page</h1>
<h1> Please click the form to Register!</h1>

<form action="/add/user" method="post">
<fieldset>
First Name: <input name = "firstname"/><br>
Last Name: <input name = "lastname" placeholder = "last name"/><br>
Email: <input type = "email" name = "email" placeholder = "abc@gmail.com" pattern="[-0-9a-zA-Z.+_]{5}+@[-0-9a-zA-Z.+_]+\\\\.[a-zA-Z]{2,4}" required/><br>
Phone Number: <input name = "phonenumber" placeholder = "111-111-1111" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}"
required/><br>
Password: <input type = "password" name="password" pattern=".{5,}" title="Five or more characters"/><br>


Favorite Coffee Beverage: <select name="favorite_coffee_beverage">
  <option value="select a value">Select A Value</option>
  <option value="iced coffee">Iced Coffee</option>
  <option value="hot coffee">Hot Coffee</option>
  <option value="lattes">Lattes</option>
  <option value="Cappucino">Cappucino</option>
  <option value="Other">Other</option>
</select>
</fieldset>




<p>
 		<button>Submit</button>
 	</p>

</form>
</body>
</html>