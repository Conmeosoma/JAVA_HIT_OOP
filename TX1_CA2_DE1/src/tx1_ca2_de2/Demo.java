// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tx1_ca2_de2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Demo {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<SanPham> dsSanPham = new ArrayList<>();
    static SanPham sp = new SanPham();
    static int chon;

    public void dulieuMau() {
        NhaMay nm1 = new NhaMay("FPT", "1234");
        SanPham sp1 = new SanPham("001", "OTO a", 10, 10, nm1);
        NhaMay nm2 = new NhaMay("FPT", "1234");
        SanPham sp2 = new SanPham("001", "OTO a", 10, 10, nm2);
        NhaMay nm3 = new NhaMay("FPT", "1234");
        SanPham sp3 = new SanPham("001", "OTO a", 10, 10, nm3);
        NhaMay nm4 = new NhaMay("FPT", "1234");
        SanPham sp4 = new SanPham("001", "OTO a", 10, 10, nm4);
        NhaMay nm5 = new NhaMay("FPT", "1234");
        SanPham sp5 = new SanPham("001", "OTO a", 10, 10, nm5);
        dsSanPham.add(sp1);
        dsSanPham.add(sp2);
        dsSanPham.add(sp3);
        dsSanPham.add(sp4);
        dsSanPham.add(sp5);
    }

    public static void inTieuDe() {
        System.out.println(String.format("|%-10s | %-20s | %-20s | %-12s | %-10s |", "maSanPham", "Tensp", "can nag", "gia tien", "nha may"));
    }

    public void inDanhSach() {
        if (dsSanPham.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            inTieuDe();
            System.out.println("Ds san pham la: ");
            for (SanPham sp : dsSanPham) {
                System.out.println(sp.toString());
            }
        }
    }

    public void themSanPham() {
        boolean timThay = false;
        System.out.println("Nhap ma sp ban muon them: ");
        String maSP = sc.nextLine();
        for (SanPham sp : dsSanPham) {
            if (sp.getMaSanPham().equals(maSP)) {
                timThay = true;
                break;
            }
        }
        if (timThay) {
            System.out.println("san pham nay da co trong ds vui long thu lai");
            System.out.println("Them san  pham that bai");
        } else {
            System.out.println("Nhap ten sp: ");
            String tenSP = sc.nextLine();
            System.out.println("Nhap can nang cua san pham: ");
            int cannang = sc.nextInt();
            System.out.println("Nhap gia tien cua san pham: ");
            int tien = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap ten nha may: ");
            String tenNm = sc.nextLine();
            System.out.println("Nhap ma nha may: ");
            String maNm = sc.nextLine();
            NhaMay nm = new NhaMay(tenNm, maNm);
            SanPham sp000 = new SanPham(maSP, tenSP, cannang, tien, nm);
            dsSanPham.add(sp000);
            System.out.println("Them san pham thanh cong");
        }
    }

    public void sapXepTien() {
        dsSanPham.sort(Comparator.comparingInt(SanPham::getGiaTien).reversed());
        inDanhSach();
    }

    public void chon() {
        dulieuMau();
        do {
            System.out.println("______________________");
            System.out.println("++++MENU++++");
            System.out.println("1_In danh sach san pham");
            System.out.println("2_Them san pham");
            System.out.println("3_Sap xep theo gia tien");
            System.out.println("4_Thoat");
            System.out.println("______________________");
            System.out.println("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1 ->
                    inDanhSach();
                case 2 ->
                    themSanPham();
                case 3 ->
                    sapXepTien();
                case 4 ->
                    System.exit(0);

                default ->
                    System.out.println("nhap lua chon khong hop le");
            }

        } while (chon != 0);
    }

    public static void main(String[] args) {
       
        Demo dmm = new Demo();
        dmm.chon();
    }

}
