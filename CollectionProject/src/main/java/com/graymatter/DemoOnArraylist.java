package com.graymatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoOnArraylist {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
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
		
		for(Employee emp:empList)
			System.out.println(emp);
			
		System.out.println("Using iterator");
		
		Iterator<Employee> itr = empList.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		System.out.println("Sort Operation");
		
//		Collections.sort(empList);
		
		empList.sort(new CityComparator().thenComparing(new SalaryComparator()).thenComparing(new NameComparator()));
		
		for(Employee emp: empList)
			System.out.println(emp);
		
		
		
		
	

	}

}
