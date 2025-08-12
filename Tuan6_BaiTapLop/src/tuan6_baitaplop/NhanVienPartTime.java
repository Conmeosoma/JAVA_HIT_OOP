// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan6_baitaplop;

public class NhanVienPartTime extends NhanVien {

    private int soGioLam;
    private double luongTheoGio;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(int soGioLam, double luongTheoGio, String maNv, String ten, int tuoi, String email, String soDienThoai) {
        super(maNv, ten, tuoi, email, soDienThoai);
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public double getLuongTheoGio() {
        return luongTheoGio;
    }

    public void setLuongTheoGio(double luongTheoGio) {
        this.luongTheoGio = luongTheoGio;
    }

    @Override
    public double tinhLuong() {
        return soGioLam * luongTheoGio;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Loai: PartTime");

    }

}
