package tx1_ca2_de1;

public class KhachHang {

    private String maKhachHang;
    private String ten;
    private DiaChi diachi;
    private String soDienThoai;
    private int soTienMua;

    public KhachHang(String maKhachHang, String ten, DiaChi diaChi, String soDienThoai, int soTienMua) {
        this.maKhachHang = maKhachHang;
        this.ten = ten;
        this.diachi = diachi;
        this.soDienThoai = soDienThoai;
        this.soTienMua = soTienMua;
    }

    public KhachHang() {

    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public DiaChi getDiachi() {
        return diachi;
    }

    public void setDiachi(DiaChi diachi) {
        this.diachi = diachi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getSoTienMua() {
        return soTienMua;
    }

    public void setSoTienMua(int soTienMua) {
        this.soTienMua = soTienMua;
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-20s | %-20s | %-12s | %-10d |",
                maKhachHang,
                ten,
                diachi,
                soDienThoai,
                soTienMua);
    }

}
