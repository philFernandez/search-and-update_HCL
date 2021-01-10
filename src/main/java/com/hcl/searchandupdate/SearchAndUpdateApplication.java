package com.hcl.searchandupdate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan(basePackages = "com.hcl.searchandupdate")
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class SearchAndUpdateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchAndUpdateApplication.class, args);
	}
}
