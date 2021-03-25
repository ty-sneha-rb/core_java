package com.tyss.set.test;

import java.util.TreeSet;

public class MyComparable {
	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
		tree.add(456);
		tree.add("honeyj");
		tree.add(56);
		System.out.println(tree);
		
	}
}//we will get class cast exception
