package variable;

public class instancevariableandstaticvariablemomorylocation {
	int a=10;
    static int b=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // System.out.println(a);
      System.out.println(b);
      instancevariableandstaticvariablemomorylocation n= new  instancevariableandstaticvariablemomorylocation();
      n.a=888;
      n.b=999;
      instancevariableandstaticvariablemomorylocation n1= new  instancevariableandstaticvariablemomorylocation();
      System.out.println(n1.b);
      System.out.println(n.a);
	}

}
