package com.virtusa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOperation implements CrudMethods{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		String qry="insert into akash.emp1(eno,ename,location,sal) values(16,'prakusssa','hyd','100000');";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=root");
			System.out.println("connection established");
			st=con.createStatement();
			System.out.println("platfrom created");
			st.executeUpdate(qry);
			System.out.println("Data nserted sussesfully");
		}catch(ClassNotFoundException| SQLException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		String qry="delete from akash.emp1 where eno=10;";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=root");
			System.out.println("connection established");
			st=con.createStatement();
			System.out.println("platfrom created");
			st.executeUpdate(qry);
			System.out.println("Data nserted sussesfully");
		}catch(ClassNotFoundException| SQLException e)
		{
			e.printStackTrace();
		}
	
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		String qry="update from akash.emp1 set sal=30000 where eno=10";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=root");
			System.out.println("connection established");
			st=con.createStatement();
			System.out.println("platfrom created");
			st.executeUpdate(qry);
			System.out.println("Data nserted sussesfully");
		}catch(ClassNotFoundException| SQLException e)
		{
			e.printStackTrace();
		}
	
	}

}
