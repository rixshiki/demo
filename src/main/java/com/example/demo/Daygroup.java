package com.example.demo;

public class Daygroup {

	private int datenum;
	private int monthnum;
	private String mixname;
	
	public Daygroup() {
	}
	public Daygroup(int datenum, int monthnum, String mixname) {
		this.datenum = datenum;
		this.monthnum = monthnum;
		this.mixname = mixname;
	}
	public int getDatenum() {
		return datenum;
	}
	public void setDatenum(int datenum) {
		this.datenum = datenum;
	}
	public int getMonthnum() {
		return monthnum;
	}
	public void setMonthnum(int monthnum) {
		this.monthnum = monthnum;
	}
	public String getMixname() {
		return mixname;
	}
	public void setMixname(String mixname) {
		this.mixname = mixname;
	}
}
