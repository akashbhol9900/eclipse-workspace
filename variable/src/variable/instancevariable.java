package variable;

public class instancevariable {
        static int a=10; 
        static String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(a);
     System.out.println(instancevariable.a);
     instancevariable d=new instancevariable();
     System.out.println(d.a);
     System.out.println(d.s);
	}

}
