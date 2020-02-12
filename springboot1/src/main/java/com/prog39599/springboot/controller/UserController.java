package com.prog39599.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prog39599.springboot.web.User;

@Controller
public class UserController {
	
	@ResponseBody
	@GetMapping("/users")
	public List<User> home(){
		return Arrays.asList(new User(1, "Mako"), 
				new User(2,"String"),
				new User(3,"TRiss"));
	}
}
