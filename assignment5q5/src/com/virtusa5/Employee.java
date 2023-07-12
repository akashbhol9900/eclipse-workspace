package com.virtusa5;

public class Employee {
private String employeeid;
private String employeename;
private int sal;
private Department d;
public Employee()
{
	
}
public Employee(String employeeid, String employeename, int sal, Department d) {
	super();
	this.employeeid = employeeid;
	this.employeename = employeename;
	this.sal = sal;
	this.d = d;
}
public String getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(String employeeid) {
	this.employeeid = employeeid;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public Department getD() {
	return d;
}
public void setD(Department d) {
	this.d = d;
}


}
