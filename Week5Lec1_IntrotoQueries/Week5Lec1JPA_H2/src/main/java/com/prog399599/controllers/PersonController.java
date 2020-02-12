package com.prog399599.controllers;

import java.time.LocalDate;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.prog399599.beans.Person;
import com.prog399599.repository.PersonRepository;


import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class PersonController {
	private PersonRepository personRepository;

	@GetMapping("/") // dont forget this!
	public String index(Model model) {
  Person temp = personRepository.retrieveIgnoringCase("AnN");
  System.out.println(temp);
		model.addAttribute("person", new Person());
		return "index";

	}

	@PostMapping("/insertPerson")
	public String insertPerson(Model model, @ModelAttribute Person person) {
		personRepository.save(person);
		// generates an INSERT INTO onto our database thorugh an SQL Query
		// save () = Create in CRUD

		// personRepository.deleteById(Long.valueOf(2));
		// Homework : take a look at the other delete methods
		// HW-> Extend the program so the user can provide the ID #
		// of someone they want to delete
		List<Person> personList = personRepository.findAll();
		model.addAttribute("personList", personList);

		model.addAttribute("person", new Person());

		return "index";

	}

	@GetMapping("/findBirthdayByNameAndAge/{name}/{age}")
	public String findBirthDayByNameAndAge(Model model, @PathVariable String name, @PathVariable Integer age) {
		LocalDate birthday = personRepository.findBirthdayByNameAndAge(name, age).getBirthday();
		model.addAttribute("date", birthday);
		return "displayDate";
	}

	@GetMapping("/findByAgeIsNull")
	public String findByAge(Model model) {
		List<Person> personList = personRepository.findByAgeIsNull();
		model.addAttribute("personList", personList);
		return "displayGroup";
	}

	@GetMapping("/findByBirthdayAfter/{year}/{month}/{day}")
	public String findByBirthdayAfter(Model model, @PathVariable int year, @PathVariable int month,
			@PathVariable int day) {
		LocalDate birthday = LocalDate.of(year, month, day);
		List<Person> personList = personRepository.findByBirthdayAfter(birthday);
		model.addAttribute("personList", personList);
		return "displayGroup";
	}

	@GetMapping("/findByNameContaining/{namePart}")
	public String findByNameContaining(Model model, @PathVariable String namePart) {
		List<Person> personList = personRepository.findByNameContaining(namePart);
		model.addAttribute("personList", personList);
		return "displayGroup";

	}
	@GetMapping("findByOrderByName")
	public String findOrderByNameAsc(Model model) {
		
		model.addAttribute("personList",personRepository.findByOrderByName());
		return "displayGroup";
		
	}

}
