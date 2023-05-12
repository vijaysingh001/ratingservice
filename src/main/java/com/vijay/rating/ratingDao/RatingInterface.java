package com.vijay.rating.ratingDao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vijay.rating.Entity.RatingEntity;

@Repository
public interface RatingInterface extends JpaRepository<RatingEntity, Integer> {

	
	List<RatingEntity> findByUserid(int userid);
	List<RatingEntity> findByHotelid(int hotelid);
}
