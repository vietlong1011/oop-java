package exercise_seven.job;

import exercise_seven.dto.Person;
import exercise_seven.dto.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class Functions extends Teacher {
    static Scanner sc = new Scanner(System.in);

    public Functions() {
    }

    ;

    public Person addPerson() {
        System.out.println("\t\tThem Giang Vien");
        System.out.print("Nhap ho ten giang vien : ");
        String namePerson = sc.nextLine();
        System.out.print("Nhap tuoi cua giang vien : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap que quan cua giang vien : ");
        String address = sc.nextLine();
        System.out.print("Nhap ma so giao vien : ");
        String idTeacher = sc.nextLine();
        Person person = new Person(namePerson, age, address, idTeacher);
        return person;
    }

    public Teacher addTeacher() {
        Person personAdd = addPerson();
        System.out.print("Luong cung cua nhan vien : ");
        double hardSalary = Double.parseDouble(sc.nextLine());
        System.out.print("Tien Thuong cua nhan vien : ");
        double bonus = Double.parseDouble(sc.nextLine());
        System.out.print("Tien Phat cua nhan vien : ");
        double penalty = Double.parseDouble(sc.nextLine());
        double money = hardSalary + bonus - penalty;
        Teacher teacher = new Teacher(hardSalary, bonus, penalty, money, personAdd);
        teachersList.add(teacher);
        for (Teacher t : teachersList) {
            System.out.println(t.toString());
        }
        return teacher;
    }

    public void deleteTeacher() {
        System.out.print("Nhap ma giao vien can xoa: ");
        String delete = sc.nextLine();
        for (Teacher t : teachersList) {
            if (delete.equalsIgnoreCase(t.person.getIdTeacher())) {
                teachersList.remove(t);
                System.out.println("xoa thanh cong");
            }
            break;
        }
    }

    public void display() {
        for (Teacher t : teachersList) {
            System.out.println(t.toString());
        }
    }
}
