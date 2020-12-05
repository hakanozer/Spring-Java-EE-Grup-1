package com.works.usethyme.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.works.usethyme.props.User;


@Controller
public class UserController {
		
	User us = new User("ali@ali.com", "1234");
	String pass;
	String mail;
	
	public UserController() {
		
	}

	@GetMapping("/")
	public String user(Model model) {

		model.addAttribute("pass", pass);
		model.addAttribute("mail", mail);
		return "user";
	}

	@PostMapping("/userLogin")
	public String userLogin(User user) {	
		
		pass = user.getPass();
		mail = user.getMail();
		System.out.println(" Password : " +pass+ " Mail : " + mail);
				
		if(user.getPass().equals(us.getPass()) && user.getMail().equals(us.getMail()))
		{
			return "redirect:/index";
		}
		else
		{				
			return "redirect:/";
		}		
							
	}	
	

}
