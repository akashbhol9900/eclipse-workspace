package variable;

public class staticvariable {
	    char c;
           public static void main(String args[])
           {
        	// System.out.println(i);// here is no output because we can not access  
                                      //   directly a  static variable into static block
          staticvariable t= new staticvariable();
          System.out.println(t.c);
           t.akash();
           }

           public void akash()
           {
        	   System.out.println(c);
           }
           }
