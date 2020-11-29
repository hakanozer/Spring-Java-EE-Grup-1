package com.works.usethyme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.works.usethyme.props.Customer;
import com.works.usethyme.props.Product;

@Controller
public class UserController {
	
	@Autowired List<Product> source;

	@GetMapping("/user")
	public String user( Model model ) {
		model.addAttribute("source", source);
		return "user";
	}
	
	
	@PostMapping("/userLogin")
	public String userLogin( Customer customer ) {
		System.out.println("Mail : " + customer.getMail());
		return "redirect:/user";
	}
	
}
