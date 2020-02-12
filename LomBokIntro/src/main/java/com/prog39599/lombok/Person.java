package com.prog39599.lombok;

public class Person {
	private String fname;
	private String lname;
	private String address;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Cursive [fname=" + fname + ", lname=" + lname + ", address=" + address + "]";
	}
	
}
