package com.raul.calificacion_service.service;

import java.util.List;

import com.raul.calificacion_service.entity.Calificacion;

public interface CalificacionService {

    Calificacion saveCalificacion (Calificacion calificacion);

    List<Calificacion> getAll();

    List<Calificacion> getCalificacionesByUsuarioId(String usuarioId);

    List<Calificacion> getCalificacionesByHotelId(String hotelId);

}
