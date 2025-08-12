// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan6_baitaplop;

public class Bai2 {

    public static void main(String[] args) {
        QuanLyNhanVien ql = new QuanLyNhanVien();
        ql.themNhanVien(new NhanVienFullTime(12, 10, "001", "A", 20, "12@gmail.com", "034255252"));
        ql.themNhanVien(new NhanVienFullTime(12, 11, "001", "B", 20, "12@gmail.com", "034255252"));
        ql.themNhanVien(new NhanVienPartTime(12, 10, "001", "C", 20, "12@gmail.com", "034255252"));
        ql.themNhanVien(new NhanVienPartTime(12, 10, "001", "D", 20, "12@gmail.com", "034255252"));
        ql.hienThiTatCa();
        System.out.println(ql.tinhTongLuong());

    }

}
