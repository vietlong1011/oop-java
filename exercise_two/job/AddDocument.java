package exercise_two.job;

import exercise_two.action.Function;
import exercise_two.dto.Books;
import exercise_two.dto.Document;
import exercise_two.dto.Magazine;
import exercise_two.dto.Newspaper;

import java.util.Scanner;

public class AddDocument {
    private Function function;
    static Scanner sc = new Scanner(System.in);
    public AddDocument(Function function){
        this.function = function;
    }
    public  void addBooks(){
        System.out.print("Nhap ma sach :");
        String documentID = sc.nextLine();
        System.out.print("Nhap Ten nha xuat ban :");
        String publisher = sc.nextLine();
        System.out.print("Nhap So ban phat hanh :");
        int numCopies = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap Ten tac gia :");
        String author = sc.nextLine();
        System.out.print("Nhap So trang :");
        int numPages = Integer.parseInt(sc.nextLine());
        Document books = new Books(documentID,publisher,numCopies,author,numPages);
        this.function.addDocument(books);
        System.out.println(books.toString());
    };
    public void addMagazine(){
        System.out.print("Nhap ma tap chi :");
        String documentID = sc.nextLine();
        System.out.print("Nhap Ten nha xuat ban :");
        String publisher = sc.nextLine();
        System.out.print("Nhap So ban phat hanh :");
        int numCopies = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap So phat hanh :");
        int issueNum = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap Thang phat hanh :");
        String month =sc.nextLine();
        Document magazine= new Magazine(documentID,publisher,numCopies,issueNum,month);
        this.function.addDocument(magazine);
        System.out.println(magazine.toString());
    };
    public void addNewspaper(){
        System.out.print("Nhap ma bao :");
        String documentID = sc.nextLine();
        System.out.print("Nhap Ten nha xuat ban :");
        String publisher = sc.nextLine();
        System.out.print("Nhap So ban phat hanh :");
        int numCopies = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap Ngay phat hanh :");
        String date = sc.nextLine();
        Document newspaper = new Newspaper(documentID,publisher,numCopies,date);
        this.function.addDocument(newspaper);
        System.out.println(newspaper.toString());
    };

}
