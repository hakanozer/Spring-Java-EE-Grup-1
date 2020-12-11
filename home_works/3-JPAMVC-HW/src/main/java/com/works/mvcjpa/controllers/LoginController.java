package com.works.mvcjpa.controllers;

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
	public String login()
	{
		return "login";
	}
	
	@PostMapping("/userLogin")
	public String userLogin(User user)
	{
		User u = repo.userLogin(user.getMail(), user.getPass());
		if(u != null)
		{
			return "redirect:/dashboard";
		}
		
		return "login";
	}
	
}
