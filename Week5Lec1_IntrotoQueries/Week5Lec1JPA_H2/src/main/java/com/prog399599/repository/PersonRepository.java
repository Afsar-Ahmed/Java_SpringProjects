package com.prog399599.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.prog399599.beans.Person;

public interface PersonRepository extends JpaRepository<Person,Long>{
	
	//We need to make some custom queries
	//As long as you provide the proper syntax, SB will be able to figure
	//out what you are trying to do, and implement the method you want

	//Simple queries
	public Person findBirthdayByNameAndAge(String name, Integer age);
	public List<Person> findByAgeIsNull();
	public List<Person> findByBirthdayAfter(LocalDate birthday);
	public List<Person> findByNameContaining(String namePart);
	public List<Person> findByOrderByName();
	
	//Not so simple
	//What about queries that are not easily defined simply
	//by putting together some keywords
	//Sometimes you have to provide some SQL to guide SB/JPA
	
	@Query("SELECT p FROM Person p WHERE LOWER(p.name) = Lower(:name)")
	public Person retrieveIgnoringCase(@Param("name")String name);

}
