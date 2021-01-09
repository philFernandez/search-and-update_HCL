package com.hcl.searchandupdate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.hcl.searchandupdate")
public class SearchAndUpdateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchAndUpdateApplication.class, args);
	}
}
