package BaiTapThem;

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("nhap kick thuoc cua ma tran"
                + " ");
        int kichThuoc = nhap.nextInt();

        int[][] mang = new int[kichThuoc][kichThuoc];

        int soHienTai = 1;
        int tren = 0, duoi = kichThuoc - 1;
        int trai = 0, phai = kichThuoc - 1;

        while (soHienTai <= kichThuoc * kichThuoc) {
            // Đi sang phải
            for (int cot = trai; cot <= phai; cot++) {
                mang[tren][cot] = soHienTai++;
            }
            tren++;

            for (int dong = tren; dong <= duoi; dong++) {
                mang[dong][phai] = soHienTai++;
            }
            phai--;

            for (int cot = phai; cot >= trai; cot--) {
                mang[duoi][cot] = soHienTai++;
            }
            duoi--;

            for (int dong = duoi; dong >= tren; dong--) {
                mang[dong][trai] = soHienTai++;
            }
            trai++;
        }
// in mang
        System.out.println("Mang la :");
        for (int dong = 0; dong < kichThuoc; dong++) {
            for (int cot = 0; cot < kichThuoc; cot++) {
                System.out.print(mang[dong][cot]);
            }
            System.out.println();
        }
    }
}
// tien dz