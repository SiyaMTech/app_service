package com.netcracker.userservice.service.impl;

import com.netcracker.userservice.entities.Rating;
import com.netcracker.userservice.entities.User;
import com.netcracker.userservice.exception.ResourceNotFoundException;
import com.netcracker.userservice.repository.UserRepository;
import com.netcracker.userservice.service.UserService;
import com.netcracker.userservice.thirdparty.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RatingService ratingService;

    private String ratingUrl ="http://localhost:9191/ratings/user/";
    private String ratingBaseUrlByName = "http://RATING-SERVICE/ratings/user/";

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        User user = userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("No User with id: "+id));

       // ArrayList<Rating> ratings = restTemplate.getForObject(ratingBaseUrlByName + id, ArrayList.class);
        List<Rating> ratings = ratingService.getRating(id);
        user.setRatings(ratings);
        return user;
    }
}
