package com.ratingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ratingservice.model.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer>{

}
