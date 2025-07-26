package tuan3_baitaplop;

import java.util.Scanner;

public class Bai5 {

    static int n;
    static int[][] a;

    protected static void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kick thuoc mang: ");
        n = sc.nextInt();
        a = new int[n][n];
    }

    protected static void mang2chieu() {
        int val = 1;
        int hangDau = 0, hangCuoi = n - 1;
        int cotDau = 0, cotCuoi = n - 1;
        while (val <= n * n) {
            for (int i = cotDau; i <= cotCuoi; i++) {
                a[hangDau][i] = val++;
            }
            hangDau++;
            for (int i = hangDau; i <= hangCuoi; i++) {
                a[i][cotCuoi] = val++;
            }
            cotCuoi--;
            for (int i = cotCuoi; i >= cotDau; i--) {
                a[hangCuoi][i] = val++;
            }
            hangCuoi--;
            for (int i = hangCuoi; i >= hangDau; i--) {
                a[i][cotDau] = val++;
            }
        }
    }

    protected static void xuatMang() {
        System.out.println("Mang xoan oc la: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

   protected static void tongDuongCheo() {
    int tongChinh = 0;
    int tongPhu = 0;

    System.out.print("Dg cheo chinh: ");
    for (int i = 0; i < n; i++) {
        System.out.print(a[i][i] + " ");
        tongChinh += a[i][i];
    }

    System.out.println();
    System.out.print("dg phu: ");
    for (int i = 0; i < n; i++) {
        System.out.print(a[i][n - 1 - i] + " ");
        tongPhu += a[i][n - 1 - i];
    }

    System.out.println();
    System.out.println("Tong cheo chinh : " + tongChinh);
    System.out.println("Tong cheo phu : " + tongPhu);
  
}


    public static void main(String[] args) {
        Nhap();
        mang2chieu();
        xuatMang();
        tongDuongCheo();
    }

}
