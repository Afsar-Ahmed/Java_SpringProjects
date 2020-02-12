package com.prog39599.controllers;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.prog39599.beans.Person;
import com.prog39599.repositories.PersonRepository;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class PersonController {

	private PersonRepository pr;
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("person", new Person());
		return "index";
	}
	
	@PostMapping("/insertPerson")
	public String insertPerson(Model model, @ModelAttribute Person person) {
		pr.save(person);
		
		List<Person> personList = pr.findAll();
		model.addAttribute("personList",personList);
		
		model.addAttribute("person", new Person());
		return "index";
	}
	
	@GetMapping("/findByOrderByNameD")
	public String findOrderByNameDsc(Model model) {
		
		model.addAttribute("personList",pr.findByOrderByName());
		return "displayGroup";
	}
	
	@GetMapping("/findByNotName/{name}")
	public String findNotName(Model model,@PathVariable String name) {
		
		model.addAttribute("personList",pr.findByNameIsNot(name));
		return "displayGroup";
	}
}
