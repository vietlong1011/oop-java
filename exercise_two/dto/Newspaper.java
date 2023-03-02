package exercise_two.dto;

public class Newspaper extends Document {
    private String date;

    public Newspaper(String documentID, String publisher, int numCopies, String date) {
        super(documentID, publisher, numCopies);
        this.date = date;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("%5s", date);
    }
}
