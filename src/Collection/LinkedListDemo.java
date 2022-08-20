package Collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String>l1=new LinkedList<String>();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l1.addFirst("A");
		l1.addLast("Z");
		System.out.println(l1);
		
		LinkedList<Integer>l2=new LinkedList<Integer>();
		l2.add(1);
		l2.add(3);
		l2.add(4);
		System.out.println(l2);
		
		LinkedList<Integer>l3=new LinkedList<Integer>();
		l3.add(7);
		l3.add(7);
		l3.add(9);
		l3.add(6);
		System.out.println(l3);
		l2.addAll(l3);
		System.out.println(l2);
		

	}

}
