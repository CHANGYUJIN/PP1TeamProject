package com.my.myboard;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

//RC,roomnum,gender,stdnum,name,temp

public class BoardVO {
	private int seq;
	private String RC; //Rodem, Bethel ... 
	private String roomnum; //415 ...
	private String name; //연혜은 .... 
	private String temp; //체온 36 ...
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
	public String getRoomnum() {
		return roomnum;
	}
	public void setRoomnum(String roomnum) {
		this.roomnum = roomnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
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
