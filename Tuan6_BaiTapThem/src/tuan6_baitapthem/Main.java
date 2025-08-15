package tuan6_baitapthem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int chon;

        do {
            System.out.println("__________MENU___________");
            System.out.println("1. Them sach vao thu vien");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim sach theo tac gia");
            System.out.println("4. Xoa sach theo ma sach");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhap tieu de: ");
                    String title = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String author = sc.nextLine();
                    System.out.print("Nhap gia: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhap ten NXB: ");
                    String pubName = sc.nextLine();
                    System.out.print("Nhap dia chi NXB: ");
                    String pubAddr = sc.nextLine();
                    Publisher pub = new Publisher(pubName, pubAddr);
                    library.addBook(new Book(title, author, price, pub));
                    break;
                case 2:
                    System.out.print("Co hien thi NXB? (true/false): ");
                    boolean show = sc.nextBoolean();
                    library.displayAllBooks(show);
                    break;
                case 3:
                    System.out.print("Nhap ten tac gia can tim: ");
                    String searchAuthor = sc.nextLine();
                    library.searchByAuthor(searchAuthor);
                    break;
                case 4:
                    System.out.print("Nhap ID sach can xoa: ");
                    int id = sc.nextInt();
                    library.removeBookById(id);
                    break;
                case 5:
                    System.out.println("Tam biet!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 5);
    }
}
