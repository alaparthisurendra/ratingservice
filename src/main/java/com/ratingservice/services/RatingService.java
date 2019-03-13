package com.ratingservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratingservice.model.Rating;
import com.ratingservice.repository.RatingRepository;

@Service
public class RatingService {
	
	@Autowired
	private RatingRepository ratingRepository;
	
	
	public Rating getRatingById(Integer rid)
	{
		return ratingRepository.getOne(rid);
	}
	
	public Rating addRating(Rating rating)
	{
		return ratingRepository.save(rating);
		
	}
	
	public void delete(Integer rid)
	{
		ratingRepository.deleteById(rid);
	}
	
	public List<Rating> getAllRatings()
	{
		List<Rating> ratings=new ArrayList<>();
		ratingRepository.findAll().forEach(ratings::add);
		return ratings;
	}
	
	public Rating UpdateRating(Integer rid, Rating rating)
	{
		rating.setRating(rid);
		return ratingRepository.save(rating);
		
	}

}