package week1.Day8;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println(" The entered number is :" + number);
        }catch (java.lang.NumberFormatException e){
            System.out.println("Invald input. Please enter a valid integer.");
        }
        scanner.close();



    }

}
