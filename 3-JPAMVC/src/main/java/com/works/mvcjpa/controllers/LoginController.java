package com.works.mvcjpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.works.mvcjpa.models.User;
import com.works.mvcjpa.repositories.UserRepository;

@Controller
public class LoginController {
	
	@Autowired UserRepository repo;

	
	@GetMapping("")
	public String login() {
		return "login";
	}
	
	@PostMapping("/userLogin")
	public String userLogin( User user ) {
	
		/*
		List<User> uls = repo.findAll();
		for (User item : uls) {
			if ( item.getMail().equalsIgnoreCase(user.getMail()) && item.getPass().equalsIgnoreCase(user.getPass()) ) {
				return "redirect:/dashboard";
			}else {
				System.out.println("Login Fail");
			}
		}
		*/
		
		User us = repo.userLogin(user.getMail(), user.getPass());
		if ( us != null ) {
			return "redirect:/dashboard";
		}
		
		return "login";
	}
	
	
}
