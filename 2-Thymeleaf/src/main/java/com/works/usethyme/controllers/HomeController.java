package com.works.usethyme.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.works.usethyme.props.User;

@Controller
public class HomeController {

	List<User> ls = new ArrayList<>();
	public HomeController() {
		userList();
	}
	
	@GetMapping("/home")
	public String home( Model model ) {
		model.addAttribute("title", "Hello Spring");
		model.addAttribute("number", 20);
		model.addAttribute("cities", cities());
		model.addAttribute("users", ls);
		return "home";
	}
	

	public List<String> cities() {
		List<String> cts = new ArrayList<>();
		cts.add("Ankara");
		cts.add("İzmir");
		cts.add("Antalya");
		cts.add("Konya");
		cts.add("Samsun");
		cts.add("Gaziantep");
		return cts;
	}
	
	public List<User> userList() {
		
		for (int i = 0; i < 3; i++) {
			
			User us = new User();
			us.setUid(i);
			us.setName("Ali-"+i);
			us.setSurname("Bilmem-"+i);
			us.setMail("ali@ali.com");
			us.setDate("28.11.2020");
			ls.add(us);
			
		}
		return ls;
	}
	
	
	@PostMapping("/userAdd")
	public String userAdd( User us ) {
		System.out.println("Age : " + us.getAge());
		ls.add(us);
		return "redirect:/home";
	}
	

}
