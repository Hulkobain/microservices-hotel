package com.raul.usuario_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.raul.usuario_service.config.EnvLoader;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UsuarioServiceApplication {

	public static void main(String[] args) {
		EnvLoader.loadEnvVariables(".env");
        SpringApplication.run(UsuarioServiceApplication.class, args);
	}
}