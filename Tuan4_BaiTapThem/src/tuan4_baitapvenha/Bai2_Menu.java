// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan4_baitapvenha;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bai2_Menu {

    static int chon;
    static ArrayList<Student> dsSinhVien = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static Student test = new Student();

    public void chon() {
        do {
            System.out.println("=====MENU=====");
            System.out.println("1_Them sinh vien moi");
            System.out.println("2_Sua thong tin sinh vien");
            System.out.println("3_Sap xep sinh vien theo tuoi");
            System.out.println("4_Sap xep sinh vien theo GPA");
            System.out.println("5_Sap xep sinh vien theo so tiet nghi");
            System.out.println("6_Xoa sinh vien ra khoi danh sach");
            System.out.println("7_Nguoi dang xem MENU dep zai");
            System.out.println("8_Jack 5 trieu");
            System.out.println("_______________________________");
            System.out.println("Nhap lua chon cua ban: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1 ->
                    themSinhVien();
                case 2 ->
                    suaSinhVien();
                case 3 ->
                    sapXepTuoi();
                case 4 ->
                    sapXepGPA();
                case 5 ->
                    sapXepTietNghi();
                case 6 ->
                    xoaSinhVien();
                case 7 ->
                    viewDepZai();
                case 8 ->
                    jack();
                default ->
                    System.out.println("Lua chon k hop le: ");

            }
        } while (chon != 0);
    }

    public void hienThiDanhSach() {
        for (Student sv : dsSinhVien) {
            System.out.println(sv);
        }
    }

    public void themSinhVien() {
        System.out.println("Nhap ten sinh vien ban muon them: ");
        String ten = sc.nextLine();
        System.out.println("Nhap nam sinh cua sinh vien: ");
        int namSinh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi cua sinh vien: ");
        String diachi = sc.nextLine();
        System.out.println("Nhap lan luot diem tx1 tx2 kthp");
        double tx1 = sc.nextDouble();
        double tx2 = sc.nextDouble();
        double kthp = sc.nextDouble();
        System.out.println("Nhap so tiet nghi cua sinh vien");
        int soTietNghi = sc.nextInt();
        sc.nextLine();
        Student st = new Student(ten, namSinh, diachi, tx1, tx2, kthp, soTietNghi);
        dsSinhVien.add(st);
    }

    public void suaSinhVien() {
        System.out.println("Nhap ten sinh vien ban muon sua(ghi chinh xac)");
        String tenCanSua = sc.nextLine();
        sc.nextLine();
        boolean timThay = false;
        for (Student checkSv : dsSinhVien) {
            if (checkSv.getTen().equalsIgnoreCase(tenCanSua)) {
                timThay = true;
                System.out.println("Sua nam sinh cua sinh vien " + checkSv.getTen());
                int namSinh = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap dia chi cua sinh vien " + checkSv.getTen());
                String diachi = sc.nextLine();
                System.out.println("Nhap lan luot diem tx1 tx2 kthp " + checkSv.getTen());
                double tx1 = sc.nextDouble();
                double tx2 = sc.nextDouble();
                double kthp = sc.nextDouble();
                System.out.println("Nhap so tiet nghi cua sinh vien " + checkSv.getTen());
                int soTietNghi = sc.nextInt();
                sc.nextLine();

                checkSv.setNamSinh(namSinh);
                checkSv.setDiaChi(diachi);
                checkSv.setTx1(tx1);
                checkSv.setTx2(tx2);
                checkSv.setKthp(kthp);
                checkSv.setSoTietNghi(soTietNghi);
                System.out.println("Cap nhat thong tinh sv thanh cong");

                break;

            }

        }
        if (!timThay) {
            System.out.println("Ten Sinh Vien nay k co trong dnah sach");
        }

    }

    public void sapXepTuoi() {
        if (dsSinhVien.isEmpty()) {
            System.out.println("Danh sach rong");

        } else {
            dsSinhVien.sort(Comparator.comparingInt(Student::tuoi));
            System.out.println("Sap xep tho tuoi la: ");
            hienThiDanhSach();

        }
    }

    public void sapXepGPA() {
        if (dsSinhVien.isEmpty()) {
            System.out.println("Danh sach rong");

        } else {
            dsSinhVien.sort(Comparator.comparingDouble(Student::GPA));
            System.out.println("DS sap xep theo GPA la: ");
            hienThiDanhSach();
        }
    }

    public void sapXepTietNghi() {
        if (dsSinhVien.isEmpty()) {
            System.out.println("Danh sach rong");

        } else {
            dsSinhVien.sort(Comparator.comparingInt(Student::getSoTietNghi));
            System.out.println("DS sap xep theo so tiet nghi la: ");
            hienThiDanhSach();

        }
    }

    public void xoaSinhVien() {
        boolean timthay = false;
        System.out.println("Nhap ten sinh vien can xoa: ");
        String tenCanXoa = sc.nextLine();

        for (int i = 0; i < dsSinhVien.size(); i++) {
            if (dsSinhVien.get(i).getTen().equalsIgnoreCase(tenCanXoa)) {
                dsSinhVien.remove(i);
                System.out.println("Đã xóa sinh viên " + tenCanXoa + " thành công!");
                timthay = true;
                break;
            }
        }

        if (!timthay) {
            System.out.println("Không tìm thấy sinh viên tên: " + tenCanXoa);
        }
    }

    public void viewDepZai() {
        System.out.println("Toi cung thay vay:V");

    }

    public void jack() {
        System.out.println("Bat gap 1 con dom");

    }

    public static void main(String[] args) {
        Bai2_Menu bt2 = new Bai2_Menu();
        bt2.chon();
    }

}
