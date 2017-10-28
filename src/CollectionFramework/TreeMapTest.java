package CollectionFramework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import Threading.Country;
import Threading.IdComparator;

public class TreeMapTest {
	
	public static void main(String[] args) {
		Map map = new TreeMap<>();
		map.put(101, "Data1");
		map.put(105, "Data1");
		map.put(103, "Data1");
		map.put(104, "Data1");
		map.put(102, "Data1");

		Set data =map.entrySet();
		System.out.println(data);
		
		Map<Country,Integer> id = new TreeMap<Country,Integer>();
		
		Country c1 = new Country(106,"aindia");
		Country c2 = new Country(102,"bindia");
		Country c3 = new Country(12,"cindia");
		Country c4 = new Country(131,"dindia");
		
		id.put(c1, 111);
		id.put(c2, 222);
		id.put(c3, 333);
		id.put(c4, 444);
		
		Set out = id.entrySet();
		System.out.println(out);
		
		
	}

}
