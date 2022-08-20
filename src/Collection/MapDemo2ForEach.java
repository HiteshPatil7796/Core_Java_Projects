package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2ForEach {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer, String>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
