package com.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import com.collections.arraylist.Employee;

public class LinkedListExampleTwo {

	public static void main(String[] args) {

LinkedList<Employee> ll= new LinkedList<Employee>();
ll.add(new Employee(25, "Saidev", 201));
ll.add(new Employee(26, "Saidevp", 202));
ll.add(new Employee(27, "Saidevpo", 203));


for (Employee employee : ll) {
	System.out.println(employee);
}


	}

}
