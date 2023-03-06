package com.netcracker.ratingservice.repositories;

import com.netcracker.ratingservice.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface RatingRepository  extends JpaRepository<Rating, String> {

    @Query(value = "SELECT * FROM user_rating WHERE user_id=?1", nativeQuery = true)
    List<Rating> findByUserId(int userid);

    @Query(value = "SELECT * FROM user_rating WHERE hotel_id=?1", nativeQuery = true)
    List<Rating> findByHotelId(String hotelid);
}
