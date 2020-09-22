package com.mindtree.travelbookingapplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.travelbookingapplication.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

	Optional<Users> findByUserName(String userName);
	

}
