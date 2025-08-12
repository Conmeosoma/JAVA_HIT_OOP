package tuan6_baitaplop;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {

    ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    SinhVien sv = new SinhVien();

    public void addSinhVien() {
        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thogn tin sinh vien thu " + (i + 1) + ": ");
            sv.nhapThongTin();
            dsSinhVien.add(sv);
        }
    }

    public void inThongTin() {
        for (SinhVien sv : dsSinhVien) {
            sv.inThongTin();
        }
    }

    public void max() {
        SinhVien svMax = dsSinhVien.get(0);
        for (SinhVien sv : dsSinhVien) {
            if (sv.getDiemTB() > svMax.getDiemTB()) {
                svMax = sv;
            }
        }
        svMax.inThongTin();

    }

    public void Menu() {
        int chon;

        do {
            System.out.println("____|_____Menu_______|____");
            System.out.println("1.Add sinh vien");
            System.out.println("2.In thong tin sinh vien");
            System.out.println("3.Tim sinh vien max");
            System.out.println("Nhap lua chon cuia ban");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    addSinhVien();
                    break;
                case 2:
                    inThongTin();
                    break;
                case 3:
                    max();
                    break;
                default:
                    System.out.println("Lua chon sai!!!");
            }
        } while (chon != 0);
    }

    public static void main(String[] args) {

        Bai1 b1 = new Bai1();
        b1.Menu();

    }
}
