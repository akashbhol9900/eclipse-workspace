package com.management;

public class Student {
private String id;
private String name;
private String DOB;
private String blood;
private double height;
private double matricmark;
private double intermediatemark;
public Student()
{
	
}

public Student(String id, String name, String dOB, String blood, double height, double matricmark,
		double intermediatemark) {
	super();
	this.id = id;
	this.name = name;
	DOB = dOB;
	this.blood = blood;
	this.height = height;
	this.matricmark = matricmark;
	this.intermediatemark = intermediatemark;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDOB() {
	return DOB;
}

public void setDOB(String dOB) {
	DOB = dOB;
}

public String getBlood() {
	return blood;
}

public void setBlood(String blood) {
	this.blood = blood;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

public double getMatricmark() {
	return matricmark;
}

public void setMatricmark(double matricmark) {
	this.matricmark = matricmark;
}

public double getIntermediatemark() {
	return intermediatemark;
}

public void setIntermediatemark(double intermediatemark) {
	this.intermediatemark = intermediatemark;
}

public void show()
{
System.out.println("ALL DETAILS OF A STUDENT");
System.out.println("id ="+id+" "+"sname ="+name+" "+"DOB ="+DOB+" "+"blood ="+blood+" "+
"height ="+height+" "+"matricmark ="+matricmark+" "+"intermidatemark="+intermediatemark);
}

}
