package com.techsupport;

public interface Ticket {
	
	static final int MAX_NO_OF_SEATS = 1;
	
	
	String bookTicket ();
	void cancelTicket ();
	
	String getPnr();
	void setPnr(String str);
	
	String getOrigin();
	void setOrigin(String str);
	
	String getDestination();
	void setDestination(String str);
	
	String getDate();
	void setDate(String str);
	
	Person getPerson();
	void setPerson(Person p);
}




