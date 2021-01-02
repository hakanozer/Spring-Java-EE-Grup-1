package com.works.fivedays.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.works.fivedays.models.User;
import com.works.fivedays.repositories.UserJpaRespository;
import com.works.fivedays.repositories.UserRepository;

@Controller
public class HomeController {
	
	@Autowired UserJpaRespository ujRepo;
		
	final UserRepository uRepo;
	public HomeController( UserRepository uRepo ) {
		this.uRepo = uRepo;
	}
	
	@GetMapping("")
	public String home() {
		return "home";
	}
	
	
	@PostMapping("/userInsert")
	@ResponseBody
	public Map<String, Object> userInsert( @RequestBody User user ) {
		Map<String, Object> hm = new HashMap<>();
		int status = uRepo.userInsert(user);
		if (status > 0) {
			hm.put("status", true);
		}else {
			hm.put("status", false);
		}
		return hm;
	}
	
	
	@PostMapping("/userAll")
	@ResponseBody
	public Map<String, Object> userAll() {
		Map<String, Object> hm = new HashMap<>();
		hm.put("users", uRepo.allUser());
		return hm;
	}
	
	@PostMapping("/userDelete")
	@ResponseBody
	public Map<String, Object> userAll( @RequestBody User user ) {
		Map<String, Object> hm = new HashMap<>();
		try {
			ujRepo.deleteById(user.getUid());
			hm.put("status", true);
		} catch (Exception e) {
			System.err.println("userDelete Error : " + e);
			hm.put("status", false);
		}
		return hm;
	}
	

}
