package com.raul.usuario_service.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException() {
        super("Recurso no encontrado");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
