package com.netcracker.ratingservice.service.impl;

import com.netcracker.ratingservice.entities.Rating;
import com.netcracker.ratingservice.repositories.RatingRepository;
import com.netcracker.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository repository;

    @Override
    public Rating createRating(Rating rating) {
        return repository.save(rating);
    }

    @Override
    public Rating getRating(String id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Rating> getRatings() {
        return repository.findAll();
    }

    @Override
    public List<Rating> getRatingsByUserId(Integer userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingsByHotelId(String hotelId) {
        return repository.findByHotelId(hotelId);
    }

}
