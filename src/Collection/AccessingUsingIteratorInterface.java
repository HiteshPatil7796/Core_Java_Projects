package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class AccessingUsingIteratorInterface {

	public static void main(String[] args) {
	
		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		
		Iterator obj=list1.iterator(); // iterator interface  for accesing elements of collection
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}

	}

}
