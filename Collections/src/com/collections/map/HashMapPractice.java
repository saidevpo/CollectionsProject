package com.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.collections.arraylist.Employee;

public class HashMapPractice {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		HashMap<Employee,Student> h = new HashMap<Employee,Student>();
		h.put(new Employee(30,"saidev",101), new Student("Avaneesh",101));
		h.put(new Employee(31,"saidevpo",102), new Student("Rishitha",102));
		h.put(new Employee(32,"saidevpola",103), new Student("padmini",103));
		h.put(new Employee(33,"saidevpolava",104), new Student("ronith",104));
		
		Set<Entry<Employee, Student>> ss = h.entrySet();
		Iterator<Entry<Employee, Student>> itr = ss.iterator();
		
		while(itr.hasNext()){
			Map.Entry m = (Map.Entry)itr.next();
			Employee e = (Employee)m.getKey();
			System.out.println(e);
			Student std= (Student)m.getValue();
			System.out.println(std);
		}
		
		
	}

}
