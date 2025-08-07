// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tx2_ontap2;

import java.util.Scanner;

public class Employee extends Person {

    private String address;
    private double salary;
    private double commission;

    public Employee() {

    }

    public Employee(String id, String name, int age, String address, double salary, double commission) {
        super(id, name, age);
        this.address = address;
        this.salary = salary;
        this.commission = commission;
    }

    @Override
    public void printTitle() {
        System.out.printf("%-10s %-20s %-5s %-20s %-10s %-10s\n", "ID", "Name", "Age", "Address", "Salary", "Commission");
    }

    @Override
    public void printData() {
        super.printData();
        System.out.printf(" %-20s %-10.2f %-10.2f\n", address, salary, commission);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        id = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập dia chi ");
        address = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        salary = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập hệ số lương: ");
        commission = Double.parseDouble(sc.nextLine());
    }

}
