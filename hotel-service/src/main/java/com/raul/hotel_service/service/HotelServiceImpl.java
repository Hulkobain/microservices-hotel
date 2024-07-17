package com.raul.hotel_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raul.hotel_service.entity.Hotel;
import com.raul.hotel_service.exception.ResourceNotFoundException;
import com.raul.hotel_service.repository.HotelRepository;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel saveHotel(Hotel hotel) {
        String randomId = UUID.randomUUID().toString();
        hotel.setId(randomId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String id) {
        return hotelRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Hotel no encontrado con el id: " + id)
        );
    }
}
