package com.tyss.objectClass.test;

public class TestPerson {
public static void main(String[] args) {
	Person pp = new Person(10, "sneha");
	Person pp1 = new Person(10,"sndshhggh");
	
	System.out.println(pp);
	System.out.println(pp.toString());
	
	boolean result = pp.equals(pp1);
	System.out.println("result " + result);
//	 boolean result 
	System.out.println(pp=pp1);
	System.out.println(pp==pp1);
	
}
}
