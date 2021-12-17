package com.my.myboard;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

//RC,roomnum,gender,stdnum,name,temp

public class BoardVO {
	private int seq;
	private String RC; //Rodem, Bethel ... 
	private int roomnum; //415 ... 
	private String gender; //w,m
	private int stdnum; //21900442 .... 
	private String name; //연혜은 .... 
	private int temp; //체온 36 ...
	private String filename;
	private String userID;
	private MultipartFile uploadPhoto;
	private Date regdate;
	
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
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public MultipartFile getUploadPhoto() {
		return uploadPhoto;
	}
	public void setUploadPhoto(MultipartFile uploadPhoto) {
		this.uploadPhoto = uploadPhoto;
	}
	
	
}
