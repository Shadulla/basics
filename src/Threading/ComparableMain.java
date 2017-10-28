package Threading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {

		Country c1 = new Country(106,"aindia");
		Country c2 = new Country(102,"bindia");
		Country c3 = new Country(12,"cindia");
		Country c4 = new Country(131,"dindia");
		
		List<Country> listOfCountry = new ArrayList<Country>();
		listOfCountry.add(c1);
		listOfCountry.add(c2);
		listOfCountry.add(c3);
		listOfCountry.add(c4);
		
		Collections.sort(listOfCountry);
		
		System.out.println("After sorting the data is:");
		
		for(Country data :listOfCountry)
		{
			System.out.println(data.getCountryName());
		}
		
		Collections.sort(listOfCountry,new NameComparatorLearning());
		
		System.out.println("After using comparatot");
		
		for(Country country : listOfCountry)
		{
			System.out.println(country.getCountryName());
		}
		
		System.out.println("After sorting by Id");
		
		Collections.sort(listOfCountry,new IdComparator());
		
		for(Country country : listOfCountry)
		{
			System.out.println(country.getCountryId());
		}

	}

}
