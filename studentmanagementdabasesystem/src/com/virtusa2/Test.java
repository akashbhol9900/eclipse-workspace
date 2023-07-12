package com.virtusa2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import  com.virtusa1.Cp;
import com.virtusa1.CrudDao;
import com.virtusa1.Student;

public class Test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      boolean flag=true;
      while(flag)
      {
    	  System.out.println("enter 1 for insert the value");
    	  System.out.println("enter 2 for delete value");
    	  System.out.println("ente 3 for update the value");
    	  System.out.println("enter any value for opration purpose");
    	  int c=Integer.parseInt(br.readLine());
    	  switch(c)
    	  {
    	  case 1:System.out.println("Enter the Employee details");
    	  		System.out.println("Enter the eno");
    	  		String eno1=br.readLine();
    	  		System.out.println("Enter the ename");
    	  		String ename1=br.readLine();
    	  		System.out.println("Enter the location");
    	  		String location1=br.readLine();
    	  		System.out.println("Enter the sal");
    	  		String sal1=br.readLine();
    	  		Student st=new Student(eno1,ename1,location1,sal1);
    	  		System.out.println(st);
    	  		CrudDao dao=new CrudDao();
    	  		boolean answer=dao.insertDb(st);
    	  		if(answer)
    	  		{
    	  			System.out.println("procsee estblished sussesfully");
    	  		}
    	  		else
    	  		{
    	  			System.out.println(" sorry procsee  not estblished sussesfully");
    	  		}
    	  		break;
    	  }
      }
	}

}
