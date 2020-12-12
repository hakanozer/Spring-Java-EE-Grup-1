package com.works.fourdays.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;

import com.works.fourdays.models.Admin;
import com.works.fourdays.repositories.AdminRepository;

@Configuration
public class UserControl {
	
	final AdminRepository aRepo;
	final HttpServletRequest req;
	final HttpServletResponse res;
	
	
	public UserControl( 
			AdminRepository aRepo,
			HttpServletRequest req,
			HttpServletResponse res
			) 
	{
		this.aRepo = aRepo;
		this.req = req;
		this.res = res;
	}
	
	
	
	public Admin control( Admin admin ) {
		String pass = new Util().password(admin.getPass(), 3);
		Admin adm = aRepo.findByMailAndPass(admin.getMail(), pass);
		if ( adm != null ) {
			req.getSession().setAttribute("admin", adm);
		}
		return adm;
	}
	
	
	
}
