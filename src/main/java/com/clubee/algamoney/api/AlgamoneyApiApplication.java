package com.clubee.algamoney.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class AlgamoneyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgamoneyApiApplication.class, args);
	}
}
