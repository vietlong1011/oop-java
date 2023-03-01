package exercise_six.dto;

public class Students {
    private String nameStudent ;
    private int age;
    private String address;
    public Students(){};

    public Students(String nameStudent, int age, String address) {
        this.nameStudent = nameStudent;
        this.age = age;
        this.address = address;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Students{" +
                "nameStudent='" + nameStudent + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
