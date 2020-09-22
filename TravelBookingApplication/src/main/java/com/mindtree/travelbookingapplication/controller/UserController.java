
package com.mindtree.travelbookingapplication.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.travelbookingapplication.entity.Users;
import com.mindtree.travelbookingapplication.exception.TravelBookingApplicationException;
import com.mindtree.travelbookingapplication.exception.serviceexception.TravelBookingApplicationServiceException;
import com.mindtree.travelbookingapplication.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/register")
	public String createNewUserPage(Model model) {
		model.addAttribute("user", new Users());
		return "register";
	}

	@RequestMapping(value = "saveUser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") Users user) throws TravelBookingApplicationException {
		userService.addUsers(user);
		return "redirect:/register";
	}
	
	
	

}
