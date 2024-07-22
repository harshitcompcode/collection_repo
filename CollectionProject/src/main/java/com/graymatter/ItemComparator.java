package com.graymatter;

import java.util.Comparator;

public class ItemComparator implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {
		// TODO Auto-generated method stub
		return o1.getItemName().compareTo(o2.getItemName());
	}

	
	
	
}
