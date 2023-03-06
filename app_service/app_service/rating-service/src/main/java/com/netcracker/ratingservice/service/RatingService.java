package com.netcracker.ratingservice.service;

import com.netcracker.ratingservice.entities.Rating;

import java.util.List;

public interface RatingService {
    Rating createRating(Rating rating);
    Rating getRating(String id);
    List<Rating> getRatings();
    List<Rating> getRatingsByUserId(Integer userId);
    List<Rating> getRatingsByHotelId(String hotelId);

}
