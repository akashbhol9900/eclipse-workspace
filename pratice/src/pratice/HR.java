package pratice;


	
		public class HR extends EmployeeDetails 
	      {
	          private int salary;
	          private String performance;
	 
	         @Override
	          public void confidentialDetails(int s,String p) {
	          this.salary=s;
	          this.performance=p;
	          System.out.println("salary=="+salary);
	          System.out.println("performance=="+performance);
	     }
	 
	        public static void main(String[] args) 
	         {
	              HR hr =new HR();
	              hr.confidentialDetails(5000,"good");
	         }
	 
	      

	}


