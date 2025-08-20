// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package Bai2_Bai3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int chon;
        StudentManager qlhs = new StudentManager();
        qlhs.addStudent(new Student("001", "Khuong Tan 0:V", 9.12, 30, "TOanog@Gmail.com", "Ktp k18", "HA Noi"));
        qlhs.addStudent(new Student("002", "Khuong Tan 1 :V", 7.2, 33, "TOankhuon@mail.com", "Ktm k18", "HA Noi1"));
        qlhs.addStudent(new Student("003", "Khuong Tan 2:V", 6.1, 32, "TOankhuong@Gmal.com", "Kpm k18", "HA Noi2"));
        qlhs.addStudent(new Student("004", "Khuong Tan 3:V", 3.2, 32, "TOankhuong@Gmai.om", "tpm k18", "HA No3"));
        qlhs.addStudent(new Student("005", "Khuong Tan 4:V", 1.1, 31, "TOankhuong@Gmail.cm", " k18", "HA N"));
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("__________________________________________");
            System.out.println("MENUU");
            System.out.println("1_In ds hs");
            System.out.println("2_ Sap xep up");
            System.out.println("3_Sap xep down");
            System.out.println("4_Tim ten hs");
            System.out.println("5_Thoat");
            System.out.println("Nhap lua chon cua ban");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    qlhs.printStudents();
                    break;
                case 2:
                    qlhs.sortByScoreAsc();
                    break;
                case 3:
                    qlhs.sortByScoreDesc();
                    break;
                case 4:
                    System.out.println("Nhap ten ma ban muon tim");
                    String nameFind = sc.nextLine();
                    qlhs.findByName(nameFind);
                    break;
                case 5:
                    System.exit(0);

                    break;
                case 6:
                    System.out.println("A toan xau trai");

                    break;
                default:
                    System.out.println("Lua chon k hop le vui long nmhap lai!!!");

            }
            ;

        } while (chon != 0);

    }

}
