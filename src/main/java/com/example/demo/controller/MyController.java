package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value = "/getHome" , method = RequestMethod.GET)
	public String getHome()
	{
		return "Home";
	}

	@RequestMapping(value = "/register" , method = RequestMethod.GET)
	public String RegEmployee()
	{
		return "Register";
	}
}
