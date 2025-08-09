// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan5_baitapvenha;

import java.util.Scanner;

public class School {

    Scanner sc = new Scanner(System.in);

    private String name;
    private String date;

    public School() {

    }

    public School(String name, String date) {
        this.name = name;
        this.date = date;
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

    void input() {
        System.out.println("Nhap ten truong: ");
        name = sc.nextLine();
        System.out.println("Nhap ngay vao truong: ");
        date = sc.nextLine();

    }

    void output() {
        System.out.println("Ten truong: " + name);
        System.out.println("Ngay vao truong: " + date);
    }

}
