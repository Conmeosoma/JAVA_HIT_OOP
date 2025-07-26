package tuan3_baitaplop;

import java.util.Scanner;

public class Bai4 {

    static int n;

    public static void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong so fibonaci: ");
        n = sc.nextInt();
        sc.nextLine();
    }
//    public static int Fibo(){
//        int a = 0, b = 1;
//        System.out.println("Day la: ");
//        int next = a + b;
//        a = b ;
//        b = next;
//    }
    // de quy    

    public static int Fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return Fibo(n - 1) + Fibo(n - 2);

    }

    public static void main(String[] args) {
        int tongLe = 0;
        Nhap();
        System.out.println("Day fibo la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Fibo(i) + " ");
            if (Fibo(i) % 2 != 0) {
                tongLe += Fibo(i);
            }
        }
        System.out.println();
        System.out.println("Tong le Fibo la: " + tongLe);
    }
}
