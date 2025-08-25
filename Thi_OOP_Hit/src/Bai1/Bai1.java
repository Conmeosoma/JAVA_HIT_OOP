package Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi s: ");
        String s = sc.nextLine();
        int demkhoangtrang = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                demkhoangtrang++;
            }
        }
        String tmpChuoi = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            tmpChuoi += s.charAt(i);
        }
        System.out.println("So khoang trang la: " + demkhoangtrang);
        System.out.println("Chuoi dao nguoc la: " + tmpChuoi);

    }

}
