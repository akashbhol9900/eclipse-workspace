package org.virtusa.crm.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import org.virtusa.crm.dao.CustomerDao;
import org.virtusa.crm.entities.Customer;
import org.virtusa.crm.util.DbHelper;
public class CustomerDaoImp1 implements CustomerDao{
	@Override
	public boolean insert(Customer customer) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean isInserted=false;
		try {
			con=DbHelper.getConnection();
			if(con!=null)
			{
				pst=con.prepareStatement("insert into customer values(?,?,?)");
				pst.setInt(1, customer.getCid());
				pst.setString(2, customer.getCname());
				pst.setString(3, customer.getLoc());
				int i=pst.executeUpdate();
				if(i>0)
					isInserted=true;
				con.close();
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return isInserted;
	}

	@Override
	public Customer get(int cid) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		Customer customer=null;
		try {
			con=DbHelper.getConnection();
			if(con!=null)
			{
				pst=con.prepareStatement("select * from customers where cid=?");
				pst.setInt(1, cid);
				rs=pst.executeQuery();
				if(rs.next())
					customer=new Customer(rs.getInt(1),rs.getString(2),rs.getString(3));
				con.close();
			}
		}catch (Exception e) {
		e.printStackTrace();
		}
		return customer;
	}

	@Override
	public List<Customer> getAll() {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		List<Customer> customers=new ArrayList<>();
		try {
			con=DbHelper.getConnection();
			if(con!=null)
			{
				st=con.createStatement();
				rs=st.executeQuery("select * from customers");
				while(rs.next()) {
					customers.add(new Customer(rs.getInt(1),rs.getString(2),rs.getString(3)));
				}
			}
			con.close();
				
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return customers;
	}

	@Override
	public boolean delete(int cid) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean isDeleted=false;
		try {
			con=DbHelper.getConnection();
			if(con!=null)
			{
				pst=con.prepareStatement("delete from customers where cid=?");
				pst.setInt(1, cid);
				int i= pst.executeUpdate();
				if(i>0)
					isDeleted=true;
			}
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

	@Override
	public Customer update(int cid, Customer customer) {
		Connection con=null;
		PreparedStatement pst=null;
		Customer cust=null;
		try {
			con=DbHelper.getConnection();
			if(con!=null)
			{
				pst=con.prepareStatement("update customers set cname=? and loc=? where cid=?");
				pst.setString(1, customer.getCname());
				pst.setString(2, customer.getLoc());
				pst.setInt(3, cid);
				int i=pst.executeUpdate();
				if(i>0)
					cust=customer;
				con.close();
				
				
				
			}
					
		}catch (Exception e) {
			e.printStackTrace();
		}
		return cust;
	}
	

}




}
