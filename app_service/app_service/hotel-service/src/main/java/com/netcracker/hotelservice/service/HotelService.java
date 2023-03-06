package com.netcracker.hotelservice.service;

import com.netcracker.hotelservice.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel addHotel(Hotel hotel);

    Hotel getHotelById(String id);

    List<Hotel> getHotels();
}
