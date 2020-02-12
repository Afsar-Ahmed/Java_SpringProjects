package com.prog39599.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prog39599.beans.Person;

public interface PersonRepository extends JpaRepository<Person,Long>{
	public List<Person> findByOrderByName();
	public List<Person> findByNameIsNot(String name);
	
	
	@Query("SELECT p from Person p where UPPER(p.name) = Upper(:name)")
	public List<Person> findYellCases();
}
