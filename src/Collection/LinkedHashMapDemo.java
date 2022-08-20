package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map=new LinkedHashMap<Integer, String>();
		
		map.put(100, "one");
		map.put(200, "two");
		map.put(400, "four");
		map.put(300, "three");

		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
