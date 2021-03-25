package com.tyss.javacollections.test;
import java.util.Iterator;
public class TestArrayList {

	private static final char[] Object = null;

	public static void main(String[] args) {
		ArrayListttt mylist = new ArrayListttt();
		mylist.add("ef");
		mylist.add("efhu");
		mylist.add("efvjgv");
		mylist.add("extra value ayega den wo multiplie wala line excute hoga");
		System.out.println(mylist);
		System.out.println("with for each loop coustom");
		System.out.println("*********");
		Iterator itr = (Iterator) mylist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
