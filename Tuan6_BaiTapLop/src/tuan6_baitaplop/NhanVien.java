// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan6_baitaplop;

public class NhanVien {

    private String maNv;
    private String ten;
    private int tuoi;
    private String email;
    private String soDienThoai;

    public NhanVien() {
    }

    public NhanVien(String maNv, String ten, int tuoi, String email, String soDienThoai) {
        this.maNv = maNv;
        this.ten = ten;
        this.tuoi = tuoi;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public double tinhLuong() {
        return 0;
    }

    public void hienThiThongTin() {
        System.out.println("Ma nhan vien: " + maNv);
        System.out.println("Ten nhan vien: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Email: " + email);
        System.out.println("So dien thoai: " + soDienThoai);
    }
    

}
