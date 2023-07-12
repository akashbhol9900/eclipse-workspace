package com.virtusa;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
//		Airtel airtel =new Airtel();
//		airtel.calling();
//		airtel.data();
		/*
		 * Sim sim=new Vodaphone(); sim.calling(); sim.data();
		 */
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans loades");
	    Sim sim=(Airtel)context.getBean("airtel");
	    sim.calling();
	    sim.data();
	}

}
