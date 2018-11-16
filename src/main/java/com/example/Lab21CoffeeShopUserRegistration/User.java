package com.example.Lab21CoffeeShopUserRegistration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="user")
public class User {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private String password;
	private String favoriteCoffeeBeverage;
	public User(Long id, String first_name, String last_name, String email, String phone_number, String password,
			String favoriteCoffeeBeverage) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
		this.password = password;
		this.favoriteCoffeeBeverage = favoriteCoffeeBeverage;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFavoriteCoffeeBeverage() {
		return favoriteCoffeeBeverage;
	}
	public void setFavoriteCoffeeBeverage(String favoriteCoffeeBeverage) {
		this.favoriteCoffeeBeverage = favoriteCoffeeBeverage;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", phone_number=" + phone_number + ", password=" + password + ", favoriteCoffeeBeverage="
				+ favoriteCoffeeBeverage + "]";
	}
	
	
	
}
