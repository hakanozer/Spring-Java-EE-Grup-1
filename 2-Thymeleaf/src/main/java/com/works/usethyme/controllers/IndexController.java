package com.works.usethyme.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.works.usethyme.props.Category;

@Controller
public class IndexController {

    @GetMapping("/")
    public String homePage( Model model ) {
    	model.addAttribute("cats", cats());
        return "index";
    }

    @GetMapping("/contact")
    public String contactPage( Model model ) {
    	model.addAttribute("cats", cats());
        return "contact";
    }

    @GetMapping("/about")
    public String aboutPage( Model model ) {
    	//model.addAttribute("cats", cats());
        return "about";
    }
    
    
    public List<Category> cats() {
    	List<Category> ls = new ArrayList<>();
    	
    	Category c1 = new Category(10, "Televizyon");
    	Category c2 = new Category(11, "Telefon");
    	Category c3 = new Category(12, "Buzdolabı");
    	Category c4 = new Category(13, "Tablet");
    	
    	ls.add(c1);
    	ls.add(c2);
    	ls.add(c3);
    	ls.add(c4);
    	
    	return ls;
    }
    
    
}