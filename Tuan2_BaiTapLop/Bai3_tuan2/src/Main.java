import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a + b = "+(a + b));
        System.out.println("a - b = "+(a - b));
        System.out.println("a * b = "+(a*b));
        System.out.println("a % b = "+(a%b));
        System.out.println("a / b = "+(a/ b));
        if( a == b)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }


    }
}