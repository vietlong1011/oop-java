package exercise_one;

import exercise_one.dto.Cadres;
import exercise_one.job.ActionCadres;
import exercise_one.job.ActionEmployee;
import exercise_one.job.ActionEngineer;
import exercise_one.job.ActionPersonel;


import java.util.ArrayList;
import java.util.Scanner;

public class main extends ActionCadres{
    static Cadres cadres = new Cadres();
    public static void menu(){
        System.out.println("Quan ly can bo");
        System.out.println("1 : Them can bo");
        System.out.println("2 : Tim kiem theo ten can bo ");
        System.out.println("3 : Hien thi danh sach can bo");
        System.out.println("4 : Exit !!!");
    }
    public static void main(String[] args) {
        ActionCadres actionCadres = new ActionCadres();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("1: Them cong nhan");
                    System.out.println("2: Them ky su");
                    System.out.println("3: Them nhan vien");
                    int number = Integer.parseInt(sc.nextLine());
                    switch (number) {
                        case 1: {
                           ActionEmployee ae = new ActionEmployee(cadres);
                           ae.AddEmployee();
                            break;
                        }
                        case 2: {
                           ActionEngineer aen = new ActionEngineer(cadres);
                           aen.addEngineer();
                            break;
                        }
                        case 3: {
                            ActionPersonel ap = new ActionPersonel(cadres);
                            ap.addPersonel();
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Nhap ten can tim: ");
                    String searchName = sc.nextLine();
                   actionCadres.searchByName(searchName);
                    break;
                }
                case "3": {
                    actionCadres.display();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }

    }

}
