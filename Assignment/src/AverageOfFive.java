import java.util.Scanner;


public class AverageOfFive {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[5];
	        int sum = 0;

	
	        System.out.println("Enter 5 numbers:");
	        for (int i = 0; i < 5; i++) {
	            numbers[i] = scanner.nextInt();

	            
	            if (numbers[i] < 10) {
	                numbers[i] = numbers[i] * 2;
	            }

	           
	            sum += numbers[i];
	        }

	        
	        double average = sum / 5.0;

	       
	        System.out.println("Average after replacing numbers < 10 with double: " + average);

	        scanner.close();
	    }
		
	}


