// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package Bai1_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        double chieudai = sc.nextDouble();
        double chieurong = sc.nextDouble();
        Rectangle hcn = new Rectangle(chieudai, chieurong);
        System.out.println("Nhap ban klinh: ");
        Double r = sc.nextDouble();
        Circle ht = new Circle(r);
        Shape[] ds = new Shape[2];
        ds[0] = hcn;
        ds[1] = ht;
        System.out.println("Hcnn = " + ds[0].area());
        System.out.println("Ht = " + ds[1].area());

//        ds[2] = (Shape) new Rectangle();
    }

}
