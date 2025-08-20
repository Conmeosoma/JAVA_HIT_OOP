package Bai1;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int demHoa = 0;
        int demAm = 0;
        System.out.print("Nhap: ");
        String s = sc.nextLine();

        char[] nguyenAm = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < s.length(); i++) {
            char kitu = s.charAt(i);
            char check = Character.toLowerCase(kitu);

            for (int j = 0; j < nguyenAm.length; j++) {
                if (check == nguyenAm[j]) {
                    demAm++;
                }
            }

            if (kitu >= 'A' && kitu <= 'Z') {
                demHoa++;
            }
        }

        System.out.println("So ki tu nguyen am: " + demAm);
        System.out.println("So ki tu hoa: " + demHoa);
    }
}
