import java.util.LinkedList;
public class Linkedlist_Examples {

	public static void main(String[] args) {
		
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("RJY");
		cities.add("Hyd");
		cities.addFirst("FirstCity");
		cities.addLast("Lastcity");
		
		
		cities.get(2);
		
		cities.removeFirst();
		
		cities.set(0, "0 City");
		
		cities.size()
;
		cities.clear();
	} 
}
