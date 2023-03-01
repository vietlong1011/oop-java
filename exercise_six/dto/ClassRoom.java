package exercise_six.dto;

import java.util.ArrayList;

public class ClassRoom {
    private String className;
    public Students students ;

    public ClassRoom(String className,Students students) {
        this.className = className;
        this.students = students;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "className='" + className + '\'' +
                ", students=" + students +
                '}';
    }
}
