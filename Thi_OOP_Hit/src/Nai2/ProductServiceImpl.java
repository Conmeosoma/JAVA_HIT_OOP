// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <

package Nai2;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductServiceImpl implements ProductService {
    ArrayList<Product> ds = new ArrayList<>();

    @Override
    public void addProduct(Product p) {
        ds.add(p);
    }

    @Override
    public void updateProduct(String id, Product newInfo) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getId().equals(id)) {
                ds.set(i, newInfo);
                break;
            }
        }
    }

    @Override
    public void deleteProduct(String id) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getId().equals(id)) {
                ds.remove(i);
                break;
            }
        }
    }

    @Override
    public Product findByName(String name) {
        for (Product p : ds) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void sortByPriceAsc() {
        ds.sort(Comparator.comparingDouble(Product::getPrice));
    }

    @Override
    public void sortByPriceDesc() {
        ds.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }

    @Override
    public void printProducts() {
        for (Product p : ds) {
            System.out.printf("%-10s %-20s %-10.2f %-10d %-15s %-20s\n", p.getId(), p.getName(), p.getPrice(),
                    p.getQuantity(), p.getCategory(), p.getManufacturer().getName());
        }
    }

    public void inTieuDe() {
        System.out.printf("%-10s %-20s %-10s %-10s %-15s %-20s\n", "ID", "Name", "Price", "Quantity", "Category",
                "Manufacturer");
    }

    public void demo() {
        ds.add(new ClothingProduct("C01", "Ao thun", 150.0, 50, "Clothing",
                new Manufacturer("M01", "Nike", "Ha noi", "123@gmail.com")));
        ds.add(new ElectronicProduct("C012", "Ao thun1", 1510.0, 510, "Clo313thing",
                new Manufacturer("M021", "N23ike", "Ha n3oi", "123@342gmail.com")));
        ds.add(new ElectronicProduct("C013", "Ao thun2", 1520.0, 520, "Clo13thing",
                new Manufacturer("M301", "Ni4ke", "Ha n33oi", "123@2432gmail.com")));
        ds.add(new ClothingProduct("C014", "Ao thun3", 1530.0, 530, "Clo12thing",
                new Manufacturer("M031", "Nrwike", "Ha nreoi", "1243@23gmail.com")));
        ds.add(new FoodProduct("C015", "Ao thun4", 1540.0, 504, "Cl12othing",
                new Manufacturer("M041", "Nirewke", "Ha n42oi", "123@grwermail.com")));
        ds.add(new ClothingProduct("C016", "Ao thun5", 1550.0, 540, "Clo12thing",
                new Manufacturer("M051", "Nerwike", "Ha nrwoi", "123@rgmail.com")));

    }

}
