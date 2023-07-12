package virtusa2;

public class Emp {
private int empcode;
private String name;
private String position;
private int sal;
private Departmaent department;
public Emp()
{
	
}
public Emp(int empcode, String name, String position, int sal, Departmaent department) {
	super();
	this.empcode = empcode;
	this.name = name;
	this.position = position;
	this.sal = sal;
	this.department = department;
}
public int getEmpcode() {
	return empcode;
}
public void setEmpcode(int empcode) {
	this.empcode = empcode;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public Departmaent getDepartment() {
	return department;
}
public void setDepartment(Departmaent department) {
	this.department = department;
}
//public void setName(String name) {
	// TODO Auto-generated method stub
	
//}
//public void setPosition1(String position2) {
	// TODO Auto-generated method stub
	
//}

}
