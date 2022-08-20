package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		System.out.println(set);
		

	}

}
