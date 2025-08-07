// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tx2_ontap;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CongNhanControl control = new CongNhanControl();

        int chon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap cong nhan");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Sap xep theo gio lam giam dan");
            System.out.println("4. Them du lieu mau ");
            System.out.println("5. Ghi file congnhan.txt");
            System.out.println("6. Doc du lieu tu file congnhan.txt");
            System.out.println("7. Tim cong nhan theo ma");
            System.out.println("8. Xoa cong nhan theo ma");
            System.out.println("9. Sua cong nhan theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    CongNhan cn = new CongNhan();
                    cn.inputData();
                    control.addData(cn);
                    break;
                case 2:
                    control.hienThiDS();
                    break;
                case 3:
                    control.sortData();
                    break;
                case 4:
                    control.fakeData();
                    System.out.println("Da them du lieu mau.");
                    break;
                case 5:
                    control.writeToFile("congnhan.txt");
                    break;

                case 6:
                    control.readFromFile("congnhan.txt");
                    break;
                case 7:
                    System.out.print("Nhap ma can tim: ");
                    String maTim = sc.nextLine();
                    control.timKiemTheoMa(maTim);
                    break;
                case 8:
                    System.out.print("Nhap ma can xoa: ");
                    String maXoa = sc.nextLine();
                    control.xoaTheoMa(maXoa);
                    break;
                case 9:
                    System.out.print("Nhap ma can sua: ");
                    String maSua = sc.nextLine();
                    control.suaTheoMa(maSua);
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    break;

                default:
                    System.out.println("Lua chon sai!");
            }
        } while (chon != 0);
    }

}
