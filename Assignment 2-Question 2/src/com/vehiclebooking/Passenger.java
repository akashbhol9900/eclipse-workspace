package com.vehiclebooking;

public class Passenger {
	 private String pname;
	 private String mno;
	 private String email;
	 public String vachicletype;
	 public Passenger()
	 {
		 
	 }
	 public Passenger(String pname, String mno, String email, String vachicletype) {
		super();
		this.pname = pname;
		this.mno = mno;
		this.email = email;
		this.vachicletype = vachicletype;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		this.mno = mno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getVachicletype() {
		return vachicletype;
	}
	public void setVachicletype(String vachicletype) {
		this.vachicletype = vachicletype;
	}


	 
	}



