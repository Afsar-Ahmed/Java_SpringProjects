package com.prog39599.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("value")
	@ResponseBody//class is not redirected but accepts value on to the page
	public String hello() {
		return "hello";
	}
}
