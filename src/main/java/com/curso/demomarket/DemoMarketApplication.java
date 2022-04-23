 package com.curso.demomarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class DemoMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMarketApplication.class, args);
	}

}
