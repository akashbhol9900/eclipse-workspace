package com.techsupport;

import java.util.Scanner;

public class TestTicket {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Scanner in = new Scanner (System.in);
		Person p = new Person ();
		System.out.println("Welcome to Train Booking...Enter Passanger details");
		System.out.println("enter name");
		String name = in.nextLine ();
		p.setName(name);
		
		System.out.println("enter age");
		int age = in.nextInt ();
		in.nextLine();
		p.setAge(age);
		
		System.out.println("enter gender");
		String gender = in.nextLine ();
		p.setGender(gender);
		
		System.out.println("enter contact number");
		String pno = in.nextLine ();
		p.setPhNo(pno);
		
		System.out.println("enter email");
		String email = in.nextLine ();
		p.setEmailId (email);
//	-----------------------------------------------------------------------------------------------------------
		System.out.println("\nEnter Travel Details\n");
		
		System.out.println("enter pnr");
		String pnr = in.nextLine ();
		
		System.out.println("enter origin");
		String origin = in.nextLine ();
		
		System.out.println("enter destination");
		String dest = in.nextLine ();
		
		System.out.println("enter date");
		String date = in.nextLine ();
		
		if (ConfirmedTicket.no_of_seats <= Ticket.MAX_NO_OF_SEATS) {
			Ticket t = new ConfirmedTicket ();
			
			
			t.setPnr(pnr);
			t.setOrigin(origin);
			t.setDestination(dest);
			t.setDate(date);
			
			t.setPerson(p);
			
			System.out.println("seat booked successfully seat no. = "+t.bookTicket());
			System.out.println("No. of available seats = "+ConfirmedTicket.no_of_seats+" Ticket confirmed");
			
			t.cancelTicket();
			
		}
		else {
			Ticket t = new WaitingListTicket();
			
			t.setPnr(pnr);
			t.setOrigin(origin);
			t.setDestination(dest);
			t.setDate(date);
			
			t.setPerson(p);
			System.out.println("No. of available seats = "+ConfirmedTicket.no_of_seats+" your status is "+t.bookTicket());
		}
		
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		
		/*Person p1 = new Person ();
		System.out.println("Welcome to Train Booking...Enter Passanger details");
		System.out.println("enter name");
		String name1 = in.nextLine ();
		p1.setName(name1);
		
		System.out.println("enter age");
		int age1 = in.nextInt ();
		in.nextLine();
		p1.setAge(age1);
		
		System.out.println("enter gender");
		String gender1 = in.nextLine ();
		p1.setGender(gender1);
		
		System.out.println("enter contact number");
		String pno1 = in.nextLine ();
		p1.setPhNo(pno1);
		
		System.out.println("enter email");
		String email1 = in.nextLine ();
		p1.setEmailId (email1);
		
		System.out.println("\nEnter Travel Details\n");
		
		System.out.println("enter pnr");
		String pnr1 = in.nextLine ();
		
		System.out.println("enter origin");
		String origin1 = in.nextLine ();
		
		System.out.println("enter destination");
		String dest1 = in.nextLine ();
		
		System.out.println("enter date");
		String date1 = in.nextLine ();
		
		if (ConfirmedTicket.no_of_seats > 0 &&  ConfirmedTicket.no_of_seats < Ticket.MAX_NO_OF_SEATS ) {
			Ticket t1 = new ConfirmedTicket ();
			
			
			t1.setPnr(pnr1);
			t1.setOrigin(origin1);
			t1.setDestination(dest1);
			t1.setDate(date1);
			
			t1.setPerson(p1);
			
			System.out.println("seat booked successfully seat no. = "+t1.bookTicket());
			System.out.println("No. of available seats = "+ConfirmedTicket.no_of_seats+" Ticket confirmed");
			
			
			

			
		}
		else {
			Ticket t1 = new WaitingListTicket();
			
			t1.setPnr(pnr1);
			t1.setOrigin(origin1);
			t1.setDestination(dest1);
			t1.setDate(date1);
			
			t1.setPerson(p1);
			System.out.println("No. of available seats = "+ConfirmedTicket.no_of_seats+" your status is "+t1.bookTicket());
		}

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/
		
		
		
	}
}
