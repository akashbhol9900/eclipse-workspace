package com.start;
import com.virtusa3.Student;
import com.virtusa3.StudentDao;
import com.virtusa3.Cp;
import java.io.BufferedReader;
import java.io.*;
public class Start {

	//private static String phno;

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("welcome to student database ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean flag=true;
		while(flag)
		{
			System.out.println("Press 1 to Add student");
			System.out.println("Press 2 to Delete student");
			System.out.println("Press 3 to Display Student");
			System.out.println("Press 4 to Update App");
			System.out.println("Press 5 to Exit App");
			int c=Integer.parseInt(br.readLine());
			System.out.println("the user enter the is"+" "+c);
			switch(c)
			{
			case 1:System.out.println("Enter the id of the student");
					String id=br.readLine();
				    System.out.println("enter the name of the student");
					String name=br.readLine();
					System.out.println("enter the phno of the student");
					String pno=br.readLine();
					System.out.println("Enter the city of the city");
					String city=br.readLine();
					Student student=new Student(id,name,pno,city);
					System.out.println(student);
					StudentDao dao=new StudentDao();
					boolean answer = dao.insertStudentToDb(student);
					
					if (answer) {
						System.out.println("Inserted Successfully");
					}else {
						System.out.println("Failed to Insert");					
					}
//					if(insertStudentToDb(Student))
//					{
//						System.out.println("Inserted Successfully");
//					}
//					else
//					{
//						System.out.println("Failed to Insert");	
//					}
//					break;
			}
		}
		
	}

	
	

}
