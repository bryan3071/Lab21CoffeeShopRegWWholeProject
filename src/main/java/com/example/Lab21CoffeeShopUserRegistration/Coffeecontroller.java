package com.example.Lab21CoffeeShopUserRegistration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Coffeecontroller {

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/userregistration")
	public ModelAndView showUserregistration()
	{
			return new ModelAndView("userregistration");
	}
	
	@RequestMapping("/hello")
	public ModelAndView showHello(@RequestParam("first")String first,
			@RequestParam("last") String last,
			@RequestParam("phonenumber") String phonenumber)
	
	 {
	ModelAndView mv=new ModelAndView("hello");
	mv.addObject("first", first);
	mv.addObject("last", last);
	mv.addObject("phonenumber",phonenumber);
	return mv;
	}
	
	
}
