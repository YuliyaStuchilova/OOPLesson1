package ru.gb.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new BootleProduct(1,"Coca-Cola", 123.00,12, 1.5));
        productList.add(new BootleProduct(2,"Sprite", 150.00,15,1.0));
        productList.add(new ChocolateProduct(3,"Milka", 134.00,14,true));
        VendingMachine machine1= new VendingMachine(productList);

        //System.out.println(machine1);


        List<Product> hotDrinks = new ArrayList<>(
                Arrays.asList(
                        new HotDrinkProduct(1,"Latte",150.00,15,0.4,75),
                        new HotDrinkProduct(2,"Cappuccino",140.00,20,0.5,70),
                        new HotDrinkProduct(3,"Americano",100.00,25,0.2,85))
        );
        HotDrinkVendingMachine machineHotDrinks = new HotDrinkVendingMachine(hotDrinks);

        System.out.println(machineHotDrinks.getProduct("Cappuccino",0.5,70));
    }
}