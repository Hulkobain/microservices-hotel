package com.raul.hotel_service;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.raul.hotel_service.config.EnvLoader;

@SpringBootApplication
@EnableDiscoveryClient
public class HotelServiceApplication {

	public static void main(String[] args) {
		EnvLoader.loadEnvVariables(".env");
		SpringApplication.run(HotelServiceApplication.class, args);
	}
}