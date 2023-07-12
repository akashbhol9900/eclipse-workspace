package com.techsupport;

class ConfirmedTicket implements Ticket {
	private String pnr;
	private String origin;
	private String destination;
	private String date;
	private Person person;
	
	public static int no_of_seats = Ticket.MAX_NO_OF_SEATS;
	
	
	public ConfirmedTicket() {
		super();
	}

	public ConfirmedTicket(String pnr, String origin, String destination, String date) {
		super();
		this.pnr = pnr;
		this.origin = origin;
		this.destination = destination;
		this.date = date;
	}
	
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public int generateRandomNumber () {
		return (int) (Math.round(Math.random()*100));
	}

	public String bookTicket () {
		no_of_seats = no_of_seats-1;
		return String.valueOf(generateRandomNumber());
	}
	
	public void cancelTicket () {
		if (no_of_seats <= MAX_NO_OF_SEATS) {
			no_of_seats++;
		}
		System.out.println("Ticket cancelled successfully. Available no. of seats = "+no_of_seats);
	}

	
	

	
}