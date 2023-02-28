package exercise_two.dto;

public class Newspaper extends Document {
    private int date;

    public Newspaper(String documentID, String publisher, int numCopies, int date) {
        super(documentID, publisher, numCopies);
        this.date = date;
    }
    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("%5d", date);
    }
}
