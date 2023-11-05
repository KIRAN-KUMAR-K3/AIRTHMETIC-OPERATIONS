package MainPack;
import java.util.Scanner;

import MainPack.ArithClass.ArithClass;
import MainPack.FuncClass.FuncClass;
import MainPack.RelatePack.RelateClass;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Main menu");
            System.out.println("1. Arithmetic operations");
            System.out.println("2. Relational operations");
            System.out.println("3. Functional operations");
            System.out.println("4. Exit (Exiting Main menu)");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ArithClass.performArithmeticOperations(scanner);
                    break;
                case 2:
                    RelateClass.performRelationalOperations(scanner);
                    break;
                case 3:
                    FuncClass.performFunctionalOperations(scanner);
                    break;
                case 4:
                    System.out.println("Exiting Main menu. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
