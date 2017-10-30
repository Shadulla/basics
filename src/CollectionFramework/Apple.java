package CollectionFramework;

import java.util.HashMap;

public class Apple
{
String color;
public Apple(String color) {
this.color=color;

}


@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (!(obj instanceof Apple)) {
		return false;
	}
	Apple other = (Apple) obj;
	if (color == null) {
		if (other.color != null) {
			return false;
		}
	} else if (!color.equals(other.color)) {
		return false;
	}
	return true;
}

public static void main(String[] args) {

	Apple a1 = new Apple("Red");
	Apple a2 = new Apple("Green");
	
	HashMap<Apple, Integer> hm= new HashMap<>();
	hm.put(a1, 10);
	hm.put(a2, 20);
	
	System.out.println(hm.get(new Apple("Green")));
	
}
}
