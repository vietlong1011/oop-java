package exercise_one;

import exercise_one.dto.Cadres;
import exercise_one.dto.Personnel;
import exercise_one.job.ActionCadres;

import java.util.Scanner;

public class ActionPersonnel extends ActionCadres {
    static Scanner sc = new Scanner(System.in);

    public Personnel addPersonnel() {
        Cadres cadres = addCadres();
        System.out.print("Nhap cong viec cua nhan vien : ");
        String work = sc.nextLine();
        Personnel personnel = new Personnel(cadres.getName(), cadres.getOld(), cadres.getGender(), cadres.getAddress(), work);
        cadresList.add(personnel);
        System.out.println(personnel.toString());
        return personnel;
    }
}



