package exercise_one.job;

import exercise_one.dto.Cadres;
import exercise_one.dto.Employee;
import exercise_one.dto.Engineer;

import java.util.ArrayList;
import java.util.Scanner;

public class ActionEngineer {
    static Scanner sc = new Scanner(System.in);
    private Cadres cadres;
    public ActionEngineer(Cadres cadres) {
        this.cadres = cadres;
    }
    public  void addEngineer(){
        System.out.print("Nhap name can them : ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi can them : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gioi tinh can them : ");
        String gender = sc.nextLine();
        System.out.print("Nhap dia chi can them : ");
        String address = sc.nextLine();
        System.out.print("Nhap cong viec cua cong nhan: ");
        String classTraining = sc.nextLine();
        Cadres engineer = new Engineer(name, age, gender, address, classTraining);
        cadres.add(engineer);
        System.out.println(engineer.toString());
    }
}
