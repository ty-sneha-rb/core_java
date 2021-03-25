package com.tyss.singleton.test;

public class ExampleSingle {
	private static ExampleSingle es = null;

	private ExampleSingle() {
		System.out.println("ohhhh");
	}

	public static ExampleSingle getInstance() {

		if (es == null) {
			es = new ExampleSingle();
			return es;
		} else {
			return es;
		}
	}
}
