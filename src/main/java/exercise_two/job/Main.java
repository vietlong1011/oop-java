package exercise_two.job;

import exercise_two.action.Function;
import exercise_two.dto.Document;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function function = new Function();
        AddDocument addDocument = new AddDocument(function);
        while (true) {
            menu();
            int line = Integer.parseInt(scanner.nextLine());
            switch (line) {
                case 1: {
                    System.out.println("1 : Them Tai Lieu Sach");
                    System.out.println("2 : Them Tai Lieu Bao");
                    System.out.println("3 : Them Tai Lieu Tap CHi");
                    int check = Integer.parseInt(scanner.nextLine());
                    switch (check) {
                        case 1: {
                            addDocument.addBooks();
                            break;

                        }
                        case 2: {
                            addDocument.addNewspaper();
                            break;
                        }
                        case 3: {
                            addDocument.addMagazine();
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case 2: {
                    System.out.println("1 : Tim Kiem Sach");
                    System.out.println("2 : Tim Kiem Bao");
                    System.out.println("3 : Tim Kiem Tap Chi");
                    int search = Integer.parseInt(scanner.nextLine());
                    switch (search) {
                        case 1: {
                            function.searchBooks();
                            break;
                        }
                        case 2: {
                            function.searchNewspapers();
                            break;
                        }
                        case 3:
                            function.searchMagazines();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case 3: {
                    function.display();
                    break;
                }
                case 4: {
                    System.out.print("Nhap Ma Tai Lieu Can Xoa : ");
                    String id = scanner.nextLine();
                    function.deleteDocumentByID(id);
                }
                break;
                case 5: {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }
    }

    public static void menu() {
        System.out.println("Chuong Trinh Quan Ly Tai Lieu");
        System.out.println("1 : Them Tai Lieu");
        System.out.println("2 : Tim Kiem Tai Lieu Theo Loai ");
        System.out.println("3 : Hien Thi Danh Sach Tai Lieu");
        System.out.println("4 : Xoa Tai Lieu Theo Ma Tai Lieu");
        System.out.println("5 : Exit!!!");
        System.out.print("Nhap Lua Chon Cua Ban : ");
    }
}
