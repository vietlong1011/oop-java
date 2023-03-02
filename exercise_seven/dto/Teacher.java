package exercise_seven.dto;

import java.util.ArrayList;

public class Teacher extends Person{
    private double hardSalary ;
    private double bonus;
    private double penalty;
    private double money;
    public Person person;
    public   ArrayList<Teacher> teachersList ;
    public Teacher(){
        this.teachersList = new ArrayList<>();
    };

    public Teacher(double hardSalary, double bonus, double money,double penalty, Person person) {
        this.hardSalary = hardSalary;
        this.bonus = bonus;
        this.money = money;
        this.penalty = penalty;
        this.person = person;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "hardSalary=" + hardSalary +
                ", bonus=" + bonus +
                ", money=" + money +
                ", person=" + person +
                '}';
    }
}
