package com.vehiclebooking;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				System.out.println("please provide your deteils");
				System.out.println("please enter your name");
				String pname=sc.nextLine();
				//sc.nextLine();
				System.out.println("please enter your mobile no");
				String mno=sc.nextLine();
				//sc.nextLine();
				System.out.println("please enter your Email");
				String email=sc.nextLine();
				//sc.nextLine();
				//
				//FourWheeler f=new FourWheeler();
				Passenger p=new Passenger();
				p.setPname(pname);
				//sc.nextLine();
				p.setMno(mno);
				//sc.nextLine();
				p.setEmail(email);
				//sc.nextLine();
				System.out.println("please write fourwheeler or othervachile");
				String vachicletype=sc.nextLine();
				p.setVachicletype(vachicletype);
				FourWheeler f=new FourWheeler();
				OtherWheeler ow=new OtherWheeler();
				if(vachicletype.equals("fourwheeler"))
				{
					f.rent();
				}
				if(vachicletype.equals("othervachicle"))
				{
					//System.out.println("details of other vachile");
					ow.rent();
				}
				System.out.println("Details of employee");
				System.out.println(p.getPname()+" "+p.getEmail()+" "+p.getMno());
				//System.out.println(vachicletype+" "+"details");
			}

		}


	


