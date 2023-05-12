package com.vijay.rating.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userrating")
public class RatingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int ratingid;
	int userid;
	int hotelid;
	int rating;
	String comment;
	

	public RatingEntity(int ratingid, int userid, int hotelid, int rating, String comment) {
		super();
		this.ratingid = ratingid;
		this.userid = userid;
		this.hotelid = hotelid;
		this.rating = rating;
		this.comment = comment;
	}


	public int getRatingid() {
		return ratingid;
	}


	public void setRatingid(int ratingid) {
		this.ratingid = ratingid;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public int getHotelid() {
		return hotelid;
	}


	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public RatingEntity() {
		
	}
	
}
