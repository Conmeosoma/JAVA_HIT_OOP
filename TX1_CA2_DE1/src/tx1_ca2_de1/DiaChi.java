package tx1_ca2_de1;
public class DiaChi {
    private int soNha;
    private String tenDuong;

    public DiaChi(int soNha, String tenDuong) {
        this.soNha = soNha;
        this.tenDuong = tenDuong;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getTenDuong() {
        return tenDuong.toUpperCase();
    }

    public void setTenDuong(String tenDuong) {
        this.tenDuong = tenDuong;
    }

    @Override
    public String toString() {
        return "DiaChi{" + "soNha=" + soNha + ", tenDuong=" + tenDuong + '}';
    }
    
    
    
}
