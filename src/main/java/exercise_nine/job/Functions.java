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
        Person person = new Person();
        System.out.print("Nhap ho ten khach hang: ");
        person.setNamePerson(this.sc.nextLine());
        System.out.print("Nhap so nha cua khach hang: ");
        person.setHomeNumber(Integer.parseInt(this.sc.nextLine()));
        System.out.print("Nhap ma so cong to dien: ");
        person.setElectricNumber(Float.parseFloat(this.sc.nextLine()));
        System.out.println("Person : " + String.valueOf(person));
        return person;
    }

    public void addBill() {
        Bill bill = new Bill();
        System.out.println("\n\tNhap thong tin ho su dung dien ");
        System.out.print("Nhap so ho can them: ");
        int billNumber = Integer.parseInt(this.sc.nextLine());

        for (int i = 1; i <= billNumber; ++i) {
            System.out.println("\nNhap thong tin khach hang thu " + i);
            bill.setPerson(this.addPerson());
            boolean checkBill = true;

            while (checkBill) {
                System.out.print("Nhap chi so dien cu: ");
                bill.setElectricOld(Integer.parseInt(this.sc.nextLine()));
                System.out.print("Nhap chi so dien moi: ");
                bill.setGetElectricNew(Integer.parseInt(this.sc.nextLine()));
                if (bill.getGetElectricNew() > bill.getElectricOld()) {
                    bill.setPrice((bill.getGetElectricNew() - bill.getElectricOld()) * 5);
                    checkBill = false;
                } else {
                    System.out.println("Gia tri khong hop le ,nhap lai");
                }
            }

            this.billList.add(bill);
        }

    }
    // vong lap dang chet o doi tuong xoa?
    public void deleteBillPerson() {
        System.out.print("Nhap so nha can xoa : ");
        int delete = Integer.parseInt(this.sc.nextLine());
        boolean check = true;
        while (check ) {
            for (Bill b : billList) {
                if (String.valueOf(delete).equals(String.valueOf(b.getPerson().getHomeNumber()))) {
                    this.billList.remove(b);
                    System.out.println("Delete successfully " + String.valueOf(b));
                    check = false;
                    break;
                } else {
                    System.out.println("Khach hang khong ton tai " + delete + "and" + b.getPerson().getHomeNumber());
                }
            }
        }
        for (Bill b : billList) {
            System.out.println(b.toString());
        }
    }

    public void display() {
        for (Bill b : billList) {
            System.out.println(b.toString());
        }
    }


    public void editBillPerson() {
    }
}