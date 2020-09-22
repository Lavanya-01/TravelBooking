package com.mindtree.travelbookingapplication.service.serviceimplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.travelbookingapplication.entity.Users;
import com.mindtree.travelbookingapplication.exception.serviceexception.TravelBookingApplicationServiceException;
import com.mindtree.travelbookingapplication.exception.serviceexception.customexception.UserAlreadyExsistException;
import com.mindtree.travelbookingapplication.repository.UserRepository;
import com.mindtree.travelbookingapplication.service.UserService;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public Users addUsers(Users user) throws TravelBookingApplicationServiceException {
		if(userRepository.findByUserName(user.getUserName()).isPresent())
			throw new UserAlreadyExsistException("User With This Name Already Present");
		return userRepository.save(user);
	}

	@Override
	public List<Users> getAllUserData() {
		List<Users> userlist = new ArrayList<>();
		userlist.addAll(userRepository.findAll().stream().map(user -> user).collect(Collectors.toList()));
		return userlist;
		
	}
}
