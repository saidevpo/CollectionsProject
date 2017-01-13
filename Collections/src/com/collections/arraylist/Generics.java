package com.collections.arraylist;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {

		Employee e1 = new Employee(25, "sai", 101);
		Employee e2 = new Employee(26, "saide", 102);
		Employee e3 = new Employee(27, "saidev", 103);
		//Generics in collections
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);

		for (Employee ee : al) {
			System.out.println(ee);
		}
	}

}
