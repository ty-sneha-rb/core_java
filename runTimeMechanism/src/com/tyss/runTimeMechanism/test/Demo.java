package com.tyss.runTimeMechanism.test;

public class Demo {

	public static void main(String[] args) {
		int a[] = {12, 52, 66};
		try {
			System.out.println("s1");
			System.out.println(a[6]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.toString());
		}
		System.out.println("s2");

	}

}// ALT SHIT Z --SHORTCUT FOR TRY AND CATCH
