package tuan3_baitapthem;

import java.util.Scanner;

public class Bai1 {

    final static String Square = "Square";
    final static String Triangle = "Triangle";
    final static String Circle = "Circle";

    static Scanner sc = new Scanner(System.in);
    static String type;

    public static void Nhap() {
        System.out.println("nhap hinh (Square, Triangle, Circle): ");
        type = sc.nextLine();
    }

    public static void xuLy() {
        switch (type) {
            case Square:
                System.out.print("nhap do dai canh hinh vuong: ");
                double canh = sc.nextDouble();
                System.out.println("S_vuong: " + (canh * canh));
                break;

            case Triangle:
                System.out.print("Nhap chieu cao: ");
                double h = sc.nextDouble();
                System.out.print("Nhap day: ");
                double b = sc.nextDouble();
                System.out.println("Dien tich: " + (0.5 * b * h));
                break;

            case Circle:
                System.out.print("Nhap ban kinh: ");
                double r = sc.nextDouble();
                System.out.println("Dien Tich: " + (Math.PI * r * r));
                break;

            default:
                System.out.println("sai hinh r!");
        }
    }

    public static void main(String[] args) {
        Nhap();
        xuLy();
    }
}
