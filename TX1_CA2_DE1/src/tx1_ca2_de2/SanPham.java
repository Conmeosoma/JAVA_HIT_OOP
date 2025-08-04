// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tx1_ca2_de2;

public class SanPham {

    private String maSanPham;
    private String tenSanPham;
    private int canNang;
    private int giaTien;
    private NhaMay nhaMay;

    public SanPham() {

    }

    public SanPham(String maSanPham, String tenSanPham, int canNang, int giaTien, NhaMay nhaMay) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.canNang = canNang;
        this.giaTien = giaTien;
        this.nhaMay = nhaMay;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham.toUpperCase();
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public NhaMay getNhaMay() {
        return nhaMay;
    }

    public void setNhaMay(NhaMay nhaMay) {
        this.nhaMay = nhaMay;
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-20s | %-10d | %-10d | %-20s |",
                maSanPham, tenSanPham, canNang, giaTien, nhaMay);

    }
}
