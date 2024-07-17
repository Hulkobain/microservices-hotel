package com.raul.usuario_service.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ApiResponse {

    private String message;

    private boolean success;

    private HttpStatus httpStatus;
}
