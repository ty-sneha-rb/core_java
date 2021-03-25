package com.tyss.set.test;

import java.util.TreeSet;

public class TestAString {
public static void main(String[] args) {
	TreeSet<String> tree = new TreeSet<String>(new AssendingString());
	tree.add("B");
	tree.add("D");
	tree.add("A");
	tree.add("C");
	System.out.println(tree);
}
}
