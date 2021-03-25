package com.tyss.runTimeMechanism.test;

public class TryyCatch {
public static void main(String[] args) {
	System.out.println("s1");
	try {
		System.out.println(10/0);
		try {
			System.out.println("nested try");
		}catch(Exception e) {
			System.out.println("dgr");
		}finally {}
	} 
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBondsException e");
	}
	
	catch (ArithmeticException e) {
		System.out.println("ArithmeticException");
		}
	catch (Exception e) {
		System.out.println("Exception");
		System.exit(0);
		}finally {
			System.out.println("final block will always execute");
		
		}
	
	System.out.println("ammaa");
}
}
