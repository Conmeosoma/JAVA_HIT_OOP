// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan6_baitaplop;

import java.util.Scanner;

public class SinhVien {

    Scanner sc = new Scanner(System.in);

    private String maSv;
    private String hoTen;
    private double diemTB;
    private LopHoc lop;

    public SinhVien() {
       
    }

    public SinhVien(String maSv, String hoTen, double diemTB, LopHoc lop) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void setDiemTB(int diemTB) {
        this.diemTB = diemTB;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }
    public void inThongTin(){
        System.out.println("Ma sv: "  + maSv);
        System.out.println("Ho ten sv: " + hoTen);
        System.out.println("Diem trung binh: " + diemTB);
        System.out.println("Thong tin lop hoc: ");
        lop.inThongTin();
    }
    public void nhapThongTin(){
        System.out.println("Nhap ma sinh vien: ");
        maSv = sc.nextLine();
        System.out.println("Nhap ho ten sinh vien: ");
        hoTen = sc.nextLine();
        System.out.println("Diem trung binh sinh vien: ");
        diemTB = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap thong tin lop hoc");
        System.out.println("Nhap ma lop: ");
        String malop = sc.nextLine();
        System.out.println("Ten lop: ");
        String tenlop = sc.nextLine();
        lop = new LopHoc(malop, tenlop);
    }

}
