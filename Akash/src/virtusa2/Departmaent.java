package virtusa2;

public class Departmaent {
private int dno;
private String dname;
private String loc;
public Departmaent()
{
	
}
public Departmaent(int dno, String dname, String loc) {
	super();
	this.dno = dno;
	this.dname = dname;
	this.loc = loc;
}
public int getDno() {
	return dno;
}
public void setDno(int dno) {
	this.dno = dno;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
//public void setLoc(String loc2) {
	// TODO Auto-generated method stub
	
//}

}
