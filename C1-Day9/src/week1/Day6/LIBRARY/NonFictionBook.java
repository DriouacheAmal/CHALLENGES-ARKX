package week1.Day6.LIBRARY;

public class NonFictionBook extends Book{

    public NonFictionBook(String title, String author, String isbn, int yearPublished, String history) {
        super(title, author, isbn, yearPublished);
        this.topic = topic;
    }
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    @Override
    public void displayBookInfo() {
        super.displayBookInfo();
        System.out.println("Topic: " + topic);
    }
}
