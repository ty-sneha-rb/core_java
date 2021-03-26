package com.tyss.objectClass.test;

public class Person {
   int pid ;
  String name;
  
  
  
public Person(int pid, String name) {
	super();
	this.pid = pid;
	this.name = name;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + pid;
	return result;
}

//ALT + SHIFT +S +O
@Override
	public String toString() {
		
		return super.toString();
	}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (pid != other.pid)
		return false;
	return true;
}
}
