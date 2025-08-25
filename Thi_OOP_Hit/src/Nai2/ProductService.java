/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Nai2;

/**
 *
 * @author ADMIN
 */
public interface ProductService {
    void addProduct(Product p);

    void updateProduct(String id, Product newInfo);

    void deleteProduct(String id);

    Product findByName(String name);

    void sortByPriceAsc();

    void sortByPriceDesc();

    void printProducts();
}
