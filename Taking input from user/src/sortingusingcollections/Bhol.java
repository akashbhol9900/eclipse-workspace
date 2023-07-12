package sortingusingcollections;
import java.util.Comparator;
public class Bhol implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		return -i2.compareTo(i1);
	}

}
