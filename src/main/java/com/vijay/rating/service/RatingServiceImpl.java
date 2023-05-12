package com.vijay.rating.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.rating.Entity.RatingEntity;
import com.vijay.rating.Exception.ResourceNotFound;
import com.vijay.rating.ratingDao.RatingInterface;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private RatingInterface ratinginterface;

	@Override
	public RatingEntity saveRating(RatingEntity ratingentity) {
		return ratinginterface.save(ratingentity);
	}

	@Override
	public RatingEntity getUserRating(int ratingid) throws ResourceNotFound {
		// TODO Auto-generated method stub
		return ratinginterface.findById(ratingid).orElseThrow(()->new ResourceNotFound("user rating not found"+ ratingid));
	}

	@Override
	public List<RatingEntity> getAllRating() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RatingEntity> getRatingByUserId(int userId) {
		// TODO Auto-generated method stub
		return ratinginterface.findByHotelid(userId);
	}

	@Override
	public List<RatingEntity> getRatingByHotelId(int hotelId) {
		// TODO Auto-generated method stub
		return ratinginterface.findByHotelid(hotelId);
	}

}
