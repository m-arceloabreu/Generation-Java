package com.helloworld.hello;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication

public class HelloApplication {
	
	@GetMapping ("/rota1")
	String home(){
	return "PERSISTENCIA, ORIENTAÇÃO AO DETALHE";
	}
	@GetMapping("/rota2")
	String home1() {
		return "DESENVOLVER MINHAS HABILIDADES EM SPRING E REST";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
