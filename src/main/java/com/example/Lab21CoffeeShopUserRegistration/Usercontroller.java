package com.example.Lab21CoffeeShopUserRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Usercontroller {

	@Autowired
	//private MenuItemDao menuItemDao;
	private UserDao user;
	
	@RequestMapping("/add/user")
	public ModelAndView showAddUser(User userItem ) {
		user.create(userItem);
		return new ModelAndView("redirect:/cart");
	}
	
}
