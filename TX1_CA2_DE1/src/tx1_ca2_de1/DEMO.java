package tx1_ca2_de1;

import java.util.ArrayList;
import java.util.Scanner;

public class DEMO {

    static int chon;
    static Scanner sc = new Scanner(System.in);
    static ArrayList<KhachHang> dsKhachHang = new ArrayList<>();

    public static void inDanhSach() {
        System.out.println("Danh sach khach hang la: ");
        for (KhachHang kh : dsKhachHang) {
            System.out.println(kh);
        }
    }
    public static void themKhachHang(){
        System.out.println("Nhap ma khach hang: ");
        int makh = sc.nextInt();
        System.out.println("");
        
        
        
    }

    public static void main(String[] args) {

    }

}
