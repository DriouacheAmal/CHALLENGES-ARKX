package week1.Day8;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String id = null;
        try {
            if (id!= null){
                int length = id.length();
                System.out.println("Length of the string: " + length);
            } else {
                throw new NullPointerException("String is null");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());


        }
    }
}
