package tuan5_baitaplop;

import java.util.Scanner;
import tuan5_baitaplop.Cage;
import tuan5_baitaplop.Pet;

public class Main {

    static int choi;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cage cage1 = new Cage("CAGE1");
        Cage cage2 = new Cage("CAGE2");

        cage1.addPet(new Pet("Tom", 5.2, "Cat"));
        cage1.addPet(new Pet("Jerry", 0.7, "Mouse"));
        cage1.addPet(new Pet("Wang", 65, "Pig"));

        cage2.addPet(new Pet("Jack", 0.5, "j97"));
        cage2.addPet(new Pet("TRex", 15300, "Dinosauraur"));
        cage2.addPet(new Pet("Jack", 0.5, "j97"));
        cage2.addPet(new Pet("TRex", 15300, "Dinosauraur"));

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. So long da tao: ");
            System.out.println("2. Danh sach thu trong tung long");
            System.out.println("3. Ds thu nang hon 10kg");
            System.out.println("0. OUT");
            System.out.print("Nhap lua chon cua ban: ");
            choi = sc.nextInt();
            System.out.println("___________________");

            switch (choi) {
                case 1:
                    System.out.println(" So long da tao: " + Cage.totalCages);
                    break;
                case 2:
                    cage1.printAllPets();
                    cage2.printAllPets();
                    break;
                case 3:
                    System.out.println("Ds thu nang hon 10 kg:");
                    System.out.printf("%-10s %-10s %-10s\n", "Name", "Weight", "Anmal");
                    for (Pet pet : cage1.getPets()) {
                        if (pet.isOverWeight()) {
                            pet.printInfo();
                        }
                    }
                    for (Pet pet : cage2.getPets()) {
                        if (pet.isOverWeight()) {
                            pet.printInfo();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap lai: ");
            }

        } while (choi != 0);

        sc.close();
    }
}
