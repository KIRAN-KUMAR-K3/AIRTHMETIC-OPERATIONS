package ArithClass;
import java.util.Scanner;
public class ArithClass {
    public static void performArithmeticOperations(Scanner scanner) {
        while (true) {
            System.out.println("Arithmetic Operations");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modular Division");
            System.out.println("6. Exit (Exiting submenu 1)");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            double num1, num2, result;

            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    System.out.println("Addition result: " + result);
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.println("Subtraction result: " + result);
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.println("Multiplication result: " + result);
                    break;
                case 4:
                    System.out.print("Enter the dividend: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the divisor: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Division result: " + result);
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
                case 5:
                    System.out.print("Enter the dividend: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the divisor: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 % num2;
                        System.out.println("Modular Division result: " + result);
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting submenu 1.");
                    return; // Return to the main menu
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
