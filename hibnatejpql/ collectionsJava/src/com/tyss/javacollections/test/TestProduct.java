package com.tyss.javacollections.test;

import java.util.LinkedList;

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Product(1200, 1, "waterbottle");
		Product p2 = new Product(1400, 3, "Shampoo");
		LinkedList<Product> lst = new LinkedList<Product>();
		lst.add(p1);
		lst.add(p2);
		Product p10 = new Product(5000, 1, "Mobile");
		lst.add(1, p10);
		for (Product p : lst) {
			System.out.println(p.qty + " " + p.type + " " + p.price);
		}
	}

}
