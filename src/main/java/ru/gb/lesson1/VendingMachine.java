package ru.gb.lesson1;

import java.util.List;

public class VendingMachine {
    final List<Product> productList;

    public VendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    public Product getProduct(int idProduct) {
        for (Product product : this.productList) {
            if (idProduct == product.getIdProduct()) {
                return product;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "productList=" + productList +
                '}';
    }
}
