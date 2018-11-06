package com.devjjo.cafeteria.model;

public class User {

	//변수명은 디비의 컬럼명과 같아야한다. 대소문자 상관없음
	// ->상관있음 앞에2개는 소문자여야 bean주입이 된다 !!!!
	private String user_Id;
	private String user_Nm;
	private String user_Img;
	private String remark;
	public String getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public String getUser_Nm() {
		return user_Nm;
	}
	public void setUser_Nm(String user_Nm) {
		this.user_Nm = user_Nm;
	}
	public String getUser_Img() {
		return user_Img;
	}
	public void setUser_Img(String user_Img) {
		this.user_Img = user_Img;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "User [user_Id=" + user_Id + ", user_Nm=" + user_Nm + ", user_Img=" + user_Img + ", remark=" + remark
				+ "]";
	}

	
	
	
	
}
