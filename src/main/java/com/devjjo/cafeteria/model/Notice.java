package com.devjjo.cafeteria.model;

public class Notice {
	
	private String seq;
	private String notice_Title;
	private String notice_Contents;
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getNotice_Title() {
		return notice_Title;
	}
	public void setNotice_Title(String notice_Title) {
		this.notice_Title = notice_Title;
	}
	public String getNotice_Contents() {
		return notice_Contents;
	}
	public void setNotice_Contents(String notice_Contents) {
		this.notice_Contents = notice_Contents;
	}
	@Override
	public String toString() {
		return "Notice [seq=" + seq + ", notice_Title=" + notice_Title + ", notice_Contents=" + notice_Contents + "]";
	}
	
	
	
	
}
