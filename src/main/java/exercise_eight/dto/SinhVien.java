package exercise_eight.dto;

public class SinhVien {
    private String name ;
    private int age;
    private String classStudent;
    public SinhVien(){};

    public SinhVien(String name, int age, String classStudent) {
        this.name = name;
        this.age = age;
        this.classStudent = classStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classStudent='" + classStudent + '\'' +
                '}';
    }
}
