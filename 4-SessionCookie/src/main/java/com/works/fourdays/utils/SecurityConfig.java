package com.works.fourdays.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = ( HttpServletResponse ) response;
		
		String url = req.getRequestURI();
		boolean status = pagePermission(url);
		if (!status) {
			boolean session_status = req.getSession().getAttribute("admin") == null;
			if (session_status) {
				try {
					//res.sendError(404);
					res.sendRedirect("/");
				} catch (Exception e) {}
			}
		}
		
		chain.doFilter(req, res);
	}

	
	public boolean pagePermission( String url ) {
		boolean status = false;
		String[] arr = { "/", "/adminLogin", "/css/bootstrap.min.css", "/js/jquery-3.5.1.min.js", "/js/bootstrap.min.js" };
		for (String item : arr) {
			if (item.equals(url)) {
				status = true;
				break;
			}
		}
		return status;
	}
	
	
	
}
