package virtusa3;

public class ValidData 
{
	
private String firstname;
private String lastname;
private String pno;
private String email;
public ValidData()
{
	
}
public ValidData(String firstname, String lastname, String pno, String email) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.pno = pno;
	this.email = email;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getPno() {
	return pno;
}
public void setPno(String pno) {
	this.pno = pno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}



}
