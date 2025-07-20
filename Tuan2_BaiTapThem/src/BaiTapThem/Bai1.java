package BaiTapThem;

import java.util.Scanner;

public class Bai1 {

    public static double Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh r: ");
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        double pi = 3.14;
        double r = Nhap();
        System.out.println("Chu vi cua hinh tron la: " + (double)(2 * pi * r));
        System.out.println("Dien tich cua hinh tron la: " + (double)(pi * r * r));
    }
}
