package tx2_ontap;

import java.util.Scanner;

public class CongNhan implements IUtils {

    private String maCn;
    private String tenCn;
    private CaType caLam;
    private int tongGioLam;

    static Scanner sc = new Scanner(System.in);

    public CongNhan() {
    }

    public CongNhan(String maCn, String tenCn, CaType caLam, int tongGioLam) {
        this.maCn = maCn;
        this.tenCn = tenCn;
        this.caLam = caLam;
        this.tongGioLam = tongGioLam;
    }
    
    public String getMaCn() {
        return maCn;
    }

    public String getTenCn() {
        return tenCn;
    }

    public CaType getCaLam() {
        return caLam;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    @Override
    public void inputData() {
        try {
            System.out.print("Nhap ma cong nhan: ");
            maCn = sc.nextLine();

            System.out.print("Nhap ten cong nhan: ");
            tenCn = sc.nextLine();
            if (tenCn.trim().isEmpty()) {
                throw new Exception("Ten khong duoc de trong!");
            }

            System.out.print("Nhap so gio lam: ");
            tongGioLam = Integer.parseInt(sc.nextLine());
            if (tongGioLam < 0) {
                throw new Exception("Gio lam phai >= 0");
            }

            System.out.print("Nhap ca lam (CA1, CA2, CA3): ");
            caLam = CaType.valueOf(sc.nextLine().toUpperCase());

        } catch (NumberFormatException e) {
            System.out.println("Nhap sai dinh dang so!\n");
        } catch (IllegalArgumentException e) {
            System.out.println("Ca lam khong hop le! Nhap CA1, CA2 hoac CA3.");
        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }

    @Override
    public void outputData() {
        System.out.printf("%-10s %-20s %-15s %-5d\n", maCn, tenCn, caLam, tongGioLam);
    }


}
