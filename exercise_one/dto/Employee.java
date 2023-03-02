package exercise_one.dto;

public class Employee extends Cadres {
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Employee(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }
@Override
    public String toString() {
    return super.toString() + String.format("%5d", level);
    }
}