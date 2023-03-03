package exercise_seven.dto;

import java.util.ArrayList;

public class Person {
    private String namePerson ;
    private int age;
    private String address;
    private String idTeacher;
    public Person(){};

    public Person(String namePerson, int age, String address,String idTeacher) {
        this.namePerson = namePerson;
        this.age = age;
        this.address = address;
        this.idTeacher = idTeacher;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    @Override
    public String toString() {
        return "Person{" +
                "namePerson='" + namePerson + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", idTeacher='" + idTeacher + '\'' +
                '}';
    }
}
