package week1.Day8;

import java.io.File;
import java.util.Scanner;

public class FileNotFoundException {
    public static void main(String[] args) {
        String fileName = "document.txt";
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);

        } scanner.close();

    } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found :" + fileName);
            e.printStackTrace();
        }
    }

}
