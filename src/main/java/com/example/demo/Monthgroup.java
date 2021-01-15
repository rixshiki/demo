package com.example.demo;

public class Monthgroup {

	private int monthnum;
	private String monthname;

	
	public Monthgroup() {
	}
	public Monthgroup(int monthnum, String monthname) {
		this.monthnum = monthnum;
		this.monthname = monthname;
	}
	public int getMonthnum() {
		return monthnum;
	}
	public void setMonthnum(int monthnum) {
		this.monthnum = monthnum;
	}
	public String getMonthname() {
		return monthname;
	}
	public void setMonthname(String monthname) {
		this.monthname = monthname;
	}
	
}
