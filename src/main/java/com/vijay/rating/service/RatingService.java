package com.vijay.rating.service;

import java.util.List;

import com.vijay.rating.Entity.RatingEntity;
import com.vijay.rating.Exception.ResourceNotFound;


public interface RatingService {

	public RatingEntity saveRating(RatingEntity ratingentity);
	
	//get all rating
	public List<RatingEntity> getAllRating();

	//get rating by rating id
	public RatingEntity getUserRating(int ratingId) throws ResourceNotFound;

	//get all by userid
	public List<RatingEntity> getRatingByUserId(int userid);
	
	//get all by hotelid
	public List<RatingEntity> getRatingByHotelId(int hotelid);

}
