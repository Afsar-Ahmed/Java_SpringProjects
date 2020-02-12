package com.prog39599.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LomBokIntroApplication {
	
	public static void main(String[] args) {
		//SpringApplication.run(LomBokIntroApplication.class, args);
		Person c = new Person();
		c.setFname("Darvin");
		c.setLname("Singh");
		c.setAddress("Sheridan");
		System.out.println(c.toString());
		
		Person2 p = new Person2();
		p.setAddress("Sheridan");
		p.setFname("Singh");
		p.setLname("Darvin");
		System.out.println(p.toString());

	}

}
