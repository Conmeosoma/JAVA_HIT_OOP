// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package Bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap: ");
        String s = sc.nextLine();

        int demHoa = 0;
        int demAm = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (String.valueOf(ch).equalsIgnoreCase("a")
                    || String.valueOf(ch).equalsIgnoreCase("e")
                    || String.valueOf(ch).equalsIgnoreCase("i")
                    || String.valueOf(ch).equalsIgnoreCase("o")
                    || String.valueOf(ch).equalsIgnoreCase("u")) {
                demAm++;
            }

            if (Character.isUpperCase(ch)) {
                demHoa++;
            }
        }

        System.out.println("So ki tu nguyen am " + demAm);
        System.out.println("So ki tu hoa: " + demHoa);
    }
}
