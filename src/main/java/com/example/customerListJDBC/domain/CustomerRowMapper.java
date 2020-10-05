package com.example.customerListJDBC.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> {
	

	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setFirstname(rs.getString("firstname"));
		customer.setLastname(rs.getString("lastname"));
		customer.setId(rs.getLong("id"));
		
		return customer;
	}

}

