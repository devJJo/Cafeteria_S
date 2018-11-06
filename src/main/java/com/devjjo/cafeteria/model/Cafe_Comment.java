package com.devjjo.cafeteria.model;

public class Cafe_Comment {
	
	private String cafe_Id;
	private String user_Id;
	private String seq;
	private String comment;
	private String comment_score;
	private String ins_user_dtm;
	private String upd_user_dtm;
	
	public String getCafe_Id() {
		return cafe_Id;
	}
	public void setCafe_Id(String cafe_Id) {
		this.cafe_Id = cafe_Id;
	}
	public String getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getComment_score() {
		return comment_score;
	}
	public void setComment_score(String comment_score) {
		this.comment_score = comment_score;
	}
	public String getIns_user_dtm() {
		return ins_user_dtm;
	}
	public void setIns_user_dtm(String ins_user_dtm) {
		this.ins_user_dtm = ins_user_dtm;
	}
	public String getUpd_user_dtm() {
		return upd_user_dtm;
	}
	public void setUpd_user_dtm(String upd_user_dtm) {
		this.upd_user_dtm = upd_user_dtm;
	}
	@Override
	public String toString() {
		return "Cafe_Comment [cafe_Id=" + cafe_Id + ", user_Id=" + user_Id + ", seq=" + seq + ", comment=" + comment
				+ ", comment_score=" + comment_score + ", ins_user_dtm=" + ins_user_dtm + ", upd_user_dtm="
				+ upd_user_dtm + "]";
	}
	
	
}
