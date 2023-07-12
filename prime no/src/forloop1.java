import java.util.Scanner;

public class forloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter two no given by the user");
         int n=sc.nextInt();
         int n1=sc.nextInt();
         for(int i=n;i<=n1;i++)
         {
        	 for(int j=2;j<=i;j++)
        	 {
        		 if(i%j==0)
        			 break;
        	 }
        	 if(i==j)
        	 
        	//System.out.println(j);	 
        	 
         }
	}

}
