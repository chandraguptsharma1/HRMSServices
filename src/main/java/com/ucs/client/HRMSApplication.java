package com.ucs.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com")
public class HRMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(HRMSApplication.class, args);
		System.out.println("HRMSApplication.main()");
	}

}
