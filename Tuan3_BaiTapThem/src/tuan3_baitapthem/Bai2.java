package tuan3_baitapthem;

import java.util.Scanner;

public class Bai2 {

    static String s;

    public static void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: :vvv");
        s = sc.nextLine().trim();
    }

    public static void XuLy() {
        String chuoiFake = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            chuoiFake += s.charAt(i);

        }
        System.out.println("Chuoi dao nguoc la: " + chuoiFake);

        // check doi xung
        if (s.equalsIgnoreCase(chuoiFake)) {
            System.out.println(s.toUpperCase());
            System.out.println("Chuoi doi xung");
        } else {
            System.out.println(s.toLowerCase());
            System.out.println("K la chuoi doi xung");
        }

    }

    public static void main(String[] args) {
        Nhap();
        XuLy();
    }
}
