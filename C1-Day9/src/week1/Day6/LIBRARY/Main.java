package week1.Day6.LIBRARY;

public class Main {
    public void main(String[] args) {
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5", 1925);

        // Display original book information
        System.out.println("Original Book Information:");
        myBook.displayBookInfo();

        // Update book information using setters
        myBook.setTitle("To Kill a Mockingbird");
        myBook.setYearPublished(1960);

        // Display updated book information
        System.out.println("\nUpdated Book Information:");
        myBook.displayBookInfo();




    }

}
