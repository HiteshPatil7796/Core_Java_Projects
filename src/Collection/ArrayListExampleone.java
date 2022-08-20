package Collection;

import java.util.*;

public class ArrayListExampleone {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Mango");
		list1.add("Chiku");
		
		System.out.println(list1);
		list1.add(1,"orange");
		System.out.println(list1);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(7);
		list2.add(7);
		list2.add(9);
		list2.add(6);
		System.out.println(list2);
		
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("Hitesh");
		list3.add("Patil");
		
		list1.addAll(list3);
		System.out.println(list1);
		
		System.out.println(list1.size());
	}

}
