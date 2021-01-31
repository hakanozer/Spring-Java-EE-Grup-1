package com.works.userss.rssserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.View;

@RestController
public class NewsServiceRestController {

	@Autowired RssFeedView rssFeedView;
	
	@GetMapping("/rss")
	public View getFeed() {
		return rssFeedView;
	}
	
}
