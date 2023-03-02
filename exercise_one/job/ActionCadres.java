package exercise_one.job;

import exercise_one.dto.Cadres;
import exercise_one.dto.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class ActionCadres {
    static Scanner sc = new Scanner(System.in);
    public  ArrayList<Cadres> cadresList = new ArrayList<>();

    public Cadres addCadres(){
        System.out.print("Nhap name can them : ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi can them : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gioi tinh can them : ");
        String gender = sc.nextLine();
        System.out.print("Nhap dia chi can them : ");
        String address = sc.nextLine();
        Cadres cadres = new Cadres(name,age,gender,address);
        return cadres;
    }
    public void add(Cadres cadres) {
        this.cadresList.add(cadres);
    }
    public void searchByName(String name) {
        boolean found = false;
        for (Cadres c : cadresList) {
            if ( c.getName().equalsIgnoreCase(name)) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay nhan vien ten " + name);
        }
    }

    public void display() {
        for (Cadres e : cadresList) {
            System.out.println(e.toString());
        }
    }
}
