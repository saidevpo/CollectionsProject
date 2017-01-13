package com.collections.arraylist;

import java.util.ArrayList;

public class ArraylistExample2 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(25,"saidev",101);
		Employee e2 = new Employee(20,"ssuma",102);
		Employee e3 = new Employee(2,"avaneesh",103);
		
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		
		for (Employee employee : e) {
			System.out.println(employee);
		}

	}

}
