package com.raul.usuario_service.event;

import lombok.Data;

import java.io.Serializable;

@Data
public class CreateUserEvent {
    private String name;

    private String username;

    private String email;
}
