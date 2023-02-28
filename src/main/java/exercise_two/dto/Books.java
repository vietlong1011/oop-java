package exercise_two.dto;

public class Books extends  Document{
    private String author;
    private int numPages;

    public Books(String documentID, String publisher, int numCopies, String author, int numPages) {
        super(documentID, publisher, numCopies);
        this.author = author;
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("%10s%5d",author, numPages);
    }
}
