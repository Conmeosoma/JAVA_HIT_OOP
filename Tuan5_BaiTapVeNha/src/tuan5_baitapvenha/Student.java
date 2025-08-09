// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan5_baitapvenha;

import java.util.Scanner;

public class Student {

    Scanner sc = new Scanner(System.in);

    private String name;
    private String classs;
    private double score;
    private Faculty y;

    public Student() {
        y = new Faculty();

    }

    public Student(String name, String classs, double score, Faculty y) {
        this.name = name;
        this.classs = classs;
        this.score = score;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }

    void input() {
        System.out.println("Nhap ten hoc sinh: ");
        name = sc.nextLine();
        System.out.println("Nhap ten lop: ");
        classs = sc.nextLine();
        System.out.println("Nhap diem cua hoc sinh: ");
        score = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap thong tin khoa ");
        y.input();

    }

    void output() {
        System.out.println("Ten hoc sinh: " + name);
        System.out.println("Ten lop: " + classs);
        System.out.println("Diem cua hoc sinh: " + score);
        y.output();

    }

}
