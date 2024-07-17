package com.raul.calificacion_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raul.calificacion_service.entity.Calificacion;
import com.raul.calificacion_service.repository.CalificacionRepository;

import java.util.List;
import java.util.UUID;

@Service
public class CalificacionServiceImpl implements CalificacionService{

    @Autowired
    private CalificacionRepository calificacionRepository;

    @Override
    public Calificacion saveCalificacion(Calificacion calificacion) {
        String randomId = UUID.randomUUID().toString();
        calificacion.setId(randomId);
        return calificacionRepository.save(calificacion);
    }

    @Override
    public List<Calificacion> getAll() {
        return calificacionRepository.findAll();
    }

    @Override
    public List<Calificacion> getCalificacionesByUsuarioId(String usuarioId) {
        return calificacionRepository.findByUsuarioId(usuarioId);
    }

    @Override
    public List<Calificacion> getCalificacionesByHotelId(String hotelId) {
        return calificacionRepository.findByHotelId(hotelId);
    }
}
