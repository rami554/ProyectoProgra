package com.arte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ProjectofinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectofinalApplication.class, args);
		System.out.println("Hola Proyecto");

	}

}
