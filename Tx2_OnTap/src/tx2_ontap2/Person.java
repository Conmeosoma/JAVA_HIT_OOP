// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tx2_ontap2;

public abstract class Person {

    protected String id;
    protected String name;
    protected int age;

    public Person() {
    }

    public Person(String id, String name, int age) {
        if (name == null || name.trim().isEmpty() || name.length() > 20) {
            throw new IllegalArgumentException("Tên không hợp lệ!");
        }
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public abstract void printTitle(); // Phương thức trừu tượng

    public void printData() {
        System.out.printf("%-10s %-20s %-5d", id, name, age);
    }
}
