package com.tyss.javacollections.test;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.ListIterator;

	public class Iterator {
		public static void main(String[] args) {
			List all = new ArrayList();
			all.add('a');
			all.add('m');
			all.add('m');
			all.add('a');

			ListIterator<Character> ltr = all.listIterator();
			while (ltr.hasNext()) {
				Character ch = (Character) ltr.next();
				System.out.print(ch);
			}
			System.out.println();

			while (ltr.hasPrevious()) {
				Character ch1 = (Character) ltr.previous();
				System.out.print(ch1);
			}
			System.out.println();

		}

		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		public char[] next() {
			// TODO Auto-generated method stub
			return null;
		}
	}

