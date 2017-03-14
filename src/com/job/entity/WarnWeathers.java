package com.job.entity;

import java.util.Date;

public class WarnWeathers {
	private int wno ;		//编号
   	private String wtype ;   //预警类型
   	private String warea ;	//预警区域
   	private int wdays ;		//影响天数
   	private Date wdate ;     //发布日期
   	private String winfo ;	//预警描述
   	
	public WarnWeathers() {
		super();
	}
	public WarnWeathers(int wno, String wtype, String warea, int wdays, Date wdate, String winfo) {
		super();
		this.wno = wno;
		this.wtype = wtype;
		this.warea = warea;
		this.wdays = wdays;
		this.wdate = wdate;
		this.winfo = winfo;
	}
	public int getWno() {
		return wno;
	}
	public void setWno(int wno) {
		this.wno = wno;
	}
	public String getWtype() {
		return wtype;
	}
	public void setWtype(String wtype) {
		this.wtype = wtype;
	}
	public String getWarea() {
		return warea;
	}
	public void setWarea(String warea) {
		this.warea = warea;
	}
	public int getWdays() {
		return wdays;
	}
	public void setWdays(int wdays) {
		this.wdays = wdays;
	}
	public Date getWdate() {
		return new Date();
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	public String getWinfo() {
		return winfo;
	}
	public void setWinfo(String winfo) {
		this.winfo = winfo;
	}
	   
	   
}
