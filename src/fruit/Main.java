package fruit;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		fl.add(new Fruit(101,"Apple",1000));
		fl.add(new Fruit(102,"Banana",200));
		fl.add(new Fruit(103,"Grape",50));
		fl.add(new Fruit(104,"Mango",888));
		fl.add(new Fruit(105,"Peach",999));
		fl.add(new Fruit(106,"Plum",55));
		fl.add(new Fruit(107,"Pineapple",123));
		fl.add(new Fruit(108,"Kiwi",818));
		fl.add(new Fruit(109,"Orange",923));
		fl.add(new Fruit(110,"Melon",102));
		
		Collections.sort(fl,new FruitComparator());
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		for(int i=0; i<fl.size();i++) {
			System.out.println(fl.get(i).toString());
		}
	}
	
	
}
