package com.tyss.threads.test;

public class Priority {
	public static void main(String[] args) {
				MyThread th = new MyThread();
				System.out.println("main method priority"+ th.currentThread().getPriority());
			th.setPriority(10);
			th.start();
//			th.start();
//			th.run(10);
			for(int i= 0; i<5; i++)
				System.out.println("main thread");
			System.out.println("thread id" + th.getId());
			System.out.println("thread name"+ th.getName());
		}

		}



