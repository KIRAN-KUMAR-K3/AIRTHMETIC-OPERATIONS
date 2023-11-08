package FuncClass;

import java.util.Scanner;

public class FuncClass {
    public static void performFunctionalOperations(Scanner scanner) {
        while (true) {
            System.out.println("Functional Operations");
            System.out.println("1. Factorial");
            System.out.println("2. Sum Up to N");
            System.out.println("3. Check Even or Odd");
            System.out.println("4. Exit (Exiting submenu 3)");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    long factorial = calculateFactorial(num);
                    System.out.println("Factorial of " + num + " is: " + factorial);
                    break;
                case 2:
                    System.out.print("Enter a number (N): ");
                    int n = scanner.nextInt();
                    int sumUpToN = calculateSumUpToN(n);
                    System.out.println("Sum of numbers from 1 to " + n + " is: " + sumUpToN);
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    if (isEven(number)) {
                        System.out.println(number + " is even.");
                    } else {
                        System.out.println(number + " is odd.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting submenu 3.");
                    return; // Return to the main menu
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    public static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * calculateFactorial(num - 1);
    }

    public static int calculateSumUpToN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calculateSumUpToN(n - 1);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
