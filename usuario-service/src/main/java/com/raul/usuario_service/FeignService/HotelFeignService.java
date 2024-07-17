package com.raul.usuario_service.FeignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.raul.usuario_service.entity.Hotel;

@FeignClient(name = "hotel-service")
public interface HotelFeignService {

    @GetMapping("/hoteles/{hotelId}")
    Hotel obtenerHotel(@PathVariable String hotelId);
}
