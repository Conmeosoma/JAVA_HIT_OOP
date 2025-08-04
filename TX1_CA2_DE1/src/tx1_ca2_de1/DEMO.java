package tx1_ca2_de1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class DEMO {

    static int chon;
    static Scanner sc = new Scanner(System.in);
    static ArrayList<KhachHang> dsKhachHang = new ArrayList<>();

    public void chon() {
        do {
            System.out.println("=====MENU=====");
            System.out.println("1_In danh sach khach hang");
            System.out.println("2_Them khach hang");
            System.out.println("3_Sap xep danh sach va hien thi");
            System.out.println("  Nhap lua chon cua ban: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1 ->
                    inDanhSach();
                case 2 ->
                    themKhachHang();
                case 3 ->
                    sapXepTienMua();
                default ->
                    System.out.println("Lua chon k hop le !!");

            }

        } while (chon != 0);
    }

    public static void inTieuDe() {
        System.out.println(String.format("|%-10s | %-20s | %-20s | %-12s | %-10s |","maKhachHang", "Ten", "Dia chi", "So dien thoai", "SO tien mua hang"));
    }

    public static void duLieuMau() {
        DiaChi dc1 = new DiaChi(01, "AAAA");
        KhachHang kh1 = new KhachHang("123", "Nguyen Van A", dc1, "012345", 12000);
        DiaChi dc2 = new DiaChi(02, "BBBB");
        KhachHang kh2 = new KhachHang("321", "Nguyen Van B", dc2, "01234", 13000);
        DiaChi dc3 = new DiaChi(03, "CCCC");
        KhachHang kh3 = new KhachHang("123", "Nguyen Van C", dc3, "012345", 14000);
        DiaChi dc4 = new DiaChi(04, "DDDD");
        KhachHang kh4 = new KhachHang("321", "Nguyen Van D", dc4, "01234", 15000);
        dsKhachHang.add(kh1);
        dsKhachHang.add(kh2);
        dsKhachHang.add(kh3);
        dsKhachHang.add(kh4);
    }

    public static void inDanhSach() {
        
        if (dsKhachHang.isEmpty()) {
            System.out.println("Danh sach khach hang trong");
        } else {
            System.out.println("Danh sach khach hang: ");
            // duLieuMau();
            inTieuDe();
            for (KhachHang kh : dsKhachHang) {
                System.out.println(kh);
            }
        }
    }

    public static void themKhachHang() {
        System.out.println("Nhap ma khach hang: ");
        String makh = sc.nextLine();

        System.out.println("Nhap ho va ten: ");
        String ten = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        System.out.println("so nha");
        int soNha = sc.nextInt();
        sc.nextLine();
        System.out.println("ten duong");
        String tenDuong = sc.nextLine();
        System.out.println("Nhap so dien thoai: ");
        String sdt = sc.nextLine();
        System.out.println("So tien mua: ");
        int tien = sc.nextInt();
        DiaChi dc = new DiaChi(soNha, tenDuong);
        KhachHang kh = new KhachHang(makh, ten, dc, sdt, tien);
        dsKhachHang.add(kh);
    }

    public void sapXepTienMua() {
        dsKhachHang.sort(Comparator.comparingInt(KhachHang::getSoTienMua).reversed());
        inDanhSach();
    }

    public static void main(String[] args) {
        duLieuMau();
        DEMO dm = new DEMO();
        dm.chon();
    }

}
