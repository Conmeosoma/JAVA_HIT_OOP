// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <

package Nai2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int chon;
        Scanner sc = new Scanner(System.in);
        ProductServiceImpl ql = new ProductServiceImpl();
        do {
            System.out.println("+++++++++MENU+++");
            System.out.println("1. Them danh sach demo");
            System.out.println("2. Add san pham");
            System.out.println("3. Sua san pham");
            System.out.println("4. Xoa san pham");
            System.out.println("5. Tim kiem san pham ");
            System.out.println("6. sap xep tang");
            System.out.println("7. sap xep giam");
            System.out.println("8. HIen thi");
            System.out.println("0. Thoat");
            System.out.println("Nhap lua chon cua bnan: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    ql.demo();
                    break;
                case 2:
                    System.out.println("Nhap id san pham: ");
                    String id = sc.nextLine();
                    System.out.println("Nhap ten san pham: ");
                    String name = sc.nextLine();
                    System.out.println("Nhap gia san pham: ");
                    double price = sc.nextDouble();
                    System.out.println("Nhap so luong san pham: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap danh muc san pham: ");
                    String category = sc.nextLine();
                    System.out.println("Nhap ten nha san xuat: ");
                    String idManu = sc.nextLine();
                    System.out.println("Nhap ten nha san xuat: ");
                    String nameManu = sc.nextLine();
                    System.out.println("Nhap dia chi nha san xuat: ");
                    String addressManu = sc.nextLine();
                    System.out.println("Nhap email nha san xuat: ");
                    String emailManu = sc.nextLine();
                    Manufacturer manu = new Manufacturer(idManu, nameManu, addressManu, emailManu);
                    System.out.println("Chon loai san pham: 1. Clothing 2. Electronic 3. Food");
                    Product p;
                    int loai = sc.nextInt();
                    sc.nextLine();
                    if (loai == 1) {
                        p = new ClothingProduct(id, name, price, quantity, category, manu);
                    } else if (loai == 2) {
                        p = new ElectronicProduct(id, name, price, quantity, category, manu);
                    } else {
                        p = new FoodProduct(id, name, price, quantity, category, manu);
                    }
                    ql.addProduct(p);

                    break;
                case 3:
                    System.out.println("Nhap id ma ban can tim");
                    String tenid = sc.nextLine();
                    for (int i = 0; i < ql.ds.size(); i++) {
                        if (ql.ds.get(i).getId().equals(tenid)) {
                            System.out.println("Nhap id san pham: ");
                            String newid = sc.nextLine();
                            System.out.println("Nhap ten san pham: ");
                            String newname = sc.nextLine();
                            System.out.println("Nhap gia san pham: ");
                            double newprice = sc.nextDouble();
                            System.out.println("Nhap so luong san pham: ");
                            int newquantity = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Nhap danh muc san pham: ");
                            String newcategory = sc.nextLine();
                            System.out.println("Nhap ten nha san xuat: ");
                            String newidManu = sc.nextLine();
                            System.out.println("Nhap ten nha san xuat: ");
                            String newnameManu = sc.nextLine();
                            System.out.println("Nhap dia chi nha san xuat: ");
                            String newaddressManu = sc.nextLine();
                            System.out.println("Nhap email nha san xuat: ");
                            String newemailManu = sc.nextLine();
                            Manufacturer newmanu = new Manufacturer(newidManu, newnameManu, newaddressManu,
                                    newemailManu);
                            System.out.println("Chon loai san pham: 1. Clothing 2. Electronic 3. Food");
                            int newloai = sc.nextInt();
                            sc.nextLine();
                            Product newp;
                            if (newloai == 1) {
                                newp = new ClothingProduct(newid, newname, newprice, newquantity, newcategory, newmanu);
                            } else if (newloai == 2) {
                                newp = new ElectronicProduct(newid, newname, newprice, newquantity, newcategory,
                                        newmanu);
                            } else {
                                newp = new FoodProduct(newid, newname, newprice, newquantity, newcategory, newmanu);
                            }
                            ql.updateProduct(tenid, newp);
                        }
                    }

                    break;
                case 4:
                    System.out.println("Nhap id ma ban can xoa: ");
                    String idxoa = sc.nextLine();
                    ql.deleteProduct(idxoa);

                    break;
                case 5:
                    System.out.println("Nhap ten ma ban can tim: ");
                    String tentim = sc.nextLine();
                    Product p1 = ql.findByName(tentim);
                    if (p1 != null) {
                        ql.inTieuDe();
                        System.out.printf("%-10s %-20s %-10.2f %-10d %-15s %-20s\n", p1.getId(), p1.getName(),
                                p1.getPrice(),
                                p1.getQuantity(), p1.getCategory(), p1.getManufacturer().getName());
                    } else {
                        System.out.println("Khong tim thay");
                    }

                    break;
                case 6:
                    System.out.println("Sap xep tang");
                    ql.sortByPriceAsc();

                    break;
                case 7:
                    System.out.println("Sap xep giam");
                    ql.sortByPriceDesc();

                    break;
                case 8:
                    System.out.println("HIen thi san pham");
                    ql.inTieuDe();
                    ql.printProducts();

                    break;

                default:
                    System.out.println("Lua  chon k hop le");
                    break;
            }

        } while (chon != 0);
        sc.close();

    }

}
