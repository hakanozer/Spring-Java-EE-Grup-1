package com.works.mvcjpa.controllers;


import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.works.mvcjpa.models.Product;
import com.works.mvcjpa.repositories.ProductRepository;


@Controller
public class DashboardController {
	
    Date date = new Date();  
	
	@Autowired ProductRepository repo;

	int pid = 0;

	@GetMapping("/dashboard")
	public String dashboard(Model model)
	{		
		pid = 0;
		model.addAttribute("ls", repo.findAll());
				
		return "dashboard";
	}
	
	@PostMapping("/addProduct")
	public String noteAdd(Product product)
	{
		if(pid != 0)
		{
			product.setPid(pid);
		}
		
		product.setDate(date);
		
		repo.saveAndFlush(product);
		pid = 0;		
		return "redirect:/dashboard";
	}
	
	@GetMapping("/deleteProduct/{spid}")
	public String noteDelete(@PathVariable String spid)
	{
		int pid = 0;
		try {
			pid  = Integer.parseInt(spid);
			repo.deleteById(pid);
		} catch (NumberFormatException e) {
			return "redirect:/";
		}catch (EmptyResultDataAccessException e) {
			return "redirect:/dashboard";
		}
		
		return "redirect:/dashboard";
	}
	
	
	String page = "";
	@GetMapping("/updateProduct/{spid}")
	public String updateNote(@PathVariable String spid, Model model)
	{
		
		try {
			pid  = Integer.parseInt(spid);
			Optional<Product> oproduct = repo.findById(pid);
			oproduct.ifPresent(item -> { // not null
				model.addAttribute("update", item);
				model.addAttribute("ls", repo.findAll());
				page = "dashboard";
			});
			
			if(!oproduct.isPresent()) //null
			{
				page = "redirect:/dashboard";
				return page;
			}
		} catch (NumberFormatException e) {			
			page = "redirect:/";
		}
		
		return page;
	}
	
	@PostMapping("/searchData")
	public String searchData(@RequestParam String searchTxt, Model model)
	{
		if(searchTxt.equals(""))
		{
			return "redirect:/dashboard";
		}
		
		model.addAttribute("searchTxt", searchTxt);
		model.addAttribute("ls", repo.searchData("%"+searchTxt+"%"));
		return "dashboard";
	}
	
	
	
	
	
}
