package crudOperation;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
	List<Customer> customers=new ArrayList<>();
	@Override
	public List<Customer> getcustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomer(int cid) {
		// TODO Auto-generated method stub
		Customer customer1=null;
		for(Customer customer:customers)
		{
			if(customer.getCid()==cid)
			{
				customer1=customer;
			}
		}
		return customer1;
	}

	@Override
	public void delete(int cid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
