package tx1_ca2_de1;
public class KhachHang {
    private int maKhachHang;
    private String ten;
    private DiaChi diachi;
    private int soDienThoai;
    private int soTienMua;

    public KhachHang(int maKhachHang, String ten, DiaChi diachi, int soDienThoai, int soTienMua) {
        this.maKhachHang = maKhachHang;
        this.ten = ten;
        this.diachi = diachi;
        this.soDienThoai = soDienThoai;
        this.soTienMua = soTienMua;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
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

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getSoTienMua() {
        return soTienMua;
    }

    public void setSoTienMua(int soTienMua) {
        this.soTienMua = soTienMua;
    }
    
    
    
}
