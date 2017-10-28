package Threading;

import java.util.Comparator;

public class IdComparator implements Comparator<Country> {

	
	public int compare(Country o1, Country o2) {
		
		if(o1.getCountryId() == o2.getCountryId())
		{
			return 0;
		}
		else if(o1.getCountryId() < o2.getCountryId())
		{
			return 1;
		}
		return -1;
	}

	
}
