package com.entra21OlaMundo.entra21OlaMundo;

import olaController.OlaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {OlaController.class})
public class Entra21OlaMundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Entra21OlaMundoApplication.class, args);
	}

}
