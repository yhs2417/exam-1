package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {
	
	@GetMapping("/")
	public String hello(Model model)
	{
		model.addAttribute("data","aaaaa");
		return "index";
	}
}

