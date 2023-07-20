package com.lcwd.hotel.controller;

import java.util.List;

import org.apache.coyote.http11.Http11InputBuffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.hotel.entity.Hotel;
import com.lcwd.hotel.service.HotelService;
import com.lcwd.hotel.service.HotelServiceImp;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	// create
	
	@PostMapping
	public  ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		
		Hotel hotel2 = hotelService.create(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(hotel2);
	}
	
	// get single
	
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable String id){
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotelById(id));
	}
	
	// get All
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHotel());
	}
}
