package com.tyss.synchornized.test;

public class MyThread extends Thread {
Display d;
String name;
int id;
public MyThread(Display d, int id, String name) {
	super();
	this.d = d;
	this.id = id;
	this.name= name;
}
@Override
	public void run() {
		
		d.wish(name);
	}
}
