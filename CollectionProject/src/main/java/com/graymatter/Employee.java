package com.graymatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Comparable ,Cloneable{
	
	
	private String empName;
	private int empId;
	private double empSal;
	private String city;
	
	
	
	public int compareTo(Object o) {
		Employee e = new Employee();
		e = (Employee)o;
		
		
//		return this.getEmpId()-e.getEmpId();
//		return this.getEmpName().compareTo(e.getEmpName());
		
		return Double.valueOf(this.getEmpSal()).compareTo(Double.valueOf(e.getEmpSal()));
        
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	

}
