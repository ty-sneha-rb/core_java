package com.tyss.threads.test;

public class MyThread extends Thread {
@Override
public void run() {
	for(int i= 0; i<3; i++)
	System.out.println("child thread");
}
 public void run(int a) {
	 System.out.println("child2");
 }
}
