// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package Bai2_1;

import java.security.interfaces.DSAKey;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);
    ArrayList<Book> ds = new ArrayList<>();

    public void nhap() {
        System.out.println("Nhap so luong sach");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap tiltle: ");
            String title = sc.nextLine();
            System.out.println("Nhap author");
            String author = sc.nextLine();
            Book bk = new Book(title, author);
            ds.add(bk);
        }

    }

    public void xuat() {
        for (Book bk : ds) {
            bk.out();
        }
    }

    public static void main(String[] args) {
        Main z = new Main();
        z.nhap();
        z.xuat();

    }

}
