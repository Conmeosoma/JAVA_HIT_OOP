package tuan4_baitapvenha;

public class Student {

    public static final int namHienTai = 2025;
    private String Ten;
    private int namSinh;
    private String diaChi;
    private double tx1, tx2, kthp;
    private int soTietNghi;

    public Student(String Ten, int namSinh, String diaChi, double tx1, double tx2, double kthp, int soTietNghi) {
        this.Ten = Ten;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.soTietNghi = soTietNghi;
    }

    public Student() {

    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTx1() {
        return tx1;
    }

    public void setTx1(double tx1) {
        this.tx1 = tx1;
    }

    public double getTx2() {
        return tx2;
    }

    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }

    public double getKthp() {
        return kthp;
    }

    public void setKthp(double kthp) {
        this.kthp = kthp;
    }

    public int getSoTietNghi() {
        return soTietNghi;
    }

    public void setSoTietNghi(int soTietNghi) {
        this.soTietNghi = soTietNghi;
    }

    public int tuoi() {
        return namHienTai - namSinh;
    }

    public double GPA() {
        return (tx1 * 0.2 + tx2 * 0.3 + kthp * 0.5);
    }

    @Override

    public String toString() {
        return String.format("%10s %10d %20s %10.2f %10.2f %10.2f %10.2f %15d",
                Ten, tuoi(), diaChi, tx1, tx2, kthp, GPA(), soTietNghi);
    }

}
