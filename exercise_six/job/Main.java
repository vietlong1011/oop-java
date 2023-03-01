package exercise_six.job;

import exercise_six.dto.ClassRoom;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Functions functions = new Functions();
        ArrayList<ClassRoom> classRooms = new ArrayList<>();
        functions.addStudent(classRooms);
        functions.displayStudent20old(classRooms);
        functions.displayStudents23andDn(classRooms);
    }
}
