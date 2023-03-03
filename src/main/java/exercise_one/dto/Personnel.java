package exercise_one.dto;

public class Personnel extends  Cadres {
    private String work;

    public Personnel(String name, int age, String gender, String address, String work) {
        super(name, age, gender, address);
        this.work = work;
    }
    public Personnel() {
    }
    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%10s", work);
    }
}
