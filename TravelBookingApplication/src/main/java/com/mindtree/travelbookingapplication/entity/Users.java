package com.mindtree.travelbookingapplication.entity;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	private String userName;
	private int age;

	@OneToMany(cascade = CascadeType.PERSIST,mappedBy = "user")
	private List<Booking> bookings;

	public Users() {
		super();
	}

	public Users(String userName, int age, List<Booking> bookings) {
		super();
		this.userName = userName;
		this.age = age;
		this.bookings = bookings;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(Booking bookings) {
		this.bookings.add(bookings);
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", age=" + age + ", bookings=" + bookings + "]";
	}

	

}
