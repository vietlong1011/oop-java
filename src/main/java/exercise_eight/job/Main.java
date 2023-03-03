package exercise_eight.job;

import java.sql.SQLOutput;

public class Main extends Functions {
    public static void menu() {
        System.out.println("\tQuan ly thu vien");
        System.out.println("1.Them phieu muon");
        System.out.println("2.Xoa phieu muon theo ma phieu muon");
        System.out.println("3.Hien thi thong tin cac phieu muon");
        System.out.println("4.Exit!!!");
    }

    public static void main(String[] args) {
        Functions functions = new Functions();
        boolean loopMenu = true;
        while (loopMenu) {
            menu();
            System.out.print("Nhap lua chon cua ban : ");
            int check = Integer.parseInt(Functions.sc.nextLine());
            switch (check) {
                case 1:
                    System.out.print("Nhap so luong sinh vien :");
                    int numberStudent = Integer.parseInt(Functions.sc.nextLine());
                    for (int i = 0; i < numberStudent; i++) {
                        functions.addTheMuon();
                    }
                    break;
                case 2:
                    functions.deleteTheMuon();
                    break;
                case 3:
                    functions.display();
                    break;
                case 4:
                    loopMenu = false;
                    break;
                default: {
                    System.out.println("Lua chon khong hop le");
                    continue;
                }
            }
        }
    }
}
