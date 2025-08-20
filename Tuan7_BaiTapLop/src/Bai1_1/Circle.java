// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package Bai1_1;

public class Circle extends Shape {

    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return 3.14 * r * r;

    }

}
