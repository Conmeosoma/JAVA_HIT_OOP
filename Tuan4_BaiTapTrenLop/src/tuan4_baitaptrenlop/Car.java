/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan4_baitaptrenlop;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Car {

    static final int gioiHanspeed = 90;
    Scanner sc = new Scanner(System.in);
    public String brand;
    public int maxSpeed;

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public Car() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", maxSpeed=" + maxSpeed + '}';
    }

    public void run() {
        System.out.println("Xe" + brand + "dang chay voi van toc toi da " + maxSpeed + "km/h");
    }

    public void nhapXe() {
        System.out.println("Nhap hang xe: ");
        brand = sc.nextLine();
        System.out.println("Nhap toc do: ");
        maxSpeed = sc.nextInt();
    }

    public void checktodoc() {
        if (maxSpeed < gioiHanspeed) {
            System.out.println("Toc do binh thuong");
        } else {
            System.out.println("Qua toc do !!!");
        }

    }

}
