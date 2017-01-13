package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class CompareToSort {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(25,"saip",102);
		Employee emp2= new Employee(26,"saipola",104);
		Employee emp3 = new Employee(27,"devapola",106);
		Employee emp4 = new Employee(28,"saidevpola",107);
		Employee emp5 = new Employee(29,"polavsaidev",101);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);
		
		Collections.sort(al);
		for (Employee employee : al) {
			System.out.println(employee);
		}
		
	}
	

}
