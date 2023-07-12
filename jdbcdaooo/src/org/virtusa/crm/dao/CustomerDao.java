package org.virtusa.crm.dao;
import java.util.List;
import org.virtusa.crm.entities.Customer;
public interface CustomerDao {
	boolean insert(Customer Customer);
	Customer get(int cid);
	List<Customer>getAll();
	boolean delete(int cid);
	Customer update(int cid,Customer Customer);
}
