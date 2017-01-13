package com.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.collections.arraylist.Employee;

public class HashMapEmpStdnt {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		HashMap<Employee, Student> h = new HashMap<Employee, Student>();
		h.put(new Employee(25, "sai",101),new Student("saidevp",201));
		h.put(new Employee(26, "saidev",102),new Student("psaidev",202));
		h.put(new Employee(27, "saidevpola",103),new Student("polasaidev",23));
		//return all the entries
		Set ss=h.entrySet();
		Iterator itr = ss.iterator();
		
		while (itr.hasNext()) {
			Map.Entry m =(Map.Entry) itr.next();
			Employee e = (Employee)m.getKey();
			System.out.println(e);
			Student std = (Student)m.getValue();
			System.out.println(std);
		}
		
		

	}

}
