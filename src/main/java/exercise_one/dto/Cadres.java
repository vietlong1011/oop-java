package exercise_one.dto;

import java.util.ArrayList;
import java.util.List;

public class Cadres {
    private String name ;
    private int old ;
    private String gender;
    private String address;
    public Cadres(){};
    public Cadres(String name, int old, String gender, String address) {
        this.name = name;
        this.old = old;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return String.format("%10s%5d%10s%20s",name,old,gender,address);
    }
}
