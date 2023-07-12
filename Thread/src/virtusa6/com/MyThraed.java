package virtusa6.com;

public class MyThraed extends Thread {
   public void run()
   {
	   for(int i=0;i<5;i++)
	   {
		   System.out.println("hello");
	   }
   }
}
