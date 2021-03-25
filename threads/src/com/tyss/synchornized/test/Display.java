package com.tyss.synchornized.test;

public class Display {
public synchronized void wish (String name) {
	for (int i= 0; i< 5; i++) {
		System.out.println("ga");
		System.out.println(name);
	}
//	Thread.sleep(3000);
	
	try {
		Thread.sleep(3000);
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
	
}
}
