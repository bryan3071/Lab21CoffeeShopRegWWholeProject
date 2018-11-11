package com.example.Lab21CoffeeShopUserRegistration;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MenuService {

	private List<Drinks> list = new ArrayList<>();
	
	public MenuService() {
		list.add(new Drinks("Iced Tea", "Chilled Sweetened Tea", 2.00));
		list.add(new Drinks("Expresso Beverage", "Concentrated Form of Coffee", 3.00));
		list.add(new Drinks("Latte", "Steamed Milk", 4.00));
	}
	
	public List<Drinks> getMenu() {
		return list;
	}
	
}
