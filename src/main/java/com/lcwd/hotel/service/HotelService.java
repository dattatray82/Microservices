package com.lcwd.hotel.service;

import java.util.List;

import com.lcwd.hotel.entity.Hotel;

public interface HotelService {

	// create 
	
	public Hotel create(Hotel hotel);
	
	// get all hotels
	
	public List<Hotel> getAllHotel();
	
	// get single hotel
	
	public Hotel getHotelById(String id);
	
}
