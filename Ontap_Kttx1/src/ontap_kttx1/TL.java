package ontap_kttx1;

public class TL {

    private String maTL;
    private String tenTL;
    private int namXuatBan;
    private int soTrang;

    public TL(String maTL, String tenTL, int namXuatBan, int soTrang) {
        this.maTL = maTL;
        this.tenTL = tenTL;
        setNamXuatBan(namXuatBan); // Sử dụng setter để kiểm tra
        this.soTrang = soTrang;
    }

    // Phương thức kiểm tra số trang (static)
    public static int kiemTraTrang(int soTrang) {
        if (soTrang == 0) {
            return 1;
        }
        if (soTrang < 0) {
            return 2;
        }
        if (soTrang > 500) {
            return 3;
        }
        return 0;
    }

    // Getter và Setter
    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getTenTL() {
        return tenTL;
    }

    public void setTenTL(String tenTL) {
        this.tenTL = tenTL;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = (namXuatBan >= 200) ? namXuatBan : 2020;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-20s | %-10d | %-8d |",
                maTL, tenTL, namXuatBan, soTrang);
    }
}
