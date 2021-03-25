package com.tyss.threads.test;

public class MyRunable implements Runnable{

	@Override
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("inside run()");
		}
		
	}

}
