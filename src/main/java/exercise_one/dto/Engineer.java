package exercise_one.dto;

public class Engineer extends  Cadres {
    private String classTraining;

    public Engineer() {
    }
    public String getClassTraining() {
        return classTraining;
    }

    public void setClassTraining(String classTraining) {
        this.classTraining = classTraining;
    }
    public Engineer(String name, int age, String gender, String address, String classTraining) {
        super(name, age, gender, address);
        this.classTraining = classTraining;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("%10s",classTraining);
    }
}
