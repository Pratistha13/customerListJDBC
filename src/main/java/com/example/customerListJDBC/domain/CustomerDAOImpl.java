package com.example.customerListJDBC.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate; 
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJbdcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void save(Customer customer) {
		String sql = "insert into customer(firstname, lastname) values(?,?)";
		Object[] parameters = new Object[] { customer.getFirstname(), customer.getLastname()};
		jdbcTemplate.update(sql, parameters);
	}
	
	public Customer findOne(int id) {
		String sql = "select id, firstname, lastname from customer where id = ?";
		Object[] parameters = new Object[] { id };
		RowMapper<Customer> mapper = new CustomerRowMapper();

		Customer customer = jdbcTemplate.queryForObject(sql, parameters, mapper);
		return customer;
	}
	public List<Customer> findAll() {

		String sql = "select id, firstname, lastname from customer";
		RowMapper<Customer> mapper = new CustomerRowMapper();
		List<Customer> customers = jdbcTemplate.query(sql, mapper);

		return customers;
	}

}
