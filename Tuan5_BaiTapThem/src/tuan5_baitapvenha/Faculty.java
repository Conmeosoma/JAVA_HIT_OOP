// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan5_baitapvenha;

import java.util.Scanner;

public class Faculty {

    Scanner sc = new Scanner(System.in);

    private String name;
    private String date;
    private School x;

    public Faculty() {
        x = new School();

    }

    public Faculty(String name, String date, School x) {
        this.name = name;
        this.date = date;
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }

    void input() {
        System.out.println("Nhap ten khoa: ");
        name = sc.nextLine();
        System.out.println("Nhap ngay khoa: ");
        date = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap thong tin truong");
        x.input();
    }

    void output() {
        System.out.println("Ten khoa: " + name);
        System.out.println("Ngay vao khoa: " + date);
        System.out.println("Thong tiin truong: ");
        x.output();
    }

}
