package exercise_three.action;

import exercise_three.dto.Student;
import exercise_two.dto.Document;

import java.util.ArrayList;

public class Function {
    public ArrayList<Student> students = new ArrayList<>();

    public static void Function() {

    }
    public void add(Student student){
        boolean exists = false;

        for (Student d : this.students) {
            String strID = String.valueOf(d.getId_number());
            if (strID.equals(String.valueOf(student.getId_number()))) {
                exists = true;
                break;
            }
        }
        if (exists) {
            System.out.println("Ma Sinh Vien Da Ton Tai");
        } else {
            this.students.add(student);
        };
    }

    public void display() {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
    public void search(int id_number) {
        for (Student s : students) {
           if (id_number == s.getId_number())
           {
                System.out.println(s.toString());
            }
            else {
                System.out.println("Ma sv khong ton tai");
            }
        }
    }

// check
//    public static void main(String[] args) {
//        Student student = new Student(123,"long","hn",2,"A");
//        Function function = new Function();
//        function.add(student);
//        function.display();
//        function.search(123);
 //   }
}
