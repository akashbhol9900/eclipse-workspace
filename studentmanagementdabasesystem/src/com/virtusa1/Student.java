package com.virtusa1;

public class Student {
private String eno;
private String ename;
private String location;
private String sal;
public Student() {
	// TODO Auto-generated constructor stub
}
public Student(String eno, String ename, String location, String sal) {
	super();
	this.eno = eno;
	this.ename = ename;
	this.location = location;
	this.sal = sal;
}
public String getEno() {
	return eno;
}
public void setEno(String eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getSal() {
	return sal;
}
public void setSal(String sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Student [eno=" + eno + ", ename=" + ename + ", location=" + location + ", sal=" + sal + "]";
}

}
