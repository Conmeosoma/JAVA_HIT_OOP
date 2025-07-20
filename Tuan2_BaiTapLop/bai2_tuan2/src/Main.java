import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        int Age = sc.nextInt();
        sc.nextLine();
        String Lop = sc.nextLine();
        double GPA = sc.nextDouble();
        System.out.println("Ten: " + Name + "- Tuoi: " + Age + "- Lop: " + Lop +"- GPA:" +GPA );

    }
}