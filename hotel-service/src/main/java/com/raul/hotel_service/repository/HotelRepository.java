package com.raul.hotel_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raul.hotel_service.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String> {
}
