package com.example.First_Spring_Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpring implements CommandLineRunner {

//	@Autowired 
//	Score sc2;
	
	@Autowired
	ScoreRepository srep;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpring.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
        Score sc1 = new Score();
		//		scl.disp = srep.findById(10)
		sc1.disp = srep.toString();
		System.out.println("Testing Spring Boot");
	
//	sc2.disp = "Testing Init";
	System.out.println("First Inialization" + sc1);
	sc1.disp = "Second Initialization";
	System.out.println("Second Inialization" + sc1);
		}
	
	}
