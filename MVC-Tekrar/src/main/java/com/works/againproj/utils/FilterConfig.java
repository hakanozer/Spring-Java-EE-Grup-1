package com.works.againproj.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;

import com.works.againproj.models.User;

@Configuration
public class FilterConfig implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String url = req.getRequestURI();
		if ( url.equals("/") || url.contains("css") || url.contains("js") || url.contains("jpg") || url.contains("h2-console") ||  url.contains("map") ) 
		{
			
		}else {
			
			System.out.println(url);
			boolean status = req.getSession().getAttribute("user") == null;
			if ( status ) {
				res.setStatus(HttpServletResponse.SC_TEMPORARY_REDIRECT);
				res.setHeader("Location", "/");
			}else {
				
				User user = (User) req.getSession().getAttribute("user");
				req.setAttribute("user", user);
				
			}
			
		}
		
		chain.doFilter(req, res);
	}

	
	
	
}
