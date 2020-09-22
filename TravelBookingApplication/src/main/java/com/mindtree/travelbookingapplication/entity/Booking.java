package com.mindtree.travelbookingapplication.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookingId;
	private String bookingFrom;
	private String bookingDestination;
	private LocalDate date;
	private String preference;
	private float distance;
	private String travellingId;
	private double price;
	
	@ManyToOne
	private Users user;

	public Booking() {
		super();
	}

	public Booking(String bookingFrom, String bookingDestination, LocalDate date, String preference, float distance,
			String travellingId, double price, Users user) {
		super();
		this.bookingFrom = bookingFrom;
		this.bookingDestination = bookingDestination;
		this.date = date;
		this.preference = preference;
		this.distance = distance;
		this.travellingId = travellingId;
		this.price = price;
		this.user = user;
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingFrom() {
		return bookingFrom;
	}

	public void setBookingFrom(String bookingFrom) {
		this.bookingFrom = bookingFrom;
	}

	public String getBookingDestination() {
		return bookingDestination;
	}

	public void setBookingDestination(String bookingDestination) {
		this.bookingDestination = bookingDestination;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public String getTravellingId() {
		return travellingId;
	}

	public void setTravellingId(String travellingId) {
		this.travellingId = travellingId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingFrom=" + bookingFrom + ", bookingDestination="
				+ bookingDestination + ", date=" + date + ", preference=" + preference + ", distance=" + distance
				+ ", travellingId=" + travellingId + ", price=" + price + ", user=" + user + "]";
	}

	

}
