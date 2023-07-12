package com.techsupport;


class WaitingListTicket extends ConfirmedTicket implements Ticket   {
	
	private String pnr;
	private String origin;
	private String destination;
	private String date;
	private Person person;
	
	
	
	public WaitingListTicket() {
		super();
	}
	public WaitingListTicket(String pnr, String origin, String destination, String date) {
		super(pnr, origin, destination, date);
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
		
	public String bookTicket () {
		return "WL";
		
	}
	
}