package org.list;

import java.util.LinkedList;
import java.util.List;

public class ValueOf8thIndex {
	public static void main(String[] args) {
		List<Integer> l=new LinkedList<>();
		l.add(105);
		l.add(205);
		l.add(305);
		l.add(405);
		l.add(505);
		l.add(605);
		l.add(705);
		l.add(805);
		System.out.println(l);
		Integer integer = l.get(8);
		System.out.println(integer);
	
}

}
