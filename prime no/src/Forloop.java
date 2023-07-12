
public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int k=1;
     for(int i=1;i<=3;i++)
     {
    	 for( int j=1;j<=3;j++)
    	 {
    		 System.out.print(k+ "");
    		 if(i==2 || i==3 ||j==2 || j==3)
    				 {
    				 System.out.println(k + "");
    				 }
    		 k++;
    	 }
     }
	}

}
