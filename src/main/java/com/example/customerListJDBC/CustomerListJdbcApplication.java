package com.example.customerListJDBC;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.customerListJDBC.domain.Customer;
import com.example.customerListJDBC.domain.CustomerDAOImpl;

@SpringBootApplication
public class CustomerListJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerListJdbcApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(CustomerDAOImpl customerDAO) {
		return (args) -> {
			// Database is created by using resources/schema.sql
			
			// Insert some demo data
	        customerDAO.save(new Customer("Pratistha", "Mishra"));
	        customerDAO.save(new Customer("Pratik", "Subedi"));
	        customerDAO.save(new Customer("Sufi", "Misu"));
	       
		};
	}	

}
