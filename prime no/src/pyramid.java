import java.util.Scanner;
public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=5;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  a no user");
		int n = sc.nextInt();
      for(int i = 1;i<=n;i++)
      {
    	  for(int j=1;j<=n;j++)
    	  {
    		  if(i+j==n-1 || j-i==n-3 || i-j==n-3 || i+j==n+3)
    		  {
    			  System.out.print("*");
    		  }
    		  else
    		  {
    			  System.out.print(" ");
    		  }
    	  }
    	  System.out.println(" ");
      }
	}

}
