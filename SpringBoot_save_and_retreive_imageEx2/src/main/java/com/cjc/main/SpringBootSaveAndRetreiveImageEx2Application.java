package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.MultipartFilter;

@SpringBootApplication
public class SpringBootSaveAndRetreiveImageEx2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSaveAndRetreiveImageEx2Application.class, args);
	}
	

}
