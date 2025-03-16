package com.proyect.hacom;

import com.proyect.hacom.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class HacomApplication {

	public static void main(String[] args) {
		SpringApplication.run(HacomApplication.class, args);
	}

}
