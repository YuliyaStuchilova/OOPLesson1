package ru.gb.lesson1;

import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine {

    public HotDrinkVendingMachine(List<Product> productList) {
        super(productList);
    }

    @Override
    public Product getProduct(int idProduct) {
        return super.getProduct(idProduct);
    }

    public HotDrinkProduct getProduct(String name, double volume, int temp) {
        for (Product product : productList) {
            if (product instanceof HotDrinkProduct) {
                if ((product.getName()).equals(name) &&
                        volume == ((HotDrinkProduct) product).getVolume() &&
                        temp == ((HotDrinkProduct) product).getTemp()) {
                    return (HotDrinkProduct) product;
                }
            }
        }
        throw new IllegalStateException("Product not found");
    }
}
