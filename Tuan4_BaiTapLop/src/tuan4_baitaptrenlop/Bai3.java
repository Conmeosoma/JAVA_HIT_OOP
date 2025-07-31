/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan4_baitaptrenlop;

/**
 *
 * @author ADMIN
 */
public class Bai3 {

    public static void main(String[] args) {

        // k tham so
        Car car1 = new Car();
        car1.nhapXe();
        car1.run();
        car1.checktodoc();

        // co tham so
        Car car2 = new Car("MEC", 300);
        car2.run();
        car2.checktodoc();

    }

}
