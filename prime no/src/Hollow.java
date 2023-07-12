import java.util.Scanner;

public class Hollow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				System.out.println("Taking an input from user");
		int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=(2*n-1);j++)  
    	  {
    		  if(i==n || i+j==n+1 || j-i==n-1) {
    			  
    		  
    		  System.out.print("*");
    		  }
    		  else {
    			  System.out.print(" ");
    		   
    		  }
    	  }
    		  System.out.println(" ");
    	  
      }
	}

}
