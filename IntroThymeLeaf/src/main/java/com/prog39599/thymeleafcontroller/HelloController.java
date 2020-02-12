package com.prog39599.thymeleafcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hello2";
	}
	
	@RequestMapping("/sendData")
	public ModelAndView sendData() {
		ModelAndView mnv = new ModelAndView("data");
		mnv.addObject("message","Hello Hello");
		
		return mnv;
	}
}
