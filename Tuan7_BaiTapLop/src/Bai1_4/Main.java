// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package Bai1_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a == 0) {
                throw new Exception(" loi");
            }
            int b = sc.nextInt();
            int c = a / b;

        } catch (Exception e) {
        }

    }

}
