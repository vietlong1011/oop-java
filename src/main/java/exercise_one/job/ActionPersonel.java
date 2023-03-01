package exercise_one.job;

import exercise_one.dto.Cadres;
import exercise_one.dto.Personnel;

import java.util.ArrayList;
import java.util.Scanner;

public class ActionPersonel extends ActionCadres{
    static Scanner sc = new Scanner(System.in);
    private Cadres cadres;

    public ActionPersonel(Cadres cadres) {
        this.cadres = cadres;
    }
    public  void addPersonel(){
        Cadres cadres = addCadres();
        System.out.print("Nhap cong viec cua nhan vien : ");
        String work = sc.nextLine();
        Cadres personnel = new Personnel(cadres.getName(), cadres.getOld(), cadres.getGender(),cadres.getAddress(), work);
        cadresList.add(personnel);
        System.out.println(personnel.toString());
    }
}



