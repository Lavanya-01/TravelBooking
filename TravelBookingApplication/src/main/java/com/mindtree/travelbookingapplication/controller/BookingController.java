package com.mindtree.travelbookingapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.travelbookingapplication.entity.Booking;
import com.mindtree.travelbookingapplication.service.BookingService;
import com.mindtree.travelbookingapplication.service.UserService;

@Controller
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "booking")
	public String viewBookingDetailsPage(Model model) {
		model.addAttribute("usersdata", userService.getAllUserData());
		model.addAttribute("bookingDetails", new Booking());
		return "booking";
	}

	@RequestMapping(value = "savebooking", method = RequestMethod.POST)
	public String savingBookingDetails(@ModelAttribute("bookingDetails") Booking bookingDetails,
			@RequestParam(name = "userId") long UserId) {
		bookingService.addBookingDetails(bookingDetails, UserId);
		return "redirect:/booking";
	}
	

	@RequestMapping("/view")
	public String getBookingDetails(Model model) {
		model.addAttribute("usersdata", userService.getAllUserData());
		return "view";
	}

	@RequestMapping(value = "getdetails", method = RequestMethod.POST)
	public String getDetailsByUserID(@RequestParam(name = "userId") long UserId, Model model) {
		model.addAttribute("usersdata", userService.getAllUserData());
		model.addAttribute("bookingDetailsOfUserById", bookingService.getAllBookingOfUserById(UserId));
		return "view";
	}
	

}
