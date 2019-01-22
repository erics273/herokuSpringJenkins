package com.techtalentsouth.herokuDemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	public MainController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/")
	public ModelAndView indexMethod() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

}
