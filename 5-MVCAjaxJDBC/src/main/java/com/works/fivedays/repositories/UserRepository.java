package com.works.fivedays.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.works.fivedays.models.User;

@Repository
public class UserRepository {

	@Autowired DriverManagerDataSource db;
	
	public int userInsert( User user ) {
		int status = -1;
		try {
			String query = "insert into user ( name, mail, pass, logo ) values ( ?, ?, ?, ? )";
			PreparedStatement pre = db.getConnection().prepareStatement(query);
			pre.setString(1, user.getName());
			pre.setString(2, user.getMail());
			pre.setString(3, user.getPass());
			pre.setString(4, user.getLogo());
			status = pre.executeUpdate();
		} catch (Exception e) {
			System.err.println("userInsert Error : " + e);
		}
		return status;
	}
	
	
	// all User List
	public List<User> allUser() {
		List<User> ls = new ArrayList<>();
		try {
			String sql = "select * from user";
			PreparedStatement pre = db.getConnection().prepareStatement(sql);
			ResultSet rs = pre.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setLogo(rs.getString("logo"));
				user.setMail(rs.getString("mail"));
				user.setName(rs.getString("name"));
				user.setPass(rs.getString("pass"));
				user.setUid(rs.getInt("uid"));
				ls.add(user);
			}
		} catch (Exception e) {
			System.err.println("allUser Error : " + e);
		}
		return ls;
	}
	
	
	
	
	
}
