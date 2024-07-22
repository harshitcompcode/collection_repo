package com.graymatter;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		
		
		return (int) ((int)o1.getEmpSal()-o2.getEmpSal());
	}

	
}
