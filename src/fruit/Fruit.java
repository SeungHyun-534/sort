package fruit;
import java.util.*;

public class Fruit {

	int no;
	String name;
	int price;
	
	public Fruit(int no,String name,int price) {
		this.no = no;
		this.name = name;
		this.price = price;
	}

}

class FruitComparator implements Comparator<Fruit>{
	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
}

class FruitComparatorDesc implements Comparator<Fruit>{
	@Override
	public int compare(Fruit o1,Fruit o2) {
		return o2.name.compareTo(o2.name);
	}
}


