package exercise_six.job;

import exercise_six.dto.ClassRoom;
import exercise_six.dto.Students;

import java.util.ArrayList;
import java.util.Scanner;

public class Functions {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<ClassRoom> classRoomsList ;
    public Functions(){
        this.classRoomsList = new ArrayList<>();
    }
    public Functions(ArrayList<ClassRoom> classRoomsList) {
        this.classRoomsList = classRoomsList;
    }
    public void addStudent(ArrayList<ClassRoom> classRoomsList){
        System.out.print("Nhap ten lop hoc : ");
        String className = sc.nextLine();
        System.out.print("Nhap so luong hoc sinh can them : ");
        int numberStudents = Integer.parseInt(sc.nextLine());
        for (int i = 0 ; i<numberStudents;i++){
            System.out.print("Nhap ten hoc sinh : ");
            String nameStudent = sc.nextLine();
            System.out.print("Nhap tuoi cua hoc sinh : ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap que quan : ");
            String address = sc.nextLine();
            Students students = new Students(nameStudent,age,address);
            ClassRoom classRoom = new ClassRoom(className,students);
            classRoomsList.add(classRoom);
        }
    }
    public void  displayStudent20old(ArrayList<ClassRoom> classRoomsList) {
        for (ClassRoom classRoom : classRoomsList) {
            if (classRoom.students.getAge() == 20) {
                System.out.println(classRoom.toString());
                break;
            }else{
                System.out.println("khong co hoc sinh thoa man");
            }
        }
    }
    public void displayStudents23andDn(ArrayList<ClassRoom> classRoomsList){
        int count = 0;
        for (ClassRoom classRoom : classRoomsList) {
            if (classRoom.students.getAge() == 20 && classRoom.students.getAddress().equalsIgnoreCase("DN")) {
                count++;
            }
        }
            System.out.println("So hoc sinh 23 tuoi va que o DN la : " + count);
    }
}
