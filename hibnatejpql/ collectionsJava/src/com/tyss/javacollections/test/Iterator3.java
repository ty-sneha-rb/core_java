package com.tyss.javacollections.test;


	import java.util.ArrayList;
	import java.util.Iterator;

	public class Iterator3 {
		public static void main(String[] args) {
			ArrayList<String> names = new ArrayList<String>();
			names.add("chotu");
			names.add("honey");
			names.add("aarav");
			names.add("shivuuu");
			names.add("javaaaaa");
			
			
			Iterator<String> it = names.iterator();
			while(it.hasNext()) {
				String str = (String)it.next();
				System.out.println(str);
			}
		}
	}

