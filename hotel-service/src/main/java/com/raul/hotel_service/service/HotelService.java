package com.raul.hotel_service.service;

import java.util.List;

import com.raul.hotel_service.entity.Hotel;

public interface HotelService {

    Hotel saveHotel (Hotel hotel);

    List<Hotel> getAll();

    Hotel getHotel (String id);

}
