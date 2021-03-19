package org.list;

import java.util.ArrayList;
import java.util.List;

public class Values {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
//		10,20,30,90,10,10,40,50
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		int size = l.size();
		System.out.println(size);
		
		
		
	}

}
