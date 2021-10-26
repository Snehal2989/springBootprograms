package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootActuatorApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Springboot Actuator");
		SpringApplication.run(SpringBootActuatorApplication.class, args);
	}

}
