package week1.Day8;

public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int numerator = 5;
            int denominator = 0;
            int result = numerator / denominator;

            int[] numbers = {1, 2, 3};
            int index = 5;
            int value = numbers[index];

            System.out.println("Result: " + result);
            System.out.println("Value at index " + index + ": " + value);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException: " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Exception occurred: " + e.getMessage());

        }finally {
            System.out.println("Finally block executed");
        }
    }
}
