package exercise_two.dto;

public class Magazine extends Document {
    private int issueNum;
    private int month;

    public Magazine(String documentID, String publisher, int numCopies, int issueNum, int month) {
        super(documentID, publisher, numCopies);
        this.issueNum = issueNum;
        this.month = month;
    }
    public int getIssueNum() {
        return issueNum;
    }
    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    @Override
    public String toString() {
       return super.toString() + String.format("%5d%5d",issueNum, month);
    }
}

