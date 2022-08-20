package Collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> ts1=new TreeSet<String>();
		ts1.add("one");
		ts1.add("two");
		ts1.add("three");
		ts1.add("four");
		ts1.add("four");
		System.out.println(ts1);
		

	}

}
