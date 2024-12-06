package com.bharath.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		 Dotenv dotenv = Dotenv.configure()
		            .filename(".env") // Specify the .env file location
		            .load();

		        dotenv.entries().forEach(entry ->
		            System.setProperty(entry.getKey(), entry.getValue())
		        );

		
		
		SpringApplication.run(DemoApplication.class, args);
	}

}
