package exercise_three.dto;

public class Student {
   private int id_number;
   private String nameStudent ;
   private String addressStudent ;
   private  int priority;
   private String examDepartment;

   public Student(){};

    public Student(int id_number, String nameStudent, String addressStudent, int priority,String examDepartment) {
        this.id_number = id_number;
        this.nameStudent = nameStudent;
        this.addressStudent = addressStudent;
        this.priority = priority;
        this.examDepartment = examDepartment;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getAddressStudent() {
        return addressStudent;
    }

    public void setAddressStudent(String addressStudent) {
        this.addressStudent = addressStudent;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getId_number() {
        return id_number;
    }

    public void setId_number(int id_number) {
        this.id_number = id_number;
    }

    public void setExamDepartment(String examDepartment) {
        this.examDepartment = examDepartment;
    }

    public String getExamDepartment() {
        return examDepartment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id_number=" + id_number +
                ", nameStudent='" + nameStudent + '\'' +
                ", addressStudent='" + addressStudent + '\'' +
                ", priority=" + priority + '\''+
                ", examDepartment =" + examDepartment + '\''+
                '}';
    }
}
