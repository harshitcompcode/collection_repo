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

public class Item implements Comparable {

	private String itemName;
	private int nou;
	private int price;
	private String brand;
	@Override
	public int compareTo(Object o) {
		
		Item e = new Item();
		e = (Item)o;
		
		
//		return this.getEmpId()-e.getEmpId();
//		return this.getEmpName().compareTo(e.getEmpName());
		
		return Double.valueOf(this.getBrand()).compareTo(Double.valueOf(e.getBrand()));
		
	}
	
}
