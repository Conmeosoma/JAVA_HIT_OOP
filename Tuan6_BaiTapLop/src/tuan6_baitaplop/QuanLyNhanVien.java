// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan6_baitaplop;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {

    Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

       public void themNhanVien(NhanVien nv) {
        danhSachNhanVien.add(nv);
    }

    public void hienThiTatCa() {
        System.out.println("DS nhan vien: ");
        for (NhanVien nv : danhSachNhanVien) {
            nv.hienThiThongTin();
        }
    }

    public double tinhTongLuong() {
        double tong = 0.0;
        for (NhanVien nv : danhSachNhanVien) {
            tong += nv.tinhLuong();

        }
        return tong;
    }

}
