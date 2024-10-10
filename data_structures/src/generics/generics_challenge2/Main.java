package generics.generics_challenge2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String option;
        System.out.println("Welcome! What would you like to do?\n 1. Compare numbers (maximum)\n 2. Compare numbers (minimum)\n 3. Exit");
        option = scanner.next();

        switch (option) {
            case "1":
                System.out.println("Enter five numbers to find the maximum:");
                System.out.print("Number 1: ");
                int num1Max = scanner.nextInt();
                System.out.print("Number 2: ");
                int num2Max = scanner.nextInt();
                System.out.print("Number 3: ");
                int num3Max = scanner.nextInt();
                System.out.print("Number 4: ");
                int num4Max = scanner.nextInt();
                System.out.print("Number 5: ");
                int num5Max = scanner.nextInt();

                System.out.println("The maximum value is: " + CompareNumbers.maximum(num1Max, num2Max, num3Max, num4Max, num5Max));
                break;

            case "2":
                System.out.println("Enter five numbers to find the minimum:");
                System.out.print("Number 1: ");
                int num1Min = scanner.nextInt();
                System.out.print("Number 2: ");
                int num2Min = scanner.nextInt();
                System.out.print("Number 3: ");
                int num3Min = scanner.nextInt();
                System.out.print("Number 4: ");
                int num4Min = scanner.nextInt();
                System.out.print("Number 5: ");
                int num5Min = scanner.nextInt();

                System.out.println("The minimum value is: " + CompareNumbers.minimum(num1Min, num2Min, num3Min, num4Min, num5Min));
                break;

            case "3":
                System.out.println("Goodbye!");
                break;

            default:
                System.out.println("Invalid option. Please choose a valid option.");
                break;
        }
    }
}
