package com.example.splitwisee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SplitWiseeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplitWiseeApplication.class, args);
	}

}
