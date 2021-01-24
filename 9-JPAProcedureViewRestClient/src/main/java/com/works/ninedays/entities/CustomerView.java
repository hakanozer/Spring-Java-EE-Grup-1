package com.works.ninedays.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "customer_view") // mysql in view name equals -> customer_view
@Entity
@Data
public class CustomerView {
	
	@Id
	private int customer_id;
	private String first_name;
	private String last_name;
	private String address;
	private String city;
	private String country;
	private int manager_staff_id;
	

}
