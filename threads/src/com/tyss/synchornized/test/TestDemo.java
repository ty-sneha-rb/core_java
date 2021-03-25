package com.tyss.synchornized.test;

public class TestDemo {
public static void main(String[] args) {
	Display d = new Display();
	
	MyThread thread = new MyThread (d, 52, "sneha");
	MyThread thread1 = new MyThread (d, 101, "snehhh");
	thread.start();
	thread1.start();
}
}
