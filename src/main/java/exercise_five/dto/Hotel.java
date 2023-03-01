package exercise_five.dto;

import java.util.ArrayList;

public class Hotel {
    private int date;
    private String room;
    private ArrayList<Person> personList;

    public Hotel(int date, String room, ArrayList<Person> personList) {
        this.date = date;
        this.room = room;
        this.personList = personList;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList =personList;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "date=" + date +
                ", room='" + room + '\'' +
                ", personList=" + personList +
                '}';
    }
}
