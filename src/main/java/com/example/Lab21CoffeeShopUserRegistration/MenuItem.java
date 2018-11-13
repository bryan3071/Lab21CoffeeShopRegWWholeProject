package com.example.Lab21CoffeeShopUserRegistration;

public class MenuItem {
Long id;
String name;
String description;
Double price;

public MenuItem() {
	
}

public MenuItem(Long id, String name, String description, Double price) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.price = price;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}




public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

@Override
public String toString() {
	return "MenuItem [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
}








	
}
