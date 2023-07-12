package collection123.com;

public class Emp implements Comparable<Emp>{
private int eno;
private String ename;
private String eadd;
public Emp()
{
	
}
public Emp(int eno, String ename, String eadd) {
	super();
	this.eno = eno;
	this.ename = ename;
	this.eadd = eadd;
}
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEadd() {
	return eadd;
}
public void setEadd(String eadd) {
	this.eadd = eadd;
}
public int compareTo(Emp e)
{
	if(this.eno<getEno())
		return 1;
	else if(this.eno>getEno())
		return -1;
	else
		return 0;
}
}
