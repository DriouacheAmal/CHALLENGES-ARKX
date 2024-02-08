package week1.Day8;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            String nullString = null;
            int length = nullString.length();

            System.out.println("Length of the string: " + length);
        }catch (NullPointerException e){
            System.out.println("NullPointerException: " + e.getMessage());
            System.out.println("Please make sure the reference is not null before accessing its properties.");

        }finally {
            System.out.println("Finally executed");
        }
    }
}
