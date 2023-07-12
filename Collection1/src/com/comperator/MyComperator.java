package com.comperator;
import java.util.Comparator;
public class MyComperator implements Comparator{

	@Override
	public int compare(Object s1, Object s2) {
		// TODO Auto-generated method stub
		String s3=s1.toString();
		String s4=s2.toString();

		return -s3.compareTo(s4);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s");
	}

}
