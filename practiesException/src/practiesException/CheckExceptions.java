package practiesException;

public class CheckExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try
   {
	   System.out.println(10/0);
   }
   catch(ArithmeticException e)
   {
	  e.printStackTrace(); 
	  System.out.println(e);
	  e.getMessage();
	  System.out.println(e);
	  e.toString();
	  System.out.println(e);
   }
   }

	}


