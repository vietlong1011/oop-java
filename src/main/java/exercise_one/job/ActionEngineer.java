package exercise_one.job;

import exercise_one.dto.Cadres;
import exercise_one.dto.Employee;
import exercise_one.dto.Engineer;

import java.util.ArrayList;
import java.util.Scanner;

public class ActionEngineer extends  ActionCadres {
    static Scanner sc = new Scanner(System.in);
    private Cadres cadres;
    public ActionEngineer(Cadres cadres) {
        this.cadres = cadres;
    }
    public  void addEngineer(){
        Cadres cadres = addCadres();
        System.out.print("Nhap lop dao tao cua ky su: ");
        String classTraining = sc.nextLine();
        Cadres engineer = new Engineer(cadres.getName(), cadres.getOld(), cadres.getGender(),cadres.getAddress(), classTraining);
        this.cadresList.add(engineer);
        System.out.println(engineer.toString());
    }
}
