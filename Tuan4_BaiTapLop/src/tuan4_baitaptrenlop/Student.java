package tuan4_baitaptrenlop;

import java.util.Scanner;

public class Student {

    Scanner sc = new Scanner(System.in);

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {

    }

    public void sayHello() {
        System.out.println("Hello ,my name is: " + name + " " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void nhap() {
        System.out.println("Nhap ten");
        name = sc.nextLine();
        System.out.println("Nhap age");
        age = sc.nextInt();

    }

    //  @Override
//    public String toString() {
//        return "
//    }
    @Override
    public String toString() {
        return "Student{" + ", name=" + name + ", age=" + age + '}';
    }
}
