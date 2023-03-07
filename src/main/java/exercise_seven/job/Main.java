package exercise_seven.job;

import exercise_seven.dto.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Functions functions = new Functions();
        System.out.print("Nhap so luong giao vien can them : ");
        int numberTeacher = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberTeacher; i++) {
            functions.addTeacher();
        }
        functions.deleteTeacher();
        functions.display();

    }
}
