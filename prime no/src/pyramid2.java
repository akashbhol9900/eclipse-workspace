
public class pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
        for(int i=1;i<=n;i++)
        {
        	for(int j=1;j<=n;j++)
        	{
        		if(i+j==n-2 || j-i==n-4 ||  i-j==n-4 || i+j==n+4 || i+j==n || j-i==n-6 ||i-j==n-6)
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
