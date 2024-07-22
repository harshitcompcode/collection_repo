package com.graymatter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoOnVector {

	public static void main(String[] args) {
	
		
		Vector<Integer> vector = new Vector<Integer>();
		
		//its a legacy class
		//initial capacity is 10
		//if vector capacity gets exhausted; then capacity becomes double
		
		 System.out.println(vector.capacity());
		 
		 for(int i =1;i<=10;i++)
			 vector.add(i);
		 
		 
		 System.out.println(vector.capacity());
		 vector.add(11);
		 System.out.println(vector.capacity());

		 Enumeration<Integer> myEnum = vector.elements();
//		 while(myEnum.hasMoreElements()) {
//			 int i = myEnum.nextElement();
//			 if(i==6)
//		
//			 System.out.println(i);
//		 }
		 
		 Iterator<Integer> itr = vector.iterator();
		 while(itr.hasNext()) {
			 int i = itr.next();
			 if(i==6)
				 itr.remove();
			 System.out.println(i);
			 
		 }
		 vector.
		 System.out.println(vector);
		 
	}

}
