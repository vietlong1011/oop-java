package exercise_nine.job;

import exercise_nine.dto.Bill;
import exercise_nine.dto.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Functions {
    public ArrayList<Bill> billList;
    Scanner sc = new Scanner(System.in);

    public Functions() {
        this.billList = new ArrayList();
    }

    public Person addPerson() {
        System.out.print("Nhap ho ten khach hang: ");
        String namePerson = sc.nextLine();
        System.out.print("Nhap so nha cua khach hang: ");
        int homeNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ma so cong to dien: ");
        int electricNumber = Integer.parseInt(sc.nextLine());
        Person person = new Person(namePerson, homeNumber, electricNumber);
        return person;
    }

    public void addBill() {
        System.out.println("\n\tNhap thong tin ho su dung dien ");
        System.out.print("Nhap so ho can them: ");
        int billNumber = Integer.parseInt(this.sc.nextLine());
        for (int i = 1; i <= billNumber; ++i) {
            System.out.println("\nNhap thong tin khach hang thu " + i);
            boolean checkBill = true;
            while (checkBill) {
                Person person = addPerson();
                System.out.print("Nhap chi so dien cu: ");
                int electricOld = Integer.parseInt(sc.nextLine());
                System.out.print("Nhap chi so dien moi: ");
                int electricNew = Integer.parseInt(sc.nextLine());
                int prince = 1;
                if (electricNew > electricOld) {
                    prince = ((electricNew - electricOld) * 5);
                    checkBill = false;
                } else {
                    System.out.println("Gia tri khong hop le ,nhap lai");
                }
                Bill bill = new Bill(electricOld, electricNew, prince, person);
                this.billList.add(bill);
            }
        }

    }

    public void deleteBillPerson() {
        System.out.print("Nhap so nha can xoa : ");
        int delete = Integer.parseInt(this.sc.nextLine());
        boolean checkHome = true;
      for (int i = 0 ; i < billList.size();i++){
            // if (String.valueOf(delete).equals(String.valueOf(b.getPerson().getHomeNumber()))) {
            if (delete == billList.get(i).getPerson().getHomeNumber()) {
                this.billList.remove(billList.get(i));
                System.out.println("Delete successfully ");
                checkHome = false;
            }
        }
        if (checkHome) {
            System.out.println("Xoa that bai");
        }
    }

    public void display() {
        for (Bill b : billList) {
            System.out.println(b.toString());
        }
    }

}