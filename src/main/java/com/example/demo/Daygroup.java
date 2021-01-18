package com.example.demo;

import java.time.LocalDate;

public class Daygroup {

	private int datenum;
	private int monthnum;
	private String mixname;
	private LocalDate localdate; 
	
	public Daygroup() {
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
	public LocalDate getLocaldate() {
		return localdate;
	}
	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
	}
	
}
