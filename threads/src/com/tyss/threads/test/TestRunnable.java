package com.tyss.threads.test;

public class TestRunnable {

	public static void main(String[] args) {
		MyRunable rr = new MyRunable();
		Thread thread = new Thread(rr);
		thread.start();
		for(int i= 0; i<3; i++) {
			System.out.println( "inside main()");
		}
	}

}
