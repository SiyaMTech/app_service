package com.netcracker.hotelservice.service.impl;

import com.netcracker.hotelservice.entities.Hotel;
import com.netcracker.hotelservice.exception.ResourceNotFoundException;
import com.netcracker.hotelservice.repository.HotelRepository;
import com.netcracker.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl  implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel addHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotelById(String id) {
        return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("No Hotel with id: "+id));
    }

    @Override
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }
}
