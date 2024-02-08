package week2.Day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String FILE_PATH = "storyinprogress.txt";

    public static Story loadStoryTrack() {
        Story story = new Story();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("storyinprogress.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(" : ");
                if (parts.length == 2) {
                    String author = parts[0];
                    String text = parts[1];
                    story.addSentence(text, author);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return story;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Story story = loadStoryTrack();

        System.out.println(story.toString());
        System.out.println("Welcome to the Storyteller.");

        while (true) {
            System.out.print("Enter your sentence: ");
            String sentenceText = scanner.nextLine();

            System.out.print("Enter your name: ");
            String authorName = scanner.nextLine();

            story.addSentence(sentenceText, authorName);

            story.saveProgressToFile(story);

            System.out.print("Do you want to save the story? (yes/no): ");
            String saveChoice = scanner.nextLine().toLowerCase();
            if (saveChoice.equals("yes")) {
                story.saveProgressToFile(story);
                System.out.println("Story saved successfully!");
            } else {
                System.out.println("Story not saved. Try again.");
            }

            System.out.print("Do you want to add another sentence? (yes/no): ");
            String continueChoice = scanner.nextLine().toLowerCase();
            if (!continueChoice.equals("yes")) {
                System.out.println("Exiting the program!");

                System.out.println("This is the story using load progress");
                //story.loadProgress("storyprogress.txt");

                break;
            }
        }
        scanner.close();
    }
}