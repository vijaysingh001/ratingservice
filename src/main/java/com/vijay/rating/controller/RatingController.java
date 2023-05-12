package com.vijay.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.rating.Entity.RatingEntity;
import com.vijay.rating.Exception.ResourceNotFound;
import com.vijay.rating.service.RatingService;

@RestController
public class RatingController {

	
	@Autowired
	private RatingService ratingservice;
	
	
	
	
	@PostMapping("/userrating")
	public ResponseEntity<RatingEntity> createRating(@RequestBody RatingEntity ratingentity) throws NullPointerException{
		
		RatingEntity ratingobj=ratingservice.saveRating(ratingentity);
		if(ratingobj==null) {
			throw new NullPointerException();
		}
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingobj);
		
	}
	
	
	@GetMapping("/getuser/{ratingid}")
	public ResponseEntity<RatingEntity> getUserRating(@PathVariable int ratingid) throws ResourceNotFound{
		RatingEntity getrating=ratingservice.getUserRating(ratingid);
		return ResponseEntity.ok(getrating);		
	}
	
	@GetMapping("/hotels/{userid}")
	public ResponseEntity<List<RatingEntity>> getRatingByUserId(@PathVariable int userid){
		return ResponseEntity.ok(ratingservice.getRatingByUserId(userid));
	}
	
	@GetMapping("/hotels/{hotelid}")
	public ResponseEntity<List<RatingEntity>> getRatingByHotelId(@PathVariable int hotelid){
		return ResponseEntity.ok(ratingservice.getRatingByHotelId(hotelid));
		
	}
	
	
}
