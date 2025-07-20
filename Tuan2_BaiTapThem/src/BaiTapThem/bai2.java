package BaiTapThem;

import java.util.Scanner;

public class bai2 {

    public static int[] NhapMang(int n) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void XuatMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void Xuly(int[] a) {
        int[] temp = a.clone();

        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) { 
                int left, right;

                if (i - 1 >= 0) {
                    left = temp[i - 1];
                } else {
                    left = 0;
                }

                if (i + 1 < a.length) {
                    right = temp[i + 1];
                } else {
                    right = 0;
                }

                a[i] = a[i] + Math.abs(left - right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int[] a = NhapMang(n);

        System.out.println("Mang truoc khi xu ly:");
        XuatMang(a);

        Xuly(a);

        System.out.println("Mang sau khi xu ly:");
        XuatMang(a);
    }
}
