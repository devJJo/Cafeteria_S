package com.devjjo.cafeteria.model;

public class Favorite {
	private String user_Id;
	private String cafe_Id;
	private String add_Date;
	public String getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public String getCafe_Id() {
		return cafe_Id;
	}
	public void setCafe_Id(String cafe_Id) {
		this.cafe_Id = cafe_Id;
	}
	public String getAdd_Date() {
		return add_Date;
	}
	public void setAdd_Date(String add_Date) {
		this.add_Date = add_Date;
	}
	@Override
	public String toString() {
		return "Favorite [user_Id=" + user_Id + ", cafe_Id=" + cafe_Id + ", add_Date=" + add_Date + "]";
	}
	
	
	
}
