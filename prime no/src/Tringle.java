
public class Tringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /* for( int i=1;i<=7;i++)
      {
    	  for(int j=1;j<=7;j++)
    	  {
    		  if(i+j==5||j-i==3)
    		  {
    			  System.out.print("*");
    		  }
    	  }
    	  System.out.print("");
      }*/
		int n=5;
		 for( int i=1;i<=n;i++)
	      {
	    	  for(int j=1;j<=n;j++)
	    	  {
	    		  if(i==1 || i==n || j==1 || j==n)
	    		  {
	    			  System.out.print("*");
	    		  }
	    		  else
	    		  {
	    			  System.out.println(" ");
	    		  }
	    	  
	    	  System.out.println  ("    ");
	      }
		
	}
	}

}
