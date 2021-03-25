package com.tyss.threads.test;

public class TestThread {

	public static void main(String[] args) {
		System.out.println("main thread is daemon"+Thread.currentThread().isDaemon());
		MyThread th = new MyThread();
		th.setDaemon(true);
		System.out.println(Thread.currentThread().isDaemon());
		
		System.out.println("main method priority" + th.currentThread().getPriority());
		th.setPriority(1);
		th.start();
		for (int i = 0; i < 5; i++)
			System.out.println("main thread");
		System.out.println("thread id" + th.getId());
		System.out.println("thread name" + th.getName());
	}

}
