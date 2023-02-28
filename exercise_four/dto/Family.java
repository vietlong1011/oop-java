package exercise_four.dto;

import java.util.ArrayList;

public class Family  {
    private int apartmentNumber;
    private int numberPerson ;
    private ArrayList<Person> personList;
    public Family(){
        this.personList = new ArrayList<>();
    };

    public Family(int apartmentNumber, int numberPerson, ArrayList<Person> personList) {
        this.apartmentNumber = apartmentNumber;
        this.numberPerson = numberPerson;
        this.personList = personList;
    }
    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
    public int getNumberPerson() {
        return numberPerson;
    }
    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }
    public ArrayList<Person> getPersonList(){
        return personList;
    }

    @Override
    public String toString() {
        return "\nnumberApartment = " + apartmentNumber +"\nnumberPerson = "+ numberPerson +
                 "\n" +super.toString();
    }
}
