package dev.goat.reactproject;

import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ReactProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactProjectApplication.class, args);
	}

	@GetMapping
	public String apiRoot(){
		return "Hello World";
	}
}
