import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Mang vua nhap la: ");
        int tong = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = a[0];
            if (a[i] > max) {
                max = a[i];
            }
            tong += a[i];
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("tong = " + tong);
        System.out.println("gia tri lon nhap la: " + max);
    }
}