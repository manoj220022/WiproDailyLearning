
import java.util.ArrayDeque;
import java.util.Scanner;

public class Last3Searches {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        ArrayDeque<String> searchHistory = new ArrayDeque<>();

        System.out.println("Type search terms :");

        while (true) {
            String term = sc.nextLine();

            if (term.equalsIgnoreCase("exit")) {
                break;
            }

            
            if (searchHistory.size() == 3) {
                searchHistory.pollFirst();  
            }

         
            searchHistory.addLast(term);

       
            System.out.println("Last 3 searches:");
            for (String t : searchHistory) {
                System.out.println("- " + t);
            }
            System.out.println();
        }

        sc.close();
	}

}
