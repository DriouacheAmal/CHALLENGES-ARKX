package week2.Day11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Story implements Serializable {
    private final List<Sentence> sentenceList;

    // constructor
    public Story() {
        this.sentenceList = new ArrayList<>();
    }

    public void addSentence(String text, String author) {
        Sentence Sentence = new Sentence(text, author);
        sentenceList.add(Sentence);
        // saveProgressToFile("progressiveness.txt");

    }

    public List<Sentence> getSentenceList() {
        return sentenceList;
    }

    @Override
    public String toString() {
        String result = "";
        for (Sentence sentence : sentenceList) {
            result += sentence.toString();
        }
        return result;
    }

    public void saveProgressToFile(Story story) {
        try (FileWriter writer = new FileWriter("storyinprogress.txt")) {
            // ObjectOutputStream.writeObject(story);
            for (Sentence sentence : sentenceList) {
                writer.write(sentence.getAuthor() + " : " + sentence.getText() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // SWITCH ObjectInputStream to Buffer reader
    /*public void loadStoryTrack() {

       /* try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("storyinprogress.txt"))) {
            return (Story) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("storyinprogress.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }*/

}





