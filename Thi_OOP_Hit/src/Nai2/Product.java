// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <

package Nai2;

public abstract class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
    private String category;
    private Manufacturer manufacturer;

    public Product() {
    }

    public Product(String id, String name, double price, int quantity, String category, Manufacturer manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.manufacturer = manufacturer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getDiscountPrice() {
        return price;
    }

}
