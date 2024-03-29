package com.ivson.point.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ivson.point.entity.Person;

@Repository
public class PersonJdbcDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Person> findAll() {
		// mapper
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));
	}
	
	public Person findById(int id) {
		return jdbcTemplate.queryForObject(
				"select * from person where id = ?", 
				new Object[] {id},
				new BeanPropertyRowMapper<Person>(Person.class)
		);
	}
	
	public int deleteById(int id) {
		return jdbcTemplate.update(
				"delete from person where id = ?", new Object[] {id});
	}
 	
}
