// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package Bai1_3;

public class Main {

    public static void main(String[] args) {
        Animal[] ds = new Animal[3];
        ds[1] = new Cat();
        ds[0] = new Dog();
        ds[2] = new Bird();
        
        for(int i = 0 ; i < 3;i++){
            ds[i].makeSound();
        }
        

    }

}
