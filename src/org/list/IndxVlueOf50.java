package org.list;

import java.util.LinkedList;
import java.util.List;

public class IndxVlueOf50 {
	public static void main(String[] args) {
		List<Integer> l=new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		int lastIndexOf = l.lastIndexOf(50);
		System.out.println(lastIndexOf);
	}
}
