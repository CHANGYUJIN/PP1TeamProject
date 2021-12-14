package com.my.myboard;

import java.util.Date;

//RC,roomnum,gender,stdnum,name,temp

public class BoardVO {
	private int seq;
	private String RC; //Rodem, Bethel ... 
	private int roomnum; //415 ... 
	private String gender; //w,m
	private int stdnum; //21900442 .... 
	private String name; //연혜은 .... 
	private int temp; //체온 36 ... 
	private Date regdate;
	private int cnt; //? 
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getRC() {
		return RC;
	}
	public void setRC(String rc) {
		RC = rc;
	}
	public int getRoomnum() {
		return roomnum;
	}
	public void setRoomnum(int roomnum) {
		this.roomnum = roomnum;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getStdnum() {
		return stdnum;
	}
	public void setStdnum(int stdnum) {
		this.stdnum = stdnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
}
