package tuan3_baitaplop;

import java.util.Scanner;

public class Bai2 {

    static final double pi = 3.14;
    static double banKinh;
    static int k;

    public static void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh cua hinh tron");
        banKinh = sc.nextDouble();
        System.out.println("Nhap so nguyen k: ");
        k = sc.nextInt();
    }

    public static double chuVi() {
        return (2 * pi * banKinh);
    }

    public static double dienTich() {
        return (Math.pow(banKinh, 2) * pi);
    }

    public static double canBac2() {
        return Math.pow(banKinh + k, 2);
    }

    public static double giaTriTuyetDoi() {
        return Math.abs(banKinh - k);
    }

    public static void main(String[] args) {
        Nhap();
        System.out.println("Chu vi la: " + chuVi());
        System.out.println("Dien tich la: " + dienTich());
        System.out.println("Can bac 2: " + canBac2());
        System.out.println("Gia tri tuyet doi: " + giaTriTuyetDoi());
    }

}
