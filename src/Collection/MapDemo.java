package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map map=new HashMap();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3,"Three");
		map.put(4, "Four");
		map.put(4, "Five"); // it ovverides value of four 
		
		Set set=map.entrySet();
		Iterator obj=set.iterator();
		while(obj.hasNext())
		{
			Map.Entry e=(Map.Entry)obj.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
