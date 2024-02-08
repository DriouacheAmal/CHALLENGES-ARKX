package week1.Day9;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class C1ArrayOperations {
    public static void main(String[] args) {
        // initialize an array with values

        int[] array = {6,9,1,7,3,8};

        // Find & print the sum of all elements in the array

        int sum = 0;
        for (int num : array){
            sum += num;   // Equivalent to: sum = sum + num;

        }
        System.out.println("The summation of the array elements is :" + sum);

        // finding the Max and Min Values of the Array
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        // Print the results
        System.out.println("Max value :" + max);
        System.out.println("Min value :" + min);

        //Reverse the Array
        // The purpose of this line is to create a new array
        // that will store the reversed version of the original array

        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length -1 -i];
        }

        System.out.println("Reserved array : ");
        for (int num : reversedArray){
            System.out.println(num + " ");
        }
    }

}
