package com.techsupport;

public class Person {
	private String name;
	private int age;
	private String gender;
	private String phNo;
	private String emailId;
	
	public Person() {
		super();
	}

	public Person(String name, int age, String gender, String phNo, String emailId) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phNo = phNo;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPhNo() {
		return phNo;
	}
	
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
//	public void ticketBookingService (Person p) {
//		
//		if (ConfirmedTicket.no_of_seats <= Ticket.MAX_NO_OF_SEATS) {
//			Ticket t = new ConfirmedTicket ();
//			//System.out.println("enter");
//			System.out.println("No. of available seats = "+ConfirmedTicket.no_of_seats+" Ticket confirmed");
//			System.out.println("seat no. = "+t.bookTicket());
//		}
//		else {
//			Ticket t = new WaitingListTicket();
//			System.out.println("No. of available seats = "+ConfirmedTicket.no_of_seats+" your status is "+t.bookTicket());
//		}
//	}
	
	

}
