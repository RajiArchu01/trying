package org.collections;

import java.util.ArrayList;

public class ArrayListRemoveAll1 {
	public static void main(String[] args) {
		ArrayList l1= new ArrayList();
		l1.add("10");   
		l1.add("20");
		l1.add("30");
		l1.add("90");
		l1.add("10");   
		l1.add("10");
		l1.add("40");
		l1.add("50");
		
		ArrayList l2= new ArrayList();
		l2.add("10");
		l2.add("20");
		l2.add("60");   
		l2.add("50");
		l2.add("40");
		l2.add("70");   
		l2.add("80");
		l2.add("90");

		System.out.println(l1);
		System.out.println(l2);
		l1.removeAll(l2);
		System.out.println(l1);


}
}
