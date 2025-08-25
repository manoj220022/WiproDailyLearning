import java.util.Scanner;
import java.util.Stack;



public class UndoTask {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        Stack<String> commandStack = new Stack<>();

        System.out.println("Enter 3 commands:");
        for (int i = 0; i < 3; i++) {
            String command = scanner.nextLine();
            commandStack.push(command);
        }

       
        String undoneCommand = commandStack.pop();
        System.out.println("\nUndo command: " + undoneCommand);

   
        String reversed = new StringBuilder(undoneCommand).reverse().toString();
        commandStack.push(reversed);
        System.out.println("Redo (reversed) command: " + reversed);

       
        System.out.println("\nFinal Stack (Top to Bottom):");
        for (int i = commandStack.size() - 1; i >= 0; i--) {
            System.out.println("- " + commandStack.get(i));
        }

        scanner.close();
	}

}
