package exercise_four.dto;

import java.util.ArrayList;
import java.util.Scanner;

public class Town {
    ArrayList<Family> families;
    public static Scanner sc = new Scanner(System.in);

    public Town() {
        this.families = new ArrayList<Family>();
    }

    public void add() {
        System.out.print("Nhap so ho gia dinh: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho ho gia dinh thu " + (i + 1));
            System.out.print("So thanh vien: ");
            int numberPerson = Integer.parseInt(Town.sc.nextLine());
            System.out.print("So nha: ");
            int apartmentNumber = Integer.parseInt(Town.sc.nextLine());
            ArrayList<Person> personArrayList = new ArrayList<Person>();
            for (int j = 0; j < numberPerson; j++) {
                System.out.println("Nhap thong tin cho thanh vien thu " + (j + 1));
                System.out.print("Ho ten: ");
                String namePerson = sc.nextLine();
                System.out.print("Tuoi: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.print("Nghe nghiep: ");
                String job = sc.nextLine();
                System.out.print("So CMND: ");
                int idCart = Integer.parseInt(sc.nextLine());
                String strIdCart = String.valueOf(idCart);
                this.isValidIdCart(strIdCart);
                if (isValidIdCart(strIdCart) == false) {
                    System.out.println("SO CMND Da Ton Tai hoac Khong Hop Le");
                    j--;
                    continue;
                }
                Person person = new Person(namePerson, age, job, idCart);
                personArrayList.add(person);
            }
            Family family = new Family(numberPerson,apartmentNumber,personArrayList);
            families.add(family);
        }
    }

    public void hienThiThongTin() {
        System.out.println("Danh sach cac ho gia dinh trong khu pho:");
        for (Family family : families) {
            System.out.println("So nha: " + family.getApartmentNumber());
            System.out.println("So thanh vien: " + family.getApartmentNumber());
            ArrayList<Person> personArrayList = family.getPersonList();
            for (Person person : personArrayList) {
                System.out.println("Thong tin thanh vien:");
                System.out.println("Ho ten: " + person.getNamePerson());
                System.out.println("Tuoi: " + person.getAge());
                System.out.println("Nghe nghiep: " + person.getJob());
                System.out.println("So CMND: " + person.getIdCart());
            }
        }
    }

    public boolean isValidIdCart(String idCartStr) {
        // Kiểm tra độ dài của số CMND
        if (idCartStr.length() != 9) {
            return false;
        }
        // Kiểm tra các kí tự trong số CMND có phải là số hay không
        for (int i = 0; i < idCartStr.length(); i++) {
            if (!Character.isDigit(idCartStr.charAt(i))) {
                return false;
            }
        }
        // Kiểm tra số CMND không trùng nhau
        for (int i = 0; i < idCartStr.length() - 1; i++) {
            for (int j = i + 1; j < idCartStr.length(); j++) {
                if (idCartStr.charAt(i) == idCartStr.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}


