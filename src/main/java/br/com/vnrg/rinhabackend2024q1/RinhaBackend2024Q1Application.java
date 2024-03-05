package br.com.vnrg.rinhabackend2024q1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class RinhaBackend2024Q1Application {

	public static void main(String[] args) {
		SpringApplication.run(RinhaBackend2024Q1Application.class, args);
	}

}
