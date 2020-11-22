package com.works.lifecircle.controllers;

import java.util.Collection;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home( Model model, Random rd ) {
		model.addAttribute("title", "Spring Model!");
		model.addAttribute("rd", rd.nextInt());
		return "home";
	}
	
	
	@PostMapping("/userRegister")
	public String userRegister( 
			@RequestParam String name, 
			@RequestParam String surname,
			@RequestParam String password
			) {
		System.out.println("Name : " + name);
		System.out.println("Surname : " + surname);
		System.out.println("Password : " + password);
		return "home";
	}
	

}








