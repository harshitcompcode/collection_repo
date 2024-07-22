package com.graymatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import jdk.internal.joptsimple.internal.Strings;

public class DemoOnLinkedList {

	public static void main(String[] args) {
		
		
//		LinkedList<String> fruitList = new LinkedList<String>();
//		fruitList.add("Orange");
//		fruitList.add("Apple");
//		fruitList.add("Mango");
//		
//		System.out.println(fruitList);
//		
//		fruitList.addFirst("Papaya");
//		fruitList.addLast("Watermelon");
//		System.out.println(fruitList);
//		fruitList.add("Apple");
//		fruitList.add("Mango");
//		System.out.println(fruitList);
//		
////		fruitList.add(null);
//		System.out.println(fruitList);
//		
//		Iterator<String> itr = fruitList.listIterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		Collections.sort(fruitList);
//		
//		System.out.println(fruitList);
//		
//		boolean flag = fruitList.contains("Apple");
//		System.out.println(flag);
//		
//		LinkedList<String> myFruits = (LinkedList<String>)fruitList.clone();
//		myFruits.add("pineapple");
//		
//		
//		System.out.println(myFruits);
//		
//		System.out.println(fruitList.hashCode());
//		System.out.println(myFruits.hashCode());
//		
		
		LinkedList<Employee> empList = new LinkedList<Employee>();
		Employee e1 = new Employee("Harshit",123,500000,"Hyderabad");
		Employee e2 = new Employee("Amit",123,300000,"Hyderabad");
		Employee e3 = new Employee("Pooja",123,200000,"Delhi");
		Employee e4 = new Employee("Kriti",123,800000,"Hyderabad");
		Employee e5 = new Employee("Mohan",123,900000,"Delhi");
		Employee e6 = new Employee("Preeti",123,700000,"Hyderabad");
		Employee e7 = new Employee("Preeti",123,670000,"Hyderabad");
		Employee e8 = new Employee("Preeti",123,800000,"Hyderabad");
		
		empList.add(e6);
		empList.add(e5);
		empList.add(e4);
		empList.add(e3);
		empList.add(e2);
		empList.add(e1);
		empList.add(e7);
		empList.add(e8);
		
		
		LinkedList<Employee> myEmps = (LinkedList<Employee>) empList.clone();
		
//		System.out.println(empList.hashCode());
//		System.out.println(myEmps.hashCode());
//		
//		Employee e9 = new Employee("John",123,800000,"Hyderabad");
//		myEmps.add(e9);
//		
//		System.out.println(myEmps);
//		System.out.println(empList.hashCode());
//		System.out.println(myEmps.hashCode());
		
		
		LinkedList<Item> myItem = new LinkedList<Item>();
		Item i1 = new Item("Laptop",10,100000,"dell");
		Item i2 = new Item("Pavillion",10,100000,"Hp");
		Item i3 = new Item("Laptop",10,100000,"Samsung");
		Item i4 = new Item("Macbook",10,100000,"Apple");
		Item i5 = new Item("Thinkpad",10,100000,"Lenovo");
		
		myItem.add(i5);
		myItem.add(i4);
		myItem.add(i3);
		myItem.add(i2);
		myItem.add(i1);
		
		System.out.println(myItem);
		
		myItem.sort(new ItemComparator().thenComparing(new BrandComparator()));
		System.out.println(myItem);
		
		

	}

}
