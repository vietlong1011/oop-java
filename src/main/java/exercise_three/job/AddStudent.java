package exercise_three.job;

import exercise_three.action.Function;
import exercise_three.dto.Student;

import java.util.Scanner;

public class AddStudent {
    static Scanner sc = new Scanner(System.in);
    // dang khoi tao 2 class function khac nhau

    public  void  addStudent(Function function) {
        Student student = new Student();
        System.out.println("Nhap thong tin sinh vien can them");
        System.out.print("Nhap ma sinh vien :");
        student.setId_number(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap ten sinh vien :");
        student.setNameStudent(sc.nextLine());
        System.out.print("Nhap dia chi sinh vien :");
        student.setAddressStudent(sc.nextLine());
        System.out.print("Nhap muc uu tien cua sinh vien :");
        student.setPriority(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap khoi thi cua sinh vien : ");
        String ex = sc.nextLine();
        if (ex.equalsIgnoreCase("A")) {
            student.setExamDepartment("Toan , Ly , Hoa");
        } else if (ex.equalsIgnoreCase("B")) {
            student.setExamDepartment("Ly , Hoa , Sinh");
        } else if (ex.equalsIgnoreCase("C")) {
           student.setExamDepartment("Van , Su , Dia");
        } else {
            System.out.println("lua chon khong hop le");
        }
       function.add(student);
        function.display();
    }

}
