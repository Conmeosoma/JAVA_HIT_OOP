// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package Test;

public class Cat extends Animal {

    private String keu;

    public Cat(int age, String keu) {
        super(age);
        this.keu = keu;

    }

    public String getKeu() {
        return keu;
    }

    public void setKeu(String keu) {
        this.keu = keu;
    }

    @Override
    public void eat() {
        System.out.println("KKho KHo");

    }

}
