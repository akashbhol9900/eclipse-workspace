package com.virtusa3;

public class Student {
   private String StudenId;
  private String name;
  private String phno;
  private String city;
  public Student()
  {
	  
  }
public Student(String StudenId, String name, String phno, String city) {
	super();
	this.StudenId = StudenId;
	this.name = name;
	this.phno = phno;
	this.city = city;
}
public String getStudenId() {
	return StudenId ;
}
public void setStudenId(String StudenId) {
	this.StudenId = StudenId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhno() {
	return phno;
}
public void setPno(String phno) {
	this.phno = phno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Student [studentid=" +StudenId + ", studentname=" + name + ", StudentPhno=" + phno
			+ ", studentCity=" + city + "]";
}
  
}
