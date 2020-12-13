package com.works.fourdays.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.works.fourdays.models.Admin;
import com.works.fourdays.utils.UserControl;

@Controller
public class LoginController {
		
	String error = "";
	final UserControl userControl;
	public LoginController( UserControl userControl ) {
		this.userControl = userControl;
	}
	
	
	@GetMapping({ "", "login" })
	public String login( Model model ) {
		if (!error.equals("")) {
			model.addAttribute("error", error);
		}
		error = "";
		return "login";
	}
	
	
	@PostMapping("/adminLogin")
	public String adminLogin( Admin admin ) {
		if ( userControl.control(admin) != null ) {
			return "redirect:/dashboard";
		}
		error = "Mail or Password Fail";
		return "redirect:/";
	}
	
	
	@GetMapping("/logout")
	public String logout() {
		userControl.userLogOut();
		return "redirect:/";
	}
	

}
