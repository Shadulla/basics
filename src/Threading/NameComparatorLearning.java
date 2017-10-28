package Threading;

import java.util.Comparator;

public class NameComparatorLearning implements Comparator<Country>{

	
	public int compare(Country c1, Country c2) {
		return c1.countryName.compareTo(c2.countryName);
	}

}
