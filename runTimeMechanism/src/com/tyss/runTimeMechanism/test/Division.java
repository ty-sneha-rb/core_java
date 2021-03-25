package com.tyss.runTimeMechanism.test;

public class Division {
public static void main(String[] args) {
	try {
	System.out.println("s1");
	System.out.println(10/0);// if the output is correct it wont go for catch method
	System.out.println("s2");
	} catch ( Exception e) {
		System.out.println("s3");
		System.out.println(10/2);
		System.out.println("s4");
	}
	 }
}
