package RelatePack;

import java.util.Scanner;

public class RelateClass {
    public static void performRelationalOperations(Scanner scanner) {
        while (true) {
            System.out.println("Relational Operations");
            System.out.println("1. Check Greater");
            System.out.println("2. Check Smaller");
            System.out.println("3. Check Equal");
            System.out.println("4. Exit (Exiting submenu 2)");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            double num1, num2;

            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    if (num1 > num2) {
                        System.out.println(num1 + " is greater than " + num2);
                    } else {
                        System.out.println(num1 + " is not greater than " + num2);
                    }
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    if (num1 < num2) {
                        System.out.println(num1 + " is smaller than " + num2);
                    } else {
                        System.out.println(num1 + " is not smaller than " + num2);
                    }
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    if (num1 == num2) {
                        System.out.println(num1 + " is equal to " + num2);
                    } else {
                        System.out.println(num1 + " is not equal to " + num2);
                    }
                    break;
                case 4:
                    System.out.println("Exiting submenu 2.");
                    return; // Return to the main menu
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
