// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan5_baitaplop;

import java.util.ArrayList;
import java.util.Scanner;

public class Cage {

    private ArrayList<Pet> dspet;

    int currentPetCount = 0;
    static public int totalCages = 0;
    static final int MAX_CAPACITY = 3;

    private String cageCode;

    public Cage() {

    }

    public Cage(String cageCode) {
        this.cageCode = cageCode;
        this.dspet = new ArrayList<>();
        this.currentPetCount = 0;
        totalCages++;

    }

    public String getCageCode() {
        return cageCode;
    }

    public void setCageCode(String cageCode) {
        this.cageCode = cageCode;
    }

    public void addPet(Pet petz) {
        if (currentPetCount < MAX_CAPACITY) {
            dspet.add(petz);
            currentPetCount++;
            System.out.println("Da them thu cung vao " + cageCode);
        } else {
            System.out.println("Long da Day: " + cageCode);
        }
    }

    public void printAllPets() {
        System.out.println("Danh sach pets");
        if (dspet.isEmpty()) {
            System.out.println("Long trong !!! ");
        } else {
            System.out.println("Ma long   Name Pet   CanNang Pet   LoaiDongVat");
            for (Pet petx : dspet) {
                petx.outputData();
            }
        }

    }

    public ArrayList<Pet> getPets() {
        return dspet;
    }

}
