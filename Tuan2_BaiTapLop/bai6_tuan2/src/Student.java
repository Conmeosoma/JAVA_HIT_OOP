import java.util.Scanner;

public class Student {
    public static void Nhap(int n)
    {
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
    }

    public static void main(String[] args) {

        int n = 0;
        Nhap(n);
        System.out.println(n);
    }
}
