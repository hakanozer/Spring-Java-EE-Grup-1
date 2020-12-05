package com.works.mvcjpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.works.mvcjpa.models.Note;
import com.works.mvcjpa.repositories.NoteRepository;

@Controller
public class DashboardController {
	
	@Autowired NoteRepository repo;
	
	@GetMapping("/dashboard")
	public String dashboard( Model model ) {
		model.addAttribute("ls", repo.findAll());
		return "dashboard";
	}
	
	
	@PostMapping("/noteAdd")
	public String noteAdd( Note note ) {
		repo.saveAndFlush(note);
		return "redirect:/dashboard";
	}
	
	
	@GetMapping("/deleteNote/{nid}")
	public String noteDelete( @PathVariable int nid ) {
		repo.deleteById(nid);
		return "redirect:/dashboard"; 
	}
	
	
}
