package com.ratingservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratingservice.model.Rating;
import com.ratingservice.services.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	@GetMapping("/ratings/{rId}")
	public Rating getRating(@PathVariable(value="rId") Integer rId) {
		Rating ratings=ratingService.getRatingById(rId);
		if(ratings==null)
		{
			System.out.println("rating info not avilable");
		}
		return ratings;
	}
	
	//taking userId returning list of movies that the user rated.
	
	    @PostMapping("/add")
		public Rating  addRating(@RequestBody Rating ratings)
		{
			Rating rat=ratingService.addRating(ratings);
			return rat;
			
		}
	    
	    @GetMapping("/all")
	    public List<Rating> getAllRatings()
	    {
	    	List<Rating> allRatings = ratingService.getAllRatings();
	    	if (allRatings == null) {
				System.out.println("r information not avilable");
			}
			return allRatings;
	    }
	
	

}
