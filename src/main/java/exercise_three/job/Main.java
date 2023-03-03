package exercise_three.job;

import exercise_three.action.Function;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void listMenu(){
        System.out.println("Student management program");
        System.out.println("---------------------------");
        System.out.println("1. Add new student");
        System.out.println("2. Display student information and exam department");
        System.out.println("3. Search by ID number");
        System.out.println("4. Exit program");
        System.out.println("---------------------------");
        System.out.print("Please choose a function (1-4): ");
    };

    public static void menu() {
        Function function = new Function();
        int choice;
        do {
           listMenu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    AddStudent addStudent = new AddStudent();
                    addStudent.addStudent(function);
                    break;
                case 2:
                    function.display();
                    break;
                case 3:
                    System.out.println("Enter id_number search");
                    int search = Integer.parseInt(sc.nextLine());
                    function.search(search);
                    break;
                case 4:
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        } while (choice != 4);
    }

    public static void main(String[] args) {
        menu();
    }
}
