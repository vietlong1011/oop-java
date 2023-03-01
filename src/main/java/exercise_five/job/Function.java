package exercise_five.job;

import exercise_five.dto.Hotel;
import exercise_five.dto.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Function {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Hotel> hotelList;
    private ArrayList<Person> personList;

    public Function() {
        this.hotelList = new ArrayList<>();
        this.personList = new ArrayList<>();
    }

    public void addPerson(ArrayList<Person> personList) {
        System.out.println("Them moi khach hang");
        System.out.print("Nhap ho ten khach hang : ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi cua khach hang : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so chung minh thu : ");
        int idCart = Integer.parseInt(sc.nextLine());
        Person person = new Person(name, age, idCart);
        personList.add(person);
        for (Person p : personList
        ) {
            System.out.println(p.toString());
        }
    }

    public void deletePerson(ArrayList<Person> personList) {
        System.out.print("Nhap ma khach hang can xoa : ");
        int delete = Integer.parseInt(sc.nextLine());
        for (Person p : personList) {
            if ((String.valueOf(delete)).equals(String.valueOf(p.getIdCart()))) {
                personList.remove(p);
                System.out.println("Delete Person successfully");
                break;
            }
        }
    }

    public void addHotel(ArrayList<Hotel> hotelList) {
        System.out.println("Nhap thong tin thue phong");
        System.out.print("Nhap so ngay thue phong : ");
        int date = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap loai phong thue : ");
        String room = sc.nextLine();
        System.out.print("Nhap so luong khach thue phong : ");
        int numberPerson = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberPerson; i++) {
            addPerson(personList);
        }
        Hotel hotel = new Hotel(date, room, personList);
        hotelList.add(hotel);
        for (Hotel h : hotelList) {
            System.out.println(h.toString() + "\nGia thue phong " +money(h));
        }
    }
    public double money(Hotel hotel){
        double money = 0;
        if((hotel.getRoom()).equalsIgnoreCase("A"))
        {
            money = hotel.getDate() * 500;
        } else if ((hotel.getRoom()).equalsIgnoreCase("B")) {
            money = hotel.getDate() * 300;
        } else if ((hotel.getRoom()).equalsIgnoreCase("C")) {
            money = hotel.getDate() * 100;
        }else {
            System.out.println("Loai phong khong hop le");
        }
        return money;
    }

}
