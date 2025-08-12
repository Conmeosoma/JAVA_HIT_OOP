/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuan6_baitaplop;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class LopHoc {

    Scanner sc = new Scanner(System.in);

    private String maLop;
    private String tenLop;

    public LopHoc() {
    }

    public LopHoc(String maLop, String tenLop) {
        this.maLop = maLop;
        this.tenLop = tenLop;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void inThongTin() {
        System.out.println("Ma lop: " + maLop);
        System.out.println("Ten lop: " + tenLop);
    }

}
