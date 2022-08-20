package Collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> set1=new HashSet<String>();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("C"); // avoids duplicate aplphabet 
		set1.add("D");
		set1.add("E");
		set1.add("F");
		System.out.println(set1);
		

	}

}
