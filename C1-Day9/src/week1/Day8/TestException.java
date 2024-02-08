package week1.Day8;

public class TestException {

    public static void main(String[] args) {
        try {
            validateInput("Invalid");

        } catch (CustomException e) {
            System.out.println("Error :" + e.getMessage());

        }
    }

    public static void validateInput(String input) throws CustomException {
            if (input.equals("invalid")) {
                throw new CustomException("Invalid Input Detected.");

            }
        }
    }



