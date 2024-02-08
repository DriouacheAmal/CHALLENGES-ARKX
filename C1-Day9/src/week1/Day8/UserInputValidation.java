package week1.Day8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Please enter a positive integer.");
                number = scanner.nextInt();
                if (number > 0) {
                    validInput = true;
                } else {
                    System.out.println("Input must be a positive integer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid positive integer.");
                scanner.nextLine(); // Clear the input buffer
            }

        }
        System.out.println("You entered: " + number);
        scanner.close();
    }
}
