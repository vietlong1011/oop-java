package exercise_two.action;

import exercise_two.dto.Books;
import exercise_two.dto.Document;
import exercise_two.dto.Magazine;
import exercise_two.dto.Newspaper;

import java.util.ArrayList;

public class Function {
  ArrayList<Document> documents;

    public Function() {
        this.documents = new ArrayList<>();
    }
    public void addDocument(Document document) {
        // kiem tra ma tai lieu da ton tai chua de add
        boolean exists = false;
        for (Document d : this.documents) {
            if (d.getDocumentID().equals(document.getDocumentID())) {
                exists = true;
                break;
            }
        }
        if (exists) {
            System.out.println("Mã tài liệu đã tồn tại!");
        } else {
            this.documents.add(document);
        }
    }

    public void deleteDocumentByID(String documentID) {
        for (int i = 0; i < documents.size(); i++) {
            Document d = documents.get(i);
            if (d.getDocumentID().equals(documentID)) {
                documents.remove(i);
                System.out.println("Document with ID " + documentID + " has been deleted.");
                return;
            }
        }
        System.out.println("Document with ID " + documentID + " does not exist.");
    }

    public void display() {
        for (Document d : documents) {
            System.out.println(d.toString());
        }
    }

    public void searchBooks() {
        for (Document d : documents) {
            if (d instanceof Books) {
                System.out.println(d.toString());
            }
        }
    }

    public void searchMagazines() {
        for (Document d : documents) {
            if (d instanceof Magazine) {
                System.out.println(d.toString());
            }
        }
    }

    public void searchNewspapers() {
        for (Document d : documents) {
            if (d instanceof Newspaper) {
                System.out.println(d.toString());
            }
        }
    }

}
