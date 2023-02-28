package exercise_one.job;

import exercise_one.dto.Cadres;
import exercise_one.dto.Personnel;

import java.util.ArrayList;
import java.util.Scanner;

public class ActionPersonel {
    static Scanner sc = new Scanner(System.in);
    private Cadres cadres;

    public ActionPersonel(Cadres cadres) {
        this.cadres = cadres;
    }
    public  void addPersonel(){
        System.out.print("Nhap name can them : ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi can them : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gioi tinh can them : ");
        String gender = sc.nextLine();
        System.out.print("Nhap dia chi can them : ");
        String address = sc.nextLine();
        System.out.print("Nhap cong viec cua cong nhan: ");
        String work = sc.nextLine();
        Cadres personnel = new Personnel(name, age, gender, address, work);
        cadres.add(personnel);
        System.out.println(personnel.toString());
    }
}



