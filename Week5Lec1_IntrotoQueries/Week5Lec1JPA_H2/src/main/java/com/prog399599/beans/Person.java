package com.prog399599.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity //we need this to map objects of type Person to our database
        //table called Person
        //each instance of Person is a row in the database
        //the columns are id, and name
public class Person {
	
	@Id//pk
	@GeneratedValue(strategy=GenerationType.IDENTITY)//this strategy is for auto incrementing
	private Long id;
	private String name;
	private Integer age;
	private LocalDate birthday;

}
