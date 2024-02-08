package week1.Day6.LIBRARY;

import java.util.ArrayList;
import java.util.List;
  // polymorphism allow different types of books to be stored in the library
public class Library {
    private List<Book> bookList;

    public Library(){
        this.bookList = new ArrayList<>();
    }
    public void addBook(Book book) {
        bookList.add(book);
    }

    public void displayAllBooks() {
        System.out.println("Library Book Collection:");
        for (Book book : bookList) {
            book.displayBookInfo();
            System.out.println("--------------------");

        }
    }

}
