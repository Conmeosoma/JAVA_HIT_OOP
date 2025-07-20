import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap lan luot ten,tuoi va chieu cao: ");
        String Name = sc.nextLine();
        int Age = sc.nextInt();
        double chieucao = sc.nextDouble();
        System.out.println("Xin chao " + Name + ", ban " + Age + " tuoi va cao " + chieucao + " met.");


        

    }
}