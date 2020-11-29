package com.works.usethyme.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CategoryController {
	
	@GetMapping("/catDetail/{cid}")
	public String category( Model model, @PathVariable int cid ) {
		System.out.println("cid : " + cid);
		model.addAttribute("cats", new IndexController().cats());
		model.addAttribute("cid", cid);
		return "category";
	}

}
