// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan5_baitaplop;

import java.util.Scanner;

public class Pet {

    static Scanner sc = new Scanner(System.in);

    private String name;
    private double weight;
    private String Animal;

    public Pet() {

    }

    public Pet(String name, double weight, String Animal) {
        this.name = name;
        this.weight = weight;
        this.Animal = Animal;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Animal: " + Animal);
        System.out.println("Weight: " + weight);
    }

    public boolean isOverWeight() {
        return weight > 10;

    }

    public String getBasicInfo() {
        return name + Animal;
    }

    public void inputData() {
        System.out.println("Nhap ten cua thu cung");
        name = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap can nag cua thu cung: ");
        weight = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap loai cua thu cung: ");
        Animal = sc.nextLine();
    }

    public void outputData() {
        System.out.printf("%-10s %-20s %-10s\n", name, weight, Animal);

    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getAnimal() {
        return Animal;
    }
}
