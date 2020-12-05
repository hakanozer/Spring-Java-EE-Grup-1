package com.works.usethyme.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.works.usethyme.props.Product;
import com.works.usethyme.props.User;


@Controller
public class IndexController {
	
	@Autowired List<Product> source;

    @GetMapping("/index")
    public String homePage(Model model) 
    {
    	model.addAttribute("source", source);
        return "index";
    }
    
    @GetMapping("/contact")
    public String contactPage(Model model) 
    {
    	
        return "contact";
    }

    @GetMapping("/about")
    public String aboutPage(Model model) 
    {
    	//model.addAttribute("cats", cats());
        return "about";
    }
      

    @PostMapping("/productAdd")
	public String productAdd(Product pr)
	{
		source.add(pr);
		return "redirect:/index";
	}
        
     
}