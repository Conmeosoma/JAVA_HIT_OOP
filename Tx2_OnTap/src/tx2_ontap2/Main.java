// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tx2_ontap2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();
        int choice;

        do {
            System.out.println("\n----- MENU QUAN LY NHAN VIEN -----");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Xoa nhan vien theo ID");
            System.out.println("3. Tim nhan vien theo ten");
            System.out.println("4. Ghi danh sach vao file");
            System.out.println("5. Doc danh sach tu file");
            System.out.println("6. Hien thi danh sach nhan vien");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    Employee e = new Employee();
                    e.inputData();
                    if (manager.addEmployee(e)) {
                        System.out.println("Them thanh cong.");
                    } else {
                        System.out.println("Them that bai (trung ID?).");
                    }
                    break;
                case 2:
                    System.out.print("Nhap ID nhan vien can xoa: ");
                    String id = sc.nextLine();
                    Employee delEmp = manager.findById(id);
                    if (delEmp != null && manager.delEmployee(delEmp)) {
                        System.out.println("Xoa thanh cong.");
                    } else {
                        System.out.println("Khong tim thay nhan vien.");
                    }
                    break;
                case 3:
                    System.out.print("Nhap ten can tim: ");
                    String name = sc.nextLine();
                    manager.searchEmployee(name).forEach(Employee::printData);
                    break;
                case 4:
                    if (manager.saveEmployeeToFile("employees.dat")) {
                        System.out.println("Luu file thanh cong.");
                    } else {
                        System.out.println("Luu file that bai.");
                    }
                    break;
                case 5:
                    if (manager.readEmployeeFromFile("employees.dat")) {
                        System.out.println("Doc file thanh cong.");
                    } else {
                        System.out.println("Doc file that bai.");
                    }
                    break;
                case 6:
                    manager.getList().forEach(Employee::printData);
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }

        } while (choice != 0);
    }
}
