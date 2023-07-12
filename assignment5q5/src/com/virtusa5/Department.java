package com.virtusa5;

public class Department {
 private String departmentname;
 private String departmentid;
 private String loc;
 private Employee e;
 public Department()
 {
	 
 }
public Department(String departmentname, String departmentid, String loc, Employee e) {
	super();
	this.departmentname = departmentname;
	this.departmentid = departmentid;
	this.loc = loc;
	this.e = e;
}
public String getDepartmentname() {
	return departmentname;
}
public void setDepartmentname(String departmentname) {
	this.departmentname = departmentname;
}
public String getDepartmentid() {
	return departmentid;
}
public void setDepartmentid(String departmentid) {
	this.departmentid = departmentid;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
public Employee getE() {
	return e;
}
public void setE(Employee e) {
	this.e = e;
}

}
