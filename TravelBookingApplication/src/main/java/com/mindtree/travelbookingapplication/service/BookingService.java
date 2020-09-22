package com.mindtree.travelbookingapplication.service;

import java.util.List;

import com.mindtree.travelbookingapplication.entity.Booking;

public interface BookingService {

	Booking addBookingDetails(Booking bookingDetails, long userId);

	List<Booking> getAllBookingOfUserById(long userId);

}
