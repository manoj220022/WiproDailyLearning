import java.util.ArrayList;
import java.util.Collections;

public class Arraylist1_examples {

	public static void main(String[] args) {

		ArrayList<String>  fruits = new ArrayList<>();
		
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grape");
		
		fruits.add(1, "new Apple");
		
		for(String f1:fruits)
		{
			System.out.println(f1);
		}
		
		fruits.get(3);
		
		fruits.set(2, "xyz");
		
		fruits.remove(0);
		
		fruits.contains("Mango");
		
		fruits.size();
		
		fruits.clear();
		
		
		Collections.sort(fruits);
		
	}

}
