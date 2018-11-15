package com.example.Lab21CoffeeShopUserRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Cartcontroller {
	
	
	@Autowired
	//private MenuItemDao menuItemDao;
	private CartItemDao cart;
	
	@RequestMapping("/cart")
	public ModelAndView showcart() {
		ModelAndView mv=new ModelAndView("cart");
		mv.addObject("cartItem",CartItemDao.findAll());
		return mv;
	}

}
