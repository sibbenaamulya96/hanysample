package org.list;

import java.util.ArrayList;
import java.util.List;

public class RemovValue2ndIndx {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		System.out.println(l);
		Integer remove = l.remove(2);
		System.out.println(remove);
		System.out.println("after removing value:"+l);
	}
//hany made changes
}
