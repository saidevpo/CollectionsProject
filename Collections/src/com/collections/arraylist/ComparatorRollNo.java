package com.collections.arraylist;

import java.util.Comparator;

public class ComparatorRollNo implements Comparator<Employee> {

	@Override
	public int compare(Employee e, Employee e1) {
		
		if(e.rollno==e1.rollno){
			return 0;
		}else if 
			(e.rollno>e1.rollno){
				return 1;
	}
		else return -1;
		}
		
	}


