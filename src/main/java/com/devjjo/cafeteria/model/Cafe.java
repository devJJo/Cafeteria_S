package com.devjjo.cafeteria.model;

public class Cafe {
	
	private String end_page;
	private String cafe_Id;
	private String cafe_Nm;
	private String cafe_img_Nm;
	private String cafe_img_Dir;
	private int price;
	private String lunch_YN;
	private String dinner_YN;
	private String oper_Time;
	private String build_Addr;
	private String build_Nm;
	private String build_Tel;
	private String build_Home;
	private String build_Key;
	private double build_X;
	private double build_Y;
	private double build_Score;
	private String use_YN;
	private double distance;
	
	private Menu menu_L;
	private Menu menu_D;

	
	public String getEnd_page() {
		return end_page;
	}
	public void setEnd_page(String end_page) {
		this.end_page = end_page;
	}
	public String getCafe_Id() {
		return cafe_Id;
	}
	public void setCafe_Id(String cafe_Id) {
		this.cafe_Id = cafe_Id;
	}
	public String getCafe_Nm() {
		return cafe_Nm;
	}
	public void setCafe_Nm(String cafe_Nm) {
		this.cafe_Nm = cafe_Nm;
	}
	public String getCafe_img_Nm() {
		return cafe_img_Nm;
	}
	public void setCafe_img_Nm(String cafe_img_Nm) {
		this.cafe_img_Nm = cafe_img_Nm;
	}
	public String getCafe_img_Dir() {
		return cafe_img_Dir;
	}
	public void setCafe_img_Dir(String cafe_img_Dir) {
		this.cafe_img_Dir = cafe_img_Dir;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLunch_YN() {
		return lunch_YN;
	}
	public void setLunch_YN(String lunch_YN) {
		this.lunch_YN = lunch_YN;
	}
	public String getDinner_YN() {
		return dinner_YN;
	}
	public void setDinner_YN(String dinner_YN) {
		this.dinner_YN = dinner_YN;
	}
	public String getOper_Time() {
		return oper_Time;
	}
	public void setOper_Time(String oper_Time) {
		this.oper_Time = oper_Time;
	}
	public String getBuild_Addr() {
		return build_Addr;
	}
	public void setBuild_Addr(String build_Addr) {
		this.build_Addr = build_Addr;
	}
	public String getBuild_Nm() {
		return build_Nm;
	}
	public void setBuild_Nm(String build_Nm) {
		this.build_Nm = build_Nm;
	}
	public String getBuild_Tel() {
		return build_Tel;
	}
	public void setBuild_Tel(String build_Tel) {
		this.build_Tel = build_Tel;
	}
	public String getBuild_Home() {
		return build_Home;
	}
	public void setBuild_Home(String build_Home) {
		this.build_Home = build_Home;
	}
	public String getBuild_Key() {
		return build_Key;
	}
	public void setBuild_Key(String build_Key) {
		this.build_Key = build_Key;
	}
	public double getBuild_X() {
		return build_X;
	}
	public void setBuild_X(double build_X) {
		this.build_X = build_X;
	}
	public double getBuild_Y() {
		return build_Y;
	}
	public void setBuild_Y(double build_Y) {
		this.build_Y = build_Y;
	}
	public double getBuild_Score() {
		return build_Score;
	}
	public void setBuild_Score(double build_Score) {
		this.build_Score = build_Score;
	}
	public String getUse_YN() {
		return use_YN;
	}
	public void setUse_YN(String use_YN) {
		this.use_YN = use_YN;
	}
	public Menu getMenu_L() {
		return menu_L;
	}
	public void setMenu_L(Menu menu_L) {
		this.menu_L = menu_L;
	}
	public Menu getMenu_D() {
		return menu_D;
	}
	public void setMenu_D(Menu menu_D) {
		this.menu_D = menu_D;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "Cafe [end_page=" + end_page + ", cafe_Id=" + cafe_Id + ", cafe_Nm=" + cafe_Nm + ", cafe_img_Nm="
				+ cafe_img_Nm + ", cafe_img_Dir=" + cafe_img_Dir + ", price=" + price + ", lunch_YN=" + lunch_YN
				+ ", dinner_YN=" + dinner_YN + ", oper_Time=" + oper_Time + ", build_Addr=" + build_Addr + ", build_Nm="
				+ build_Nm + ", build_Tel=" + build_Tel + ", build_Home=" + build_Home + ", build_Key=" + build_Key
				+ ", build_X=" + build_X + ", build_Y=" + build_Y + ", build_Score=" + build_Score + ", use_YN="
				+ use_YN + ", distance=" + distance + ", menu_L=" + menu_L + ", menu_D=" + menu_D + "]";
	}

	

}
