package com.ProyekInformatika.TrainManager;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@OpenAPIDefinition
public class TrainManagerAdvanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainManagerAdvanceApplication.class, args);
	}

}
