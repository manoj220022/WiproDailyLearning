import java.util.LinkedList;
import java.util.Scanner;
import java.util.ListIterator;


public class ReversedTaskQueue {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
        LinkedList<String> tasks = new LinkedList<>();

        System.out.println("Enter 4 task names:");
        for (int i = 0; i < 4; i++) {
            String task = scanner.nextLine();

          
            if (task.endsWith("!")) {
                tasks.addFirst(task);
            } else {
                tasks.addLast(task);
            }
        }

       
        System.out.println("Tasks in reverse order:");
        ListIterator<String> iterator = tasks.listIterator(tasks.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        scanner.close();
    }
		
	}


