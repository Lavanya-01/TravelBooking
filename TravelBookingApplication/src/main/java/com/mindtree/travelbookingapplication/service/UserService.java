package com.mindtree.travelbookingapplication.service;

import java.util.List;

import com.mindtree.travelbookingapplication.entity.Users;
import com.mindtree.travelbookingapplication.exception.serviceexception.TravelBookingApplicationServiceException;

public interface UserService {

	Users addUsers(Users user) throws TravelBookingApplicationServiceException;

	List<Users> getAllUserData();

}
