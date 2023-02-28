package exercise_two.dto;

public class Document {
    private String documentID;
    private String publisher;
    private int numCopies;
    public Document() {

    }
    public Document(String documentID, String publisher, int numCopies) {
        this.documentID = documentID;
        this.publisher = publisher;
        this.numCopies = numCopies;
    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getNumCopies() {
        return numCopies;
    }
    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }
    @Override
    public String toString() {
        return String.format("%10s%20s%5d", documentID, publisher, numCopies);
    }

}

