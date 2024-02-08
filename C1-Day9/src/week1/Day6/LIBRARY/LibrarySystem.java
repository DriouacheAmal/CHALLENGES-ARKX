package week1.Day6.LIBRARY;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        FictionBook fictionBook = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5", 1925, "Classic");
        NonFictionBook nonFictionBook = new NonFictionBook("Sapiens", "Yuval Noah Harari", "978-0-06-231609-7", 2014, "History");

        library.addBook(fictionBook);
        library.addBook(nonFictionBook);

        library.displayAllBooks();

    }
}
