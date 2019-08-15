package com.ivson.point;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ivson.point.repository.PersonRepository;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	@Autowired
	PersonRepository personRepository;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		log.info("All users -> {}", personRepository.findById(1003));
		
		
//		log.info("User -> {}", dao.findById(10001));
//		
//		log.info("User -> {}", dao.deleteById(10002));
//		
//		log.info("Inserting ", dao.insert(new Person(1004, "Tara", "Berlim", new Date())));
//		
//		log.info("Update ", dao.insert(new Person(1003, "Tara 2", "Berlim", new Date())));

	}

}
