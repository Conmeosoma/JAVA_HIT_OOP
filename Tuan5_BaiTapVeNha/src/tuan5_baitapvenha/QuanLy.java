// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan5_baitapvenha;

import java.util.Scanner;

public class QuanLy {

    Scanner sc = new Scanner(System.in);

    private String maQL;
    private String hoTen;

    public QuanLy() {
    }

    public QuanLy(String maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void Nhap() {
        System.out.println("Nhap ma quan ly: ");
        maQL = sc.nextLine();
        System.out.println("Nhap ten quan ly: ");
        hoTen = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ma quan ly: " + maQL);
        System.out.println("Ten quan ly: " + hoTen);
    }

}
