package com.works.odev.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.works.odev.props.Note;

@Controller
public class DashboardController {

	List<Note> notelist = new ArrayList<>();

	public DashboardController() {
		noteList();
	}

	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		model.addAttribute("source", notelist);
		return "dashboard";
	}

	@PostMapping("/noteAdd")
	public String productAdd(Note nt) {
		notelist.add(nt);
		return "redirect:/dashboard";
	}

	public List<Note> noteList() {
		Note note = new Note();
		note.setTitle("ilk notum");
		note.setDesc("ilk aciklama");
		notelist.add(note);
		return notelist;
	}
}
