package org.list;

import java.util.List;
import java.util.Vector;

public class ValuesVctr {
public static void main(String[] args) {
	List<Integer>l=new Vector<>();
	l.add(105);
	l.add(205);
	l.add(305);
	l.add(405);
	l.add(505);
	l.add(605);
	l.add(705);
	l.add(805);
	System.out.println(l);
	int size = l.size();
	System.out.println(size);
}
}
//105,205,305,405,505,605,705,805