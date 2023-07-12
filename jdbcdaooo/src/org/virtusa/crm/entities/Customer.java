package org.virtusa.crm.entities;

public class Customer {
	private int  cid;
	private String cname;
	private String loc;
	
	public Customer() {
		
	}

	public Customer(int cid, String cname, String loc) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.loc = loc;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	

}

}
