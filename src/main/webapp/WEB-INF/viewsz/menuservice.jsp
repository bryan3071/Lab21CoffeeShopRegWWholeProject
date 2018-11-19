<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Coffee List</title>
</head>
<body>
	<h1>Drink List</h1>
	<form>
		<input name="category" placeholder="Category" />
		<button>Filter</button>
	</form>
	
		<table>
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Price</th>

			</tr>


		
		
			<c:forEach items="${menuService}" var="menuService">
				<tr>
					<td>${menuService.name}</td>
					<td>${menuService.description}</td>
					<td>${menuService.price}</td>
					
					<td>
						<a href="/food/update?id=${ menuService.id }" class="btn btn-light btn-sm">Edit</a>
						<a href="/menuItem/delete?id=${ menuItem.id }" class="btn btn-light btn-sm">Delete</a>
					</td>
				</tr>
				
			</c:forEach>
			</table>
			<br>
			
		<a class="btn btn-secondary" href="/food/create">Add To Drink List</a>
	<form action="add-drink">
	Name:<input name= "name"></input>
	Description:<input name="description"></input>
	Price:<input name="price"></input>
	
	<button>Add</button>
	
	</form>


	
</body>
</html>