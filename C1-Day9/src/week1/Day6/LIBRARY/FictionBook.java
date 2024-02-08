package week1.Day6.LIBRARY;
  // INHERITANCE
public class FictionBook extends Book{

    public FictionBook(String title, String author, String isbn, int yearPublished, String classic) {
        super(title, author, isbn, yearPublished);
        this.genre = genre;

    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
      @Override
    public void displayBookInfo() {
        super.displayBookInfo();
        System.out.println("Genre: " + genre);
    }
}
