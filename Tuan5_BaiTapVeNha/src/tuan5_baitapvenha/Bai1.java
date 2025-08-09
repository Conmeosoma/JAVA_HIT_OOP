// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan5_baitapvenha;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + " ");
            students[i] = new Student();
            students[i].input();
        }
        System.out.println("Danh sach sinh vien");
        for (Student sv : students) {
            sv.output();
            System.out.println(".......................");

        }
    }

}
