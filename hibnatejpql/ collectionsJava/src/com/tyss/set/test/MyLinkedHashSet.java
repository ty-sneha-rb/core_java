package com.tyss.set.test;


import java.util.LinkedHashSet;

public class MyLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhashset = new LinkedHashSet<Integer>();
		lhashset.add(55);
		lhashset.add(85);
		lhashset.add(85);
		System.out.println(lhashset);
		System.out.println(lhashset.add(55));
	}
}
