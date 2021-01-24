package com.works.ninedays.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.works.ninedays.entities.ActorProc;
import com.works.ninedays.models.Article;
import com.works.ninedays.models.NewsData;
import com.works.ninedays.repositories.ActorProcRepository;
import com.works.ninedays.repositories.CustomerViewRepository;

@Controller
public class CustomerController {
	
	@Autowired CustomerViewRepository cView;
	@Autowired ActorProcRepository aRepo;

	@GetMapping("")
	public String customer( Model model ) {
		model.addAttribute("customer", cView.findAll());
		/*
		List<ActorProc> ls = aRepo.getAllActorFilm("nic");
		for (ActorProc item : ls) {
			System.out.println(item.getTitle());
		}
		*/
		
		model.addAttribute("news", restResult());
		
		return "customer";
	}
	
	
	
	public List<Article> restResult() {
		
		String url = "http://newsapi.org/v2/top-headlines?country=tr&apiKey=38a9e086f10b445faabb4461c4aa71f8";
		RestTemplate restTemplate = new RestTemplate();
		NewsData dataObj = restTemplate.getForObject(url, NewsData.class);		
		List<Article> ls = dataObj.getArticles();
		return ls;
		
	}
	
	
	
	
}
