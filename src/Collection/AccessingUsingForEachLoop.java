package Collection;

import java.util.ArrayList;

public class AccessingUsingForEachLoop {

	public static void main(String[] args) {
		
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("One");
		l1.add("Two");
		l1.add("Three");
		l1.add("Four");
		
		for(String str:l1) // for each loop
		{
			System.out.println(str);
		}

	}

}
