package com.works.mvcjpa.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prid;
	private String prTitle;
	private String prDetail;
	private String prPrice;
	private String prImgUrl;
	LocalDate localDate = LocalDate.now();
	private String prDate=localDate+"";
	public int getPrid() {
		return prid;
	}

	public void setPrid(int prid) {
		this.prid = prid;
	}

	public String getPrTitle() {
		return prTitle;
	}

	public void setPrTitle(String prTitle) {
		this.prTitle = prTitle;
	}

	public String getPrDetail() {
		return prDetail;
	}

	public void setPrDetail(String prDetail) {
		this.prDetail = prDetail;
	}

	public String getPrPrice() {
		return prPrice;
	}

	public void setPrPrice(String prPrice) {
		this.prPrice = prPrice;
	}

	public String getPrImgUrl() {
		return prImgUrl;
	}

	public void setPrImgUrl(String prImgUrl) {
		this.prImgUrl = prImgUrl;
	}

	public String getPrDate() {
		return prDate;
	}

	public void setPrDate(String prDate) {
		this.prDate = prDate;
	}

}
