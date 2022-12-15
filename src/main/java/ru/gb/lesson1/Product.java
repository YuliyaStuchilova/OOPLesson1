package ru.gb.lesson1;

public class Product {
    private int idProduct;
    private String name;
    private double cost;
    private int number;

    public Product(int idProduct, String name, double cost, int number) {
        this.idProduct = idProduct;
        this.name = name;
        this.cost = cost;
        this.number = number;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void decreaseNumber(){
        this.number -=1;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", number=" + number +
                '}';
    }
}
