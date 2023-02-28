package exercise_one.job;

import exercise_one.dto.Cadres;
import exercise_one.dto.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class ActionEmployee {
    static Scanner sc = new Scanner(System.in);
     private Cadres cadres;

    public ActionEmployee(Cadres cadres) {
        this.cadres = cadres;
    }

    public void AddEmployee(){
        System.out.print("Nhap name can them : ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi can them : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gioi tinh can them : ");
        String gender = sc.nextLine();
        System.out.print("Nhap dia chi can them : ");
        String address = sc.nextLine();
        System.out.print("Nhap cap  cua cong nhan: ");
        int level = Integer.parseInt(sc.nextLine());
        Cadres employee = new Employee(name, age, gender, address, level);
        this.cadres.add(employee);
        System.out.println(employee.toString());
    }
}

