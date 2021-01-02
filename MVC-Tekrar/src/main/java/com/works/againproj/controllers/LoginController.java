package com.works.againproj.controllers;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.works.againproj.models.User;
import com.works.againproj.repositories.UserJpaRespository;

@Controller
public class LoginController {
	
	final UserJpaRespository uRepo;
	final HttpServletRequest req;
	public LoginController( UserJpaRespository uRepo, HttpServletRequest req ) {
		this.uRepo = uRepo;
		this.req = req;
	}
	
	@GetMapping("/")
	public String login() {
		return "login";
	}
	
	@PostMapping("adminLogin")
	public String adminLogin( User user ) {
		Optional<User> oUser = uRepo.findByMailAndPass(user.getMail(), user.getPass());
		if ( oUser.isPresent() ) {
			System.out.println("User Login Success");
			req.getSession().setAttribute("user", oUser.get());
			return "redirect:/dashboard";
		}else {
			System.out.println("User Login Fail");
		}
		return "redirect:/";
	}
	

}
