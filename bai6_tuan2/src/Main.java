import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien:  ");
        int n = sc.nextInt();

        String[] Name = new String[n];
        int[] Age = new int[n];
        double[] Diem = new double[n];
        sc.nextLine();
        for(int i = 0 ;i < n;i++)
        {
            System.out.print("Nhap ten: ");
            Name[i] = sc.nextLine();
            sc.nextLine();
            System.out.print("Nhap tuoi: ");
            Age[i] = sc.nextInt();
            System.out.print("Nhap diem: ");
            Diem[i] = sc.nextDouble();
            sc.nextLine();

        }
        int indexdiem = 0;
        double tongdiem = 0.0;
        for(int i = 0 ;i < n;i++)
        {
            System.out.print("Ten sinh vien: " + Name[i] + " ");
            System.out.print("Tuoi " + Age[i] + " ");
            tongdiem += Diem[i];
            System.out.println("Diem cua sinh vien " + Diem[i] + " ");
            if(Diem[i] > Diem[indexdiem])
            {
               indexdiem = i;
            }
        }
        System.out.println("Diem trung binh vien " + (tongdiem/n));
        System.out.println("Sinh vien co diem cao nhat la: " + Name[indexdiem] + "Voi so diem: " + Diem[indexdiem]);
    }
}