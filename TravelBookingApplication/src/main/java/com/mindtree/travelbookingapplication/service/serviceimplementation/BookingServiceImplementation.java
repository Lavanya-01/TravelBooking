package com.mindtree.travelbookingapplication.service.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.travelbookingapplication.entity.Booking;
import com.mindtree.travelbookingapplication.entity.Users;
import com.mindtree.travelbookingapplication.repository.BookingRepository;
import com.mindtree.travelbookingapplication.repository.UserRepository;
import com.mindtree.travelbookingapplication.service.BookingService;

@Service
public class BookingServiceImplementation implements BookingService{
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Booking addBookingDetails(Booking bookingDetails, long userId) {
		Users user = userRepository.findById(userId).get();

		bookingDetails.setPrice(priceCalucation(bookingDetails.getDistance(), user.getAge()));
		user.setBookings(bookingDetails);
		bookingDetails.setUser(user);
		return bookingRepository.save(bookingDetails);
			
		
	}

	private double priceCalucation(float distance, int age) {
		double price = distance * 10;
		if (age > 30 && age <= 50) {
			price = price - (price * 0.05);
			return price;
		} else if (age > 50) {
			price = price - (price * 0.1);
			return price;
		} else {
			return price;
		}
	
	
	}

	@Override
	public List<Booking> getAllBookingOfUserById(long userId) {
		return userRepository.findById(userId).get().getBookings();
	}

}
