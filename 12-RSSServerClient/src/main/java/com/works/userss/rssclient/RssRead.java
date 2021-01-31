package com.works.userss.rssclient;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import com.works.userss.entities.Ntv;

@Repository
public class RssRead {

	public List<Ntv> ntvNewsHot() {
		List<Ntv> nlist = new ArrayList<>();
		
		try {
			
			String stUrl  = "https://www.ntv.com.tr/son-dakika.rss";
			URL url = new URL(stUrl);
			XmlReader reader = new XmlReader(url);
			SyndFeed feed = new SyndFeedInput().build(reader);
			List<SyndEntry> feeds = feed.getEntries();
			for (SyndEntry item : feeds) {
				//System.out.println("===================================");
				String title = item.getTitle();
				String id = item.getLinks().get(0).getHref();
				String published = item.getPublishedDate().toString();
				String updated = item.getUpdatedDate().toString();
				String author = item.getAuthors().get(0).getName();
				String content = item.getContents().get(0).getValue().replaceAll("\"","'");
				
				Ntv ntv = new Ntv(title, id, published, updated, author, content);
				nlist.add(ntv);
				//System.out.println(id + " " +published + " " +updated + " " +author + " " +content);
				//System.out.println("===================================");
			}
			
		} catch (Exception e) {
			System.err.println("Read Error : " + e);
		}
		
		return nlist;
		
	}
	
}
