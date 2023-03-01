package exercise_five.dto;

public class Person {
    private String name ;
    private int age;
    private int idCart;
    public Person(){};

    public Person(String name, int age, int idCart) {
        this.name = name;
        this.age = age;
        this.idCart = idCart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
                "name='" + name + '\'' +
                ", age=" + age +
                ", idCart=" + idCart +
                '}';
    }
}
