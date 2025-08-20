// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package Bai3_1;

public class Manager extends Employee {

    private double phuCapQuanLy;
    Employee nv = new Employee();

    public Manager() {
    }

    public Manager(double phuCapQuanLy, double luongCoBan) {
        super(luongCoBan);
        this.phuCapQuanLy = phuCapQuanLy;
    }

    public double getPhuCapQuanLy() {
        return phuCapQuanLy;
    }

    public void setPhuCapQuanLy(double phuCapQuanLy) {
        this.phuCapQuanLy = phuCapQuanLy;
    }

    @Override
    public double getSalary() {
        return nv.getSalary() + phuCapQuanLy;
    }

}
