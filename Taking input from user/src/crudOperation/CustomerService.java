package crudOperation;
import java.util.List;
public interface CustomerService {
 List<Customer> getcustomer();//to see all details of the employee
 Customer getCustomer(int cid);
 void delete(int cid);
 void save(Customer customer);
}
