package ordenacionYComparacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Grape");

		Collections.sort(fruits);
		System.out.println(fruits);
		
		
//		//Uso el mismo
//		Collections.sort(fruitList);
//		fruitList.forEach(fruit -> {
//		    System.out.println(fruit.getId() + " " + fruit.getName() + " " + 
//		      fruit.getTaste());
//		});
	}
	
	public class Fruit implements Comparable<Object>{
	    private int id;
	    private String name;
	    private String taste;

	    Fruit(int id, String name, String taste){
	        this.id=id;
	        this.name=name;
	        this.taste=taste;
	    }
	    @Override 
	    public int compareTo(Object o) {
	        Fruit f = (Fruit) o; 
	        return this.id - f.id ;
	    }
	}
	
	class SortByName implements Comparator<Fruit> {
	    @Override
	    public int compare(Fruit a, Fruit b) {
	        return a.getName().compareTo(b.getName());
	    }
	}
	//Uso
	Collections.sort(fruitList, new SortByName());
	
	
}
