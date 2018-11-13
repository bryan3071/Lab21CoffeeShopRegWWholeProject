package com.example.Lab21CoffeeShopUserRegistration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MenuItemDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<MenuItem> findAll() {
		return jdbcTemplate.query("SELECT * fROM menu_item", new BeanPropertyRowMapper<>(MenuItem.class));
		
	}
}
