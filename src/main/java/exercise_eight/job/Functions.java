package exercise_eight.job;

import exercise_eight.dto.SinhVien;
import exercise_eight.dto.TheMuon;

import java.util.ArrayList;
import java.util.Scanner;

public class Functions {
    public ArrayList<TheMuon> theMuonList;
    static Scanner sc = new Scanner(System.in);

    public Functions() {
        this.theMuonList = new ArrayList<>();
    }

    public SinhVien addSinhVien() {
        System.out.println("\tThem Sinh Vien ");
        System.out.print("Nhap ho ten sinh vien : ");
        String name = sc.nextLine();
        System.out.print("Nhao tuoi cua sinh vien : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap lop cua sinh vien : ");
        String classStudent = sc.nextLine();
        SinhVien sinhVien = new SinhVien(name, age, classStudent);
        return sinhVien;
    }

    public void addTheMuon() {
        System.out.println("\n\tThem Danh Sach Phieu Muon : ");
        System.out.print("Nhap ma phieu muon : ");
        int idCart = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ngay muon : ");
        String dateStart = sc.nextLine();
        System.out.print("Nhap ngay het han : ");
        String dateEnd = sc.nextLine();
        System.out.print("Nhap so hieu sach : ");
        String idBook = sc.nextLine();
        SinhVien sinhVien = addSinhVien();
        TheMuon theMuon = new TheMuon(idCart, dateStart, dateEnd, idBook, sinhVien);
        theMuonList.add(theMuon);
    }

    public void deleteTheMuon() {
        System.out.print("Nhap phieu can xoa theo ma phieu muon : ");
        int deleteID = Integer.parseInt(sc.nextLine());
        for (TheMuon t : theMuonList) {
            if (String.valueOf(deleteID).equalsIgnoreCase(String.valueOf(t.getIdCart()))) {
                theMuonList.remove(t);
                System.out.println("Delete successful");
            }
        }
    }

    public void display() {
        for (TheMuon t : theMuonList) {
            System.out.println(t.toString());
        }
    }

    public static void main(String[] args) {
        Functions functions = new Functions();
        System.out.print("Nhap so luong sinh vien :");
        int numberStudent = Integer.parseInt(sc.nextLine());
        for (int i =0;i < numberStudent ; i++){
            functions.addTheMuon();
        }
        functions.deleteTheMuon();
        functions.display();
    }
}
