
package BaiTapThem;
import java.util.Scanner;
public class bai1_v2 {
    public static void Nhap(double r)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap r: ");
        r = sc.nextDouble();
    }
    public static void main(String[] args) {
        double r = 0;
        double pi = 3.14;
        Nhap(r);
        System.out.println("Chu vi: " + (2 * r * pi));
        System.out.println("Dien tich: " + (pi * r * r));
    }
}
