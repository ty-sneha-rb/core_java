package com.tyss.javacollections.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AddarrayList {

	public static void main(String[] args) {
	
		ArrayList array= new ArrayList();
		array.add(20);
		array.add(50);
		array.add(90);
		int size= array.size();
		System.out.println(size);
	for(int i= 0; i<array.size(); i++) {
			System.out.println(array.get(i));
	}
		System.out.println("********************");
//		 for(int i= 0; i<args.length; i++) {
//			System.out.println(array.get(i));	}
		
	for(Object obj : array) {
		System.out.println(obj);
		System.out.println("************************");
	}
	Iterator iterator = array.iterator();
	while (iterator.hasNext()) {
		Integer lst = (Integer) iterator.next();
		System.out.println(lst);
	}
	}

}
