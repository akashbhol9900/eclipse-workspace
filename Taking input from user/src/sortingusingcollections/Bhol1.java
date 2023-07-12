package sortingusingcollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
public class Bhol1 {
	public static void main(String args[])
	{
List<Integer> li=new ArrayList<>();
 li.add(10);
 li.add(20);
 li.add(1);
 li.add(16);
 li.add(16);
 Collections.sort(li);
 System.out.println(li);
 //Collection.binarySearch(li,"16");
 System.out.println();
 }
}
