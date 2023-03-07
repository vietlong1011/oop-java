package exercise_nine.dto;

public class Person {
    private String namePerson;
    private int homeNumber;
    private int electricNumber;

    public Person() {
    }

    public Person(String namePerson, int homeNumber, int electricNumber) {
        this.namePerson = namePerson;
        this.homeNumber = homeNumber;
        this.electricNumber = electricNumber;
    }

    public String getNamePerson() {
        return this.namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public int getHomeNumber() {
        return this.homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public int getElectricNumber() {
        return this.electricNumber;
    }

    public void setElectricNumber(int electricNumber) {
        this.electricNumber = electricNumber;
    }

    public String toString() {
        return "Person{namePerson='" + this.namePerson + "', homeNumber=" + this.homeNumber + ", electricNumber=" + this.electricNumber + "}";
    }
}
