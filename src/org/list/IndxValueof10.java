package org.list;

import java.util.LinkedList;
import java.util.List;

public class IndxValueof10 {
	public static void main(String[] args) {
		List<Integer> l=new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		System.out.println(l);
		int indexOf = l.indexOf(10);
		System.out.println(indexOf);
	}
}
		


