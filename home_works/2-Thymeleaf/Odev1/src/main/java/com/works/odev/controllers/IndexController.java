package com.works.odev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.works.odev.props.User;

@Controller
public class IndexController {
	
	User us = new User("ali@ali.com", "1234");

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/userLogin")
	public String userLogin(User user){
		if(user.getMail().equals(us.getMail()) && user.getPassword().equals(us.getPassword()))
		{
			return "redirect:/dashboard";
		}
		else
		{			
			return "redirect:/";
		}		
	}
}
