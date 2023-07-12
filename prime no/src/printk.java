
public class printk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
        for(int i=1;i<=n;i++)
        {
        	for(int j=1;j<=3;j++)
        	{
        		if(j==1 || i+j==4 || i-j==2)
        		{
        			System.out.print("K");
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
