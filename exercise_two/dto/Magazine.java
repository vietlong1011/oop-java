package exercise_two.dto;

public class Magazine extends Document {
    private int issueNum;
    private String month;

    public Magazine(String documentID, String publisher, int numCopies, int issueNum, String month) {
        super(documentID, publisher, numCopies);
        this.issueNum = issueNum;
        this.month = month;
    }
    @Override
    public String toString() {
       return super.toString() + String.format("%5d%15s",issueNum, month);
    }
}

