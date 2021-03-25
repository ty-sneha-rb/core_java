package com.tyss.set.test;

import java.util.Comparator;
import java.util.TreeSet;

public class AssendingString<T> implements Comparator<T>  {

	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<String>();
//		ts1.add("D");
//		ts1.add("B");
//		ts1.add("C");
//		ts1.add("C");
//		ts1.add("A");
//		System.out.println(ts1);
	}

	@Override
	public int compare(T o1, T o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		int result = 0;
		System.out.println(result);
		if (result ==1) {
			return 1;
		} else if(result == -1) {
			return -1;
		}else {
			return 0;
		}
		
	}
}
