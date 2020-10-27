package com.control.salescontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SalescontrollerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalescontrollerApplication.class, args);
	}

}
