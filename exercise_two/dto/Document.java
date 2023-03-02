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

    @Override
    public String toString() {
        return String.format("%10s%20s%10d", documentID, publisher, numCopies);
    }

}

