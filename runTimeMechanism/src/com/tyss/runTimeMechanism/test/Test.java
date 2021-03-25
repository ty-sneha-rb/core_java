package com.tyss.runTimeMechanism.test;

public class Test {
public static void stuff () throws Exception{
	System.out.println(10/0);
	
}
public static void stuff1 () throws Exception {
	System.out.println("insde stuff1");
	stuff();
}
public static void stuff2 () throws Exception {
	System.out.println("insde stuff2");
	stuff1();
}
public static void main(String[] args) throws Exception {
	System.out.println("inside main");
	stuff2();
	
}
}
