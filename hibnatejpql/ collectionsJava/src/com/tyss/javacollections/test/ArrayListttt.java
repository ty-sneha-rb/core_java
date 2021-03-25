package com.tyss.javacollections.test;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayListttt<E> implements Iterable <E>{
	private Object elementData[];
	private final int DEFAULT_SIZE = 3;
	private int size = 0;

	ArrayListttt() {
		this.elementData = new Object[DEFAULT_SIZE];
	}

	public void add(Object e1) {
		System.out.println("inside add method");
		if (size == elementData.length) {
			System.out.println("inside if block");
			System.out.println(size);
			int prevSize = elementData.length;
			System.out.println(prevSize);
			int newSize = prevSize * 2;
			System.out.println(newSize);
			elementData = Arrays.copyOf(elementData, newSize);

		}
		this.elementData[size] = e1;
		size++;
	}

	public String toString() {
		String s1 = new String("[");
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				s1 = s1 + elementData[i];
			} else {
				s1 = s1 + elementData[i] + ", ";
			}
		}
		s1 = s1 + "]";
		return s1;

	}

	public void remove(int index) {
		elementData[index] = null;
	}

//own iterator implementation
//	public ArrayListttt<E>.Itr iterator() {
//		return ;
//	}

	private class Itr implements Iterator<E> {
		private int index;

		public boolean hasNext() {
			return (index < size) ? true : false;
		}

	public E next() {
		E e = (E) elementData[index];
		index ++ ;
		return e;
	}
	}

	@Override
	public Iterator iterator() {
		
		return new Itr();
	}

}
