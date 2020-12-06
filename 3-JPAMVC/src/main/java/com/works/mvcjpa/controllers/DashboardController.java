package com.works.mvcjpa.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.works.mvcjpa.models.Note;
import com.works.mvcjpa.repositories.NoteRepository;

@Controller
public class DashboardController {
	
	@Autowired NoteRepository repo;
	int nid = 0;
	
	@GetMapping("/dashboard")
	public String dashboard( Model model ) {		
		nid = 0;
		model.addAttribute("ls", repo.findAll());
		return "dashboard";
	}
	
	
	@PostMapping("/noteAdd")
	public String noteAdd( Note note ) {
		if ( nid != 0 ) {
			note.setNid(nid);
		}
		repo.saveAndFlush(note);
		nid = 0;
		return "redirect:/dashboard";
	}
	
	
	@GetMapping("/deleteNote/{snid}")
	public String noteDelete( @PathVariable String snid ) {
		int nid = 0;
		try {
			nid = Integer.parseInt(snid);
			repo.deleteById(nid);
		} catch (NumberFormatException e) {
			return "redirect:/"; 
		} catch (EmptyResultDataAccessException e) {
			return "redirect:/dashboard"; 
		}
		
		return "redirect:/dashboard"; 
	}
	
	
	String page = "";
	@GetMapping("/updateNote/{snid}")
	public String updateNote( @PathVariable String snid, Model model ) {
		
		try {
			nid = Integer.parseInt(snid);
			Optional<Note> onote = repo.findById(nid);
			onote.ifPresent(item -> { // not null 
				model.addAttribute("update", item);
				model.addAttribute("ls", repo.findAll());
				page = "dashboard";
			});
			
			if ( !onote.isPresent() ) { // null
				page = "redirect:/dashboard";
				return page;
			}
			
			
		} catch (NumberFormatException e) {
			page = "redirect:/";
		} 
		
		return page;
	}
	
	
	@PostMapping("/searchData")
	public String searchData( @RequestParam String searchTxt, Model model ) {
		if (searchTxt.equals("")) {
			return "redirect:/dashboard";
		}
		model.addAttribute("searchTxt", searchTxt);
		model.addAttribute("ls", repo.searchData("%"+searchTxt+"%"));
		return "dashboard";
	}
	
	
}
