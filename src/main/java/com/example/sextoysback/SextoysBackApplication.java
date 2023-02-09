package com.example.sextoysback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SextoysBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SextoysBackApplication.class, args);
	}

}
