package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication {
	 
	
	public static void main(String[] args) {
		System.out.println("hello");
		
		System.out.println("Second line");
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

}
