package com.collections.arraylist;

public class Employee implements Comparable<Employee>
 {
	
	int age;
	String name;
	int rollno;
	
	 public Employee(int age, String name,int rollno){
		this.age = age;
		this.name = name;
		this.rollno= rollno;
	}
	 //Sorting using rollno
/*	 public int compareTo(Object o){
		 Employee emp =(Employee)o;
		 if(rollno == emp.rollno){
			 return 0;
		 }else if(rollno>emp.rollno){
			 return 1;
		 }else return -1;
	 }*/
	 
	 
	 //Sorting using name. For descending order put - after return
	 public int compareTo(Employee e){
		 //Employee emp=(Employee)o;
		  return -name.compareTo(e.name);
	 }
 public String toString(){
	 
	 return ("Age is :" + age + " " + "name is :"+ name + " " + "rollno is :" +rollno);
 }
}
