package ontap_kttx1;

import java.util.ArrayList;
import java.util.Scanner;

public class TaiLieuDemo {

    static ArrayList<TL> danhSach = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int chon;

    public static void chon() {
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - xuat du lieu");
            System.out.println("2 - Nhap va in");
            System.out.println("3 - Sua tai lieu theo nam xuat ban");
            System.out.println("4 - In danh sach tai lieu");
            System.out.println("0 - BYE");
            System.out.print("Choose: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1 ->
                    duLieuMau(); // Đã sửa: gọi trực tiếp phương thức
                case 2 ->
                    nhapThemTaiLieu();
                case 3 ->
                    suaTaiLieuTheoNam();
                case 4 ->
                    inDanhSach();
            }
        } while (chon != 0);
    }

    public static void duLieuMau() {
        danhSach.add(new TL("TL001", "Lap Trinh C", 2021, 120));
        danhSach.add(new TL("TL002", "Java Co Ban", 2022, 300));
        danhSach.add(new TL("TL003", "Cau Truc DL", 2020, 250));
        danhSach.add(new TL("TL004", "Ki thuat lap trinh", 2026, 150));
        inDanhSach();
    }

    public static void nhapThemTaiLieu() {
        while (true) {
            System.out.print("Nhap ma TL (de trong de thoat): ");
            String ma = sc.nextLine();
            if (ma.isEmpty()) {
                break;
            }

            System.out.print("Ten TL: ");
            String ten = sc.nextLine();
            System.out.print("Nam xuat ban: ");
            int nam = sc.nextInt();
            System.out.print("So trang: ");
            int soTrang = sc.nextInt();
            sc.nextLine(); // bỏ dòng

            // Kiểm tra số trang hợp lệ trước khi tạo đối tượng
            int ketQua = TL.kiemTraTrang(soTrang);
            if (ketQua == 0) {
                TL tl = new TL(ma, ten, nam, soTrang);
                danhSach.add(tl);
            } else {
                switch (ketQua) {
                    case 1 ->
                        System.out.println("Lỗi: Số trang = 0");
                    case 2 ->
                        System.out.println("Lỗi: Số trang âm");
                    case 3 ->
                        System.out.println("Lỗi: Số trang > 500");
                }
            }
        }
    }

    public static void suaTaiLieuTheoNam() {
        System.out.print("Nhap nam xuat ban can tim: ");
        int nam = sc.nextInt();
        sc.nextLine();
        boolean timThay = false;
        for (TL tl : danhSach) {
            if (tl.getNamXuatBan() == nam) {
                timThay = true;
                System.out.print("Nhap nam xuat ban moi cho " + tl.getMaTL() + ": ");
                int namMoi = sc.nextInt();
                sc.nextLine();
                tl.setNamXuatBan(namMoi);
                System.out.println("Da cap nhat nam xuat ban!");
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay tai lieu nao co nam xuat ban " + nam);
        }
    }

    public static void inDanhSach() {
        System.out.println(String.format("| %-10s | %-20s | %-10s | %-8s |",
                "Ma TL", "Ten TL", "Nam XB", "So trang"));
        for (TL tl : danhSach) {
            System.out.println(tl);
        }
    }

    public static void main(String[] args) {
        chon();
    }
}
