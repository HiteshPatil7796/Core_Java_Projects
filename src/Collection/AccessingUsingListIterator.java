package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class AccessingUsingListIterator {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		
		System.out.println("Forward : ");
		ListIterator<String> obj=list1.listIterator();
		while(obj.hasNext())   // forward direction
		{
			System.out.print(obj.next()+" ");
		}
		
		System.out.println("\nBackword : ");
		while(obj.hasPrevious()) // backward direction
		{
			System.out.print(obj.previous()+" ");
		}

	}

}
