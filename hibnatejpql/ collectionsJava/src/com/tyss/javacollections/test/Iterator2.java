package com.tyss.javacollections.test;


	import java.util.ArrayList;
	import java.util.Iterator;

	public class Iterator2 {
		public static void main(String[] args) {
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			numbers.add(20);
			numbers.add(15);
			numbers.add(25);
			numbers.add(10);
			numbers.add(5);
			numbers.add(12);
			Iterator<Integer> it = numbers.iterator();
			while (it.hasNext()) {
				Integer ig = (Integer) it.next();
				if (ig < 15) {
					it.remove();
				}

			}
			System.out.println(numbers);
		}
	
}
