package com.collections.arraylist;

public class CounterTest {

	static int counter = 0;
	
	CounterTest(){
		counter++;
	}
	
	public static int show(){
		return counter;
	}
	public static void main(String[] args) {
		CounterTest t = new CounterTest();
		CounterTest t1 = new CounterTest();
		CounterTest t2 = new CounterTest();
		System.out.println(CounterTest.show());

	}

}
