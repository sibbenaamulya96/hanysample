package org.list;

import java.util.ArrayList;
import java.util.List;

public class RemovValueat10thIndx {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		System.out.println(l);
		Integer remove = l.remove(10);
		System.out.println(remove);
		System.out.println("after removing value:"+l);
//		10,20,30,90,10,10,40
	}
}
