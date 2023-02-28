package exercise_four.dto;

import java.util.ArrayList;

public class Person {
    private String namePerson ;
    private int age ;
    private String job;
    private int idCart ;
    public Person(){};

    public Person(String namePerson, int age, String job, int idCart) {
        this.namePerson = namePerson;
        this.age = age;
        this.job = job;
        this.idCart = idCart;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getIdCart() {
        return idCart;
    }

    public void setIdCart(int idCart) {
        this.idCart = idCart;
    }

    @Override
    public String toString() {
        return "Person{" +
                "namePerson='" + namePerson + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", idCart=" + idCart +
                '}';
    }
}
