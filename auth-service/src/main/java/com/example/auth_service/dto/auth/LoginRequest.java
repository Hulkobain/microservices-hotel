package com.example.auth_service.dto.auth;

import lombok.Data;

import java.io.Serializable;

@Data
public class LoginRequest implements Serializable {

    private String username;

    private String password;
}
