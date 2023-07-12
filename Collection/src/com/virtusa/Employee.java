package com.virtusa;

public class Employee {
   int eno;
   String name;
public Employee(int eno, String name) {
	super();
	this.eno = eno;
	this.name = name;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return String.format("%d,%s",eno,name);
}
   
}
