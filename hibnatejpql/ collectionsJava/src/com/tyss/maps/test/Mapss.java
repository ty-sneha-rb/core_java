package com.tyss.maps.test;

import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;

import com.tyss.javacollections.test.Iterator;

public class Mapss {
public static void main(String[] args) {
	HashMap<String, Integer>  map = new HashMap<String, Integer>();
	map.put("id", 122);
	map.put("roll", 123);
	map.put("name", 124);
	System.out.println(map);
	// if u want only key
	 Set<String> s = map.keySet();
//	 Iterator <String> itr = s.iterator();
//	 while (itr.hasNext()) {
//		 String string = (String) itr.next();	 }
//	 int id = map.get("id");
//	 System.out.println(id);
//	 

	
}
}
