// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan5_baitapvenha;

import java.util.Scanner;

public class PhongMay {

    Scanner sc = new Scanner(System.in);

    private String maPhong;
    private String tienPhong;
    private double dienTich;
    private QuanLy x;
    private May[] y;
    private int n;

    public PhongMay() {
        x = new QuanLy();
    }

    public PhongMay(String maPhong, String tienPhong, double dienTich, QuanLy x, May[] y, Integer n) {
        this.maPhong = maPhong;
        this.tienPhong = tienPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTienPhong() {
        return tienPhong;
    }

    public void setTienPhong(String tienPhong) {
        this.tienPhong = tienPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public void Nhap() {

        x.Nhap();
        System.out.println("Nhap ma phong: ");
        maPhong = sc.nextLine();
        System.out.println("Nhap ten phong: ");
        tienPhong = sc.nextLine();
        System.out.println("Nhap dien tich phong: ");
        dienTich = sc.nextDouble();
        System.out.println("Nhap so luong may: ");
        n = sc.nextInt();
        sc.nextLine();
        y = new May[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thogn tin may thu " + (i + 1) + " ");
            y[i] = new May();
            y[i].Nhap();

        }

    }

    public void Xuat() {
        x.Xuat();
        System.out.println("Ma phong: " + maPhong);
        System.out.println("Ten phong: " + tienPhong);
        System.out.println("Dien tich: " + dienTich);
        System.out.println("So luong may: " + n);
        for (May ds : y) {
            ds.Xuat();
        }

    }

}
