package tuan3_baitapthem;

import java.util.Random;
import java.util.Scanner;

public class Bai3 {

    static int a, b, c;

    public static void ranDOm() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        a = rand.nextInt(101);
        b = rand.nextInt(101);
        c = rand.nextInt(201);
    }

    public static void xuLy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("phep toan: " + a + " + " + b + " = " + c);
        System.out.print("'D' hay 'S': ");
        String traLoi = sc.nextLine().trim().toLowerCase();

        boolean ketQuaDung = (a + b == c);

        if ((ketQuaDung && traLoi.equals("d"))
                || (!ketQuaDung && traLoi.equals("s"))) {
            System.out.println("ADU gke!");
        } else {
            System.out.println("Hoang Cuu Bao_chicken guy!");
        }

    }

    public static void main(String[] args) {
        ranDOm();
        xuLy();
    }

}
