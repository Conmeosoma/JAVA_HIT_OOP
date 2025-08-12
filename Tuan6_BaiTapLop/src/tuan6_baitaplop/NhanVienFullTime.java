// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan6_baitaplop;

public class NhanVienFullTime extends NhanVien {

    private double luongCoBan;
    private double tienThuong;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(double luongCoBan, double tienThuong, String maNv, String ten, int tuoi, String email, String soDienThoai) {
        super(maNv, ten, tuoi, email, soDienThoai);
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + tienThuong;

    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Loai: Full Time");

    }

}
