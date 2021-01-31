package com.works.userss.rssserver;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.feed.AbstractRssFeedView;

import com.rometools.rome.feed.rss.Content;
import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.rss.Image;
import com.rometools.rome.feed.rss.Item;

@Component
public class RssFeedView extends AbstractRssFeedView {

	
	@Override
	protected void buildFeedMetadata(Map<String, Object> model, Channel feed, HttpServletRequest request) {
		
		feed.setTitle("Java EE - Spring");
		feed.setDescription("RSS Read and Write");
		feed.setCopyright("Spring - Java EE 1.0");
		feed.setLink("https://www.google.com.tr/");
		feed.setLanguage("tr");
		
		Image image = new Image();
		image.setUrl("https://spring.io/images/OG-Spring.png");
		image.setTitle("Logo");
		feed.setImage(image);
		
	}
	
	
	// data include
	@Override
	protected List<Item> buildFeedItems(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		List<Item> ls = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Item item = new Item();
			
			Content cid = new Content();
			cid.setType(SELECTED_CONTENT_TYPE);
			cid.setValue(""+i);
			item.setContent(cid);
			
			item.setTitle("Title " + i);
			item.setAuthor("Ali "+i);
			item.setLink("https://www.google.com.tr/"+i);
			item.setPubDate(Date.from(Instant.parse("2021-01-25T00:00:00Z")));
			ls.add(item);
			
		}
		
		
		return ls;
	}

}
