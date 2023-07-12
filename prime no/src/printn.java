
public class printn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
        for(int i=1;i<=n;i++)
        {
        	for(int j=1;j<=3;j++)
        	{
        		if(i==1|| i==3 || i==5 || i+j==3 || i+j==7)
        		{
        			System.out.print("S");
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
