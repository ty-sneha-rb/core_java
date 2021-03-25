package com.tyss.set.test;

import java.util.HashSet;

public class MyHashSet {
public static void main(String[] args) {
	HashSet<Integer> hashset = new HashSet<Integer>();
	hashset.add(55);
	hashset.add(85);
	hashset.add(85);
	System.out.println(hashset);
	System.out.println(hashset.add(55));//it will not print the value 
}
}
