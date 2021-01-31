package com.works.userss.xmlclient;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.works.userss.entities.Currency;

@Service
public class TCMB {
	
	
	public List<Currency> todayXml() {
		
		List<Currency> clist = new ArrayList<>();
		
		try {
			
			String url = "https://www.tcmb.gov.tr/kurlar/today.xml";
			String stData = Jsoup.connect(url).timeout(60000).ignoreContentType(true).get().toString();
			Document doc = Jsoup.parse(stData, "", Parser.xmlParser());
			Elements elements = doc.getElementsByTag("Currency");
			for (Element element : elements) {
				String currencyName = element.getElementsByTag("CurrencyName").text();
				String forexBuying = element.getElementsByTag("ForexBuying").text();
				String forexSelling = element.getElementsByTag("ForexSelling").text();
				String banknoteBuying = element.getElementsByTag("BanknoteBuying").text();
				String banknoteSelling = element.getElementsByTag("BanknoteSelling").text();
				
				Currency currency = new Currency(currencyName, forexBuying, forexSelling, banknoteBuying, banknoteSelling);
				clist.add(currency);
			}
			
			
		} catch (Exception e) {
			System.err.println("todayXml Error : " + e);
		}
		
		return clist;
	}

}
