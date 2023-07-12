package org.virtusa.crm;
import org.virtusa.crm.dao.CustomerDao;
import org.virtusa.crm.dao.CustomerDaoImp1;
import org.virtusa.crm.entities.Customer;
public class Test {
	public static void main(String[] args){
		CustomerDao dao=new CustomerDaoImp1();
		if(dao.insert(new Customer(1,"suresh","hyd")))
			System.out.println("Inserted successfully");
		else
			System.out.println("not inserted");
		
	}
	
}
