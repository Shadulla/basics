package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	
	public static void main(String[] args) {
		Map<Integer, String> data= new HashMap<>();
		data.put(101, "Shadulla");
		data.put(102, "dShadulla");
		data.put(103, "cShadulla");
		data.put(104, "bShadulla");
		data.put(101, "Overridevalue");
		data.put(105, "aShadulla");
		
		Set entityData =data.entrySet();
		Set keySet = data.keySet();
		Iterator itr = entityData.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Iterator itr1= keySet.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
				
	}

}
