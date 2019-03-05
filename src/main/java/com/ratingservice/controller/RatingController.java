package com.ratingservice.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratingservice.model.Rating;
import com.ratingservice.model.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating("1234",4);
		
	}
	
	//taking userId returning list of movies that the user rated.
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId")  String userId){
		
		List<Rating> ratings=Arrays.asList(
				new Rating("111",4),
				new Rating("112",3)
				);
		  UserRating userRating=new UserRating();
		  userRating.setUserRating(ratings);
		  return userRating;
		
	}

}
