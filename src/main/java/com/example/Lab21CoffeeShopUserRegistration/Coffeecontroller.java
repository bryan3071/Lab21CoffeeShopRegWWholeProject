package com.example.Lab21CoffeeShopUserRegistration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class Coffeecontroller {
	
	@Autowired
	//private MenuItemDao menuItemDao;
	private MenuItemDao menuItemDao;
	private MenuService menuService;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	
	@RequestMapping("/userregistration")
	public ModelAndView showUserregistration()
	{
			return new ModelAndView("userregistration");
	}
	
	@RequestMapping("/menuservice")
	public ModelAndView showMenuService() {
		ModelAndView mv=new ModelAndView("menuservice");
		mv.addObject("menuService",menuItemDao.findAll() );
		return mv;
	}
	
	@RequestMapping("/hello")
	public ModelAndView showHello(@RequestParam("first")String first,
			@RequestParam("last") String last,
			@RequestParam("phonenumber") String phonenumber,
			@RequestParam("email")String email,
			@RequestParam("favorite")String favorite) {
	ModelAndView mv=new ModelAndView("hello");
	mv.addObject("first", first);
	mv.addObject("last", last);
	mv.addObject("phonenumber",phonenumber);
	mv.addObject("email", email);
	mv.addObject("favorite", favorite);
	
	return mv;
	}
	
	@RequestMapping("/MenuService")
	public ModelAndView showMenuService (@RequestParam (name="category", required = false) String category ) {
		
		ModelAndView mav = new ModelAndView("menuservice");
		mav.addObject("MenuItem",menuItemDao.findAll() );
		return mav;
	}
	
	@RequestMapping("/custservice")
	public ModelAndView showCustMenu() {
		ModelAndView mv=new ModelAndView("custmenu");
		mv.addObject("menuService",menuItemDao.findAll() );
		return mv;
	}
	
	@RequestMapping("/admin")
	public ModelAndView showAdminPage() {
	
		ModelAndView madmin = new ModelAndView("menuservice");
		madmin.addObject("menuService", menuItemDao.findAll());
		return madmin;
	
	}
	@RequestMapping("/add-drink")
	public ModelAndView showAddDrink(MenuItem menuItem ) {
		ModelAndView mav2 = new ModelAndView("menuservice");
		menuItemDao.create(menuItem);
		mav2.addObject ("menuService", menuItemDao.findAll());
		return mav2;
	}
	
//	// path variable required to identify which food we're editing
//		@RequestMapping("/food/update")
//		public ModelAndView showEditForm(@RequestParam("id") Long id) {
//			ModelAndView mav = new ModelAndView("food-form");
//			mav.addObject("food", MenuItemDao.findById(id));
//			mav.addObject("title", "Edit Food");
//			return mav;
//		}
		
//	// commenting out to test	
	// same URL but different method
//		@RequestMapping(value="/menuservice/update", method=RequestMethod.POST)
//		public ModelAndView submitEditForm(MenuItem food) {
//			MenuItemDao.update(food);
//			return new ModelAndView("redirect:/menuservice");
//		}
//		
//		
	@RequestMapping("/food/delete")
	public ModelAndView delete(@RequestParam("id") Long id) {
		MenuItemDao.delete(id);
		return new ModelAndView("redirect:/food");
	}
	
	
}


