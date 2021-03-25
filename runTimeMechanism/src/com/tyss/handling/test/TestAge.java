package com.tyss.handling.test;

public class TestAge  {
	public void age(int age) throws InValidAge {
		if (age < 18) {
			throw new InValidAge("below 18 yrs");
		} else {
			System.out.println("welcome to vote");
		}
	}
}