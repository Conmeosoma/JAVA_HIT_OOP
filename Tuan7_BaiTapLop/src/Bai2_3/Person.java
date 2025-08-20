// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <

package Bai2_3;





public class Person {
    private String name;
    private Address diachi;

    public Person(String name, Address diachi) {
        this.name = name;
        this.diachi = diachi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getDiachi() {
        return diachi;
    }

    public void setDiachi(Address diachi) {
        this.diachi = diachi;
    }
    public void show(){
        System.out.println("NName" + name);
        System.out.println("dia chi" + diachi.getStreet() + diachi.getCity());
    }
          
}
