package exercise_one.job;

import exercise_one.dto.Cadres;
import exercise_one.dto.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class ActionEmployee extends ActionCadres{
    static Scanner sc = new Scanner(System.in);
     private Cadres cadres ;

    public ActionEmployee(Cadres cadres) {
        this.cadres = cadres;
    }

    public void AddEmployee() {
        Cadres c = addCadres();
        System.out.print("Nhap cap  cua cong nhan: ");
        int level = Integer.parseInt(sc.nextLine());
        Employee employee = new Employee(c.getName(),c.getOld(),c.getGender(),c.getAddress(), level);
        cadresList.add(employee);
        System.out.println(employee.toString());
    }
}

