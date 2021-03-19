package org.list;

import java.util.LinkedList;
import java.util.List;

public class Valuein2ndIndx {
	public static void main(String[] args) {
		List<Integer> l=new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		
		
		System.out.println(l);
		Integer integer = l.get(2);
		System.out.println(integer);
		

}
}
