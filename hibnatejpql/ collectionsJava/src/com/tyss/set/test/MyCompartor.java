package com.tyss.set.test;

import java.util.Comparator;

public class MyCompartor <T> implements Comparator<T>{

public int compares(T o1, T o2) {
Integer i1 = (Integer)o1;
Integer i2 = (Integer)o2;
if(i1<i2) {
	return 100;
}
	else if (i1>i2){
		return -100;
	}
	else
		return 0;
}

@Override
public int compare(Object o1, Object o2) {
	// TODO Auto-generated method stub
	return 0;
}
}
