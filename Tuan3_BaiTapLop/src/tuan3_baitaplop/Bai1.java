package tuan3_baitaplop;

import java.util.Scanner;

public class Bai1 {

    static int n;
    static int[] a;

    public static void nhap() {
        System.out.println("Nhap so luong phan tu: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void XuLy() {
        int tongchan = 0, tongle = 0, dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                tongchan += a[i];
            } else {
                tongle += a[i];
            }
        }
        System.out.println("Tong chan: " + tongchan);
        System.out.println("Tong le: " + tongle);
        for (int i = 0; i < n; i++) {
            if (check(a[i])) {
                dem++;
            }
        }
        System.out.print("So luong so nguyen to la: " + dem);
        System.out.println();
    }

    public static void main(String[] args) {
        nhap();
        XuLy();
    }

}
