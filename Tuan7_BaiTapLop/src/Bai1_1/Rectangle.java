// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package Bai1_1;

public class Rectangle extends Shape {

    private double chieudai;
    private double chieurong;

    public Rectangle() {
    }

    public Rectangle(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }
    

    @Override
    public double area() {
        return (chieudai * chieurong);

    }

}
