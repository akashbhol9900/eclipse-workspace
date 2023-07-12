package com.virtusa1;

public class Resource implements Comparable {
	private String rid;
	private String name;
	private String hireDate;
	private String dept;
	private String comp;
	
	public Resource(String rid, String name, String hireDate, String dept, String comp) {
		super();
		this.rid = rid;
		this.name = name;
		this.hireDate = hireDate;
		this.dept = dept;
		this.comp = comp;
	}
	
	public String toString() {
		return "Resource id=" + rid + "   Resource name=" + name + "   Hire Date=" + hireDate + "   Department=" + dept+ "  Compenstation: "+comp;
	}

	@Override
	public int compareTo(Object o) {
		Resource r = (Resource)o;
		return this.name.compareTo(r.name);
	}
}
