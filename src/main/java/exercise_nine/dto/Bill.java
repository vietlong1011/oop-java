package exercise_nine.dto;

public class Bill {
    private int electricOld;
    private int getElectricNew;
    private int price;
    private Person person;

    public Bill() {
    }

    public Bill(int electricOld, int getElectricNew, int price, Person person) {
        this.electricOld = electricOld;
        this.getElectricNew = getElectricNew;
        this.price = price;
        this.person = person;
    }

    public int getElectricOld() {
        return this.electricOld;
    }

    public void setElectricOld(int electricOld) {
        this.electricOld = electricOld;
    }

    public int getGetElectricNew() {
        return this.getElectricNew;
    }

    public void setGetElectricNew(int getElectricNew) {
        this.getElectricNew = getElectricNew;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String toString() {
        int var10000 = this.electricOld;
        return "Bill{electricOld=" + var10000 + ", getElectricNew=" + this.getElectricNew + ", price=" + this.price + "$, person=" + String.valueOf(this.person) + "}";
    }
}

