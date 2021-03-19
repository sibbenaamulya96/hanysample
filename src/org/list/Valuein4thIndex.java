package org.list;

import java.util.LinkedList;
import java.util.List;

public class Valuein4thIndex {
	public static void main(String[] args) {
		List<Integer> l=new LinkedList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
		l.add(700);
		
		
		System.out.println(l);
		Integer integer = l.get(4);
		System.out.println(integer);
		

}
}


