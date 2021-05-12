package com.nsb.shop.logic;

import java.util.Date;

public class Board { 

	private String category;
	private String title;
	private String region;
	private String choose;
	private String object;
	private int views;
	private int price;
	private String content;
	private String picture;
	private String users;
	private Date updatetime;
	@Override
	public String toString() {
		return "Board [category=" + category + ", title=" + title + ", region=" + region + ", choose=" + choose
				+ ", object=" + object + ", views=" + views + ", price=" + price + ", content=" + content + ", picture="
				+ picture + ", users=" + users + ", updatetime=" + updatetime + "]";
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getChoose() {
		return choose;
	}
	public void setChoose(String choose) {
		this.choose = choose;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getUsers() {
		return users;
	}
	public void setUsers(String users) {
		this.users = users;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
}
