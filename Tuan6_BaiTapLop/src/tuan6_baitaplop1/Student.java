// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan6_baitaplop1;

public class Student extends Person {

    private String maSv;
    private String tenTruong;

    public Student() {
    }

    public Student(String maSv, String hehe, String name, int age) {
        super(name, age);
        this.maSv = maSv;
        this.tenTruong = hehe;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    @Override
    public void eat() {
        System.out.println("Uong nuoc");

    }

//    public boolean check() {
//        try {
//            if (true) {
//                System.out.println("Tot nghiep");
//            } else {
//                System.out.println("CHua tot nghiep");
//            }
//            return 
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }

    @Override
    public String toString() {
        return "Student{" + "maSv=" + maSv + ", tenTruong=" + tenTruong + '}';
    }
    
}
