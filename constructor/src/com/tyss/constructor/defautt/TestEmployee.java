package com.tyss.constructor.defautt;

public class TestEmployee {

	public static void main(String[] args) {
//		Employee emp = new Employee();
//		emp.id = 101;
//		emp.name= "sneha";
//		System.out.println(emp.id);
//		System.out.println();
		Employee emp = new Employee(101, "sneha", "teddy@gmail.com");
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.email);
		Employee emp1 = new Employee(102, "motii", "reddy@gmail.com");
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.email);
	}

}
